package com.ganchaoa.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.ganchaoa.constant.Constant;
import com.ganchaoa.entity.User;

public class MyUtils {

	public static final Logger logger = LoggerFactory.getLogger(MyUtils.class);
	
	
	public static User getCurrentUser(HttpServletRequest request ) {
		HttpSession session = request.getSession();
		if(session != null) {
			Object user = session.getAttribute(Constant.LOGIN_SESSION_KEY);
			return (User)user;
		}
		return null;
	} 
	
	 public static String MD5encode(String source) {
	        if (StringUtils.isEmpty(source)) {
	            return null;
	        }
	        MessageDigest messageDigest = null;
	        try {
	            messageDigest = MessageDigest.getInstance("MD5");
	        } catch (NoSuchAlgorithmException e) {
	        }
	        byte[] encode = messageDigest.digest(source.getBytes());
	        StringBuffer hexString = new StringBuffer();
	        for (byte anEncode : encode) {
	            String hex = Integer.toHexString(0xff & anEncode);
	            if (hex.length() == 1) {
	                hexString.append('0');
	            }
	            hexString.append(hex);
	        }
	        return hexString.toString();

	    }
	 
	public static void  setCookie(HttpServletResponse response, Integer id) {
		String value = Tools.enAES(id.toString(), Constant.AES_SALT);
		boolean isSSL = false;
		Cookie cookie = new Cookie(Constant.USER_IN_COOKIE,value);
		cookie.setPath("/");
		cookie.setMaxAge(12*60*60);
		cookie.setSecure(isSSL);
		response.addCookie(cookie);
	}
}
