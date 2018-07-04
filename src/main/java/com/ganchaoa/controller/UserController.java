package com.ganchaoa.controller;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ganchaoa.constant.Constant;
import com.ganchaoa.controller.exception.ExceptionHelper;
import com.ganchaoa.core.AbstractController;
import com.ganchaoa.entity.User;
import com.ganchaoa.entity.bo.RestResponseBo;
import com.ganchaoa.service.UserService;
import com.ganchaoa.util.Commons;
import com.ganchaoa.util.MyUtils;

@Controller
@RequestMapping("/admin")
public class UserController extends AbstractController{
	
	  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login" ,method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		
		return "admin/login";
	}

	@ResponseBody
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public RestResponseBo do_login(@RequestParam("username")String username, @RequestParam("password") String password, HttpServletRequest request, HttpServletResponse response) {
		Integer error_count = cache.get("login_error_count");
		try {
			User user = userService.login(username,password);
			request.getSession().setAttribute(Constant.LOGIN_SESSION_KEY, user);
			MyUtils.setCookie(response, user.getId());
		} catch (Exception e) {
			error_count = error_count == null ? 1 : error_count +1;
			if(error_count > 3) {
				  return RestResponseBo.fail("您输入密码已经错误超过3次，请10分钟后尝试");
			}
			cache.set("login_error_count", error_count, 10*60);
			String msg = "登陆失败";
			 return ExceptionHelper.handlerException(logger, msg, e);
		}
		return RestResponseBo.ok();
	}
	
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public void logout(HttpSession session,HttpServletRequest request, HttpServletResponse response) {
		session.removeAttribute(Constant.LOGIN_SESSION_KEY);
		Cookie cookie = new Cookie(Constant.USER_IN_COOKIE,"");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
		try {
			response.sendRedirect(Commons.site_log());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("管理首页");
		return "admin/index";
	}
}
