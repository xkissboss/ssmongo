package com.xkb.support;

import java.util.Collection;

/**
 * @Description:
 * @author 作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年12月5日 下午3:06:38
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class Result {

	private int code;

	private String message;

	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Result(Code code, String message, Object data) {
		this.code = code.getCode();
		this.message = message;
		this.data = data;
	}

	public static Result buildSuccess(String message, Object object) {
		Result rs = new Result(Code.SUCCESS, message, object);
		return rs;
	}

	public static Result buildSuccess(Object object) {
		Result rs = new Result(Code.SUCCESS, "", object);
		return rs;
	}

	public static Result buildSuccess(String message) {
		Result rs = new Result(Code.SUCCESS, message, null);
		return rs;
	}

	public static Result buildSuccess() {
		Result rs = new Result(Code.SUCCESS, "执行成功", null);
		return rs;
	}

	public static Result buildFail(String message) {
		Result rs = new Result(Code.FAIL, message, null);
		return rs;
	}

	public static Result buildFail(String message, Object object) {
		Result rs = new Result(Code.FAIL, message, object);
		return rs;
	}

	public static Result buildFail(Object object) {
		Result rs = new Result(Code.FAIL, "", object);
		return rs;
	}

	public static Result buildFail() {
		Result rs = new Result(Code.FAIL, "执行失败", null);
		return rs;
	}
	
	public static Result buildByData(Object data) {
		if (data == null)  // 如果为空则为失败 
			return Result.buildFail();
		if (data instanceof Collection && ((Collection<?>)data).isEmpty()) // 如果为空集合则为失败
			return Result.buildFail();
		return Result.buildSuccess(data);
	}
}
