package com.ganchaoa.controller.exception;

import org.slf4j.Logger;

import com.ganchaoa.entity.bo.RestResponseBo;
import com.ganchaoa.exception.TipException;

public class ExceptionHelper {

	public static RestResponseBo<?> handlerException(Logger logger, String msg, Exception e){
		if(e instanceof TipException) {
			msg = e.getMessage();
		}else {
			logger.error(msg,e);
		}
		return RestResponseBo.fail(msg);
	} 
}
