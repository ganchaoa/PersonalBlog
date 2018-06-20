package com.ganchaoa.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}
