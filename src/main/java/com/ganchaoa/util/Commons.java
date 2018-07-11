package com.ganchaoa.util;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.ganchaoa.constant.Constant;

@Component
public class Commons {

	public static String site_log() {
		return "admin/login";
	}
	
	public static String site_url() {
		return site_url("/page/1");
	}

	private static String site_url(String sub) {
		return site_option("site_url") + sub;
	}

	private static String site_option(String key) {
		return site_option(key, "");
	}

	private static String site_option(String key, String defaultValue) {
		if(StringUtils.isEmpty(key)) {
			return "";
		}
		String str = Constant.initConfig.get(key);
		if(StringUtils.isEmpty(str)) {
			return defaultValue;
		}else {
			return str;
		}
	} 
	
	public static String gravatar(String email) {
		String gravatarUrl ="https://secure.gravatar.com/avatar";
		if(StringUtils.isEmpty(email)) {
			return gravatarUrl;
		}else {
			String hash = MyUtils.MD5encode(email);
			return gravatarUrl + "/" + hash;
		}
	}
	
}
