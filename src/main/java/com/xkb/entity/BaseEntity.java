package com.xkb.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午4:08:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public BaseEntity() {
	}

	public BaseEntity(String id) {
		this.id = id;
	}

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
