package com.ganchaoa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class UserController {

	@RequestMapping(value = "/login" ,method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		
		return "admin/login";
	}

}
