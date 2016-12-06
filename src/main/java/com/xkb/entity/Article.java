package com.xkb.entity;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午8:00:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public class Article extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public Article() {
	}

	public Article(String id, String title, String context) {
		super(id);
		this.title = title;
		this.context = context;
	}



	public Article(String title, String context) {
		this.title = title;
		this.context = context;
	}

	private String title;
	
	private String context;

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

	@Override
	public String toString() {
		return "Article [title=" + title + ", context=" + context + "]";
	}
	
}
