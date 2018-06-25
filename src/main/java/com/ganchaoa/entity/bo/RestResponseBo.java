package com.ganchaoa.entity.bo;

public class RestResponseBo<T> {

	private T payload;

	private boolean success;

	private String msg;

	private long timestamp;

	private int code = -1;

	public RestResponseBo() {
		this.timestamp = System.currentTimeMillis() / 1000;
	}

	public RestResponseBo(boolean success) {
		this.timestamp = System.currentTimeMillis() / 1000;
		this.success = success;
	}

	public RestResponseBo(boolean success, T payload) {
		this.timestamp = System.currentTimeMillis() / 1000;
		this.success = success;
		this.payload = payload;
	}

	public RestResponseBo(boolean success, T payload, int code) {
		this.timestamp = System.currentTimeMillis() / 1000;
		this.success = success;
		this.payload = payload;
		this.code = code;
	}

	public RestResponseBo(boolean success, String msg) {
		this.timestamp = System.currentTimeMillis() / 1000;
		this.success = success;
		this.msg = msg;
	}

	public RestResponseBo(boolean success, String msg, int code) {
		this.timestamp = System.currentTimeMillis() / 1000;
		this.success = success;
		this.msg = msg;
		this.code = code;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public static RestResponseBo<?> ok() {
		return new RestResponseBo<Object>(true);
	}

	public static <T> RestResponseBo<T> ok(T payload) {
		return new RestResponseBo<T>(true, payload);
	}

	public static <T> RestResponseBo<?> ok(int code) {
		return new RestResponseBo<Object>(true, null, code);
	}

	public static <T> RestResponseBo<T> ok(T payload, int code) {
		return new RestResponseBo<T>(true, payload, code);
	}

	public static RestResponseBo<?> fail() {
		return new RestResponseBo<Object>(false);
	}

	public static RestResponseBo<?> fail(String msg) {
		return new RestResponseBo<Object>(false, msg);
	}

	public static RestResponseBo<?> fail(int code) {
		return new RestResponseBo<Object>(false, null, code);
	}

	public static RestResponseBo<?> fail(int code, String msg) {
		return new RestResponseBo<Object>(false, msg, code);
	}
}
