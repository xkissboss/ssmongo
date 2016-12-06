package com.xkb.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年12月5日 下午3:23:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Document(collection="t_post")
public class Post extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String title;
	
	private String context;
	
	private int viewTime;
	
	private int status;
	
	private Date createTime;
	
	private String adminId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public int getViewTime() {
		return viewTime;
	}

	public void setViewTime(int viewTime) {
		this.viewTime = viewTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public Post(String title, String context, int viewTime, int status,
			Date createTime, String adminId) {
		this.title = title;
		this.context = context;
		this.viewTime = viewTime;
		this.status = status;
		this.createTime = createTime;
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + ", context=" + context + ", viewTime="
				+ viewTime + ", status=" + status + ", createTime="
				+ createTime + ", adminId=" + adminId + ", getId()=" + getId()
				+ "]";
	}
	
}
