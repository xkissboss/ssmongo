package com.xkb.support;
/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年12月5日 下午3:08:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public enum Code {

	FAIL(0, "失败"), SUCCESS(1, "成功");
	
	private int code;

	private String desc;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	private Code(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	
	
}
