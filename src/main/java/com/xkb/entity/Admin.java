package com.xkb.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年12月5日 下午3:20:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Document(collection="t_admin")
public class Admin extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String userName;
	
	private String pwd;
	
	private String email;
	
	private Date createDate;
	
	private String image;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Admin(String userName, String pwd, String email, Date createDate,
			String image) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.email = email;
		this.createDate = createDate;
		this.image = image;
	}

	
	
	public Admin() {
	}

	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", pwd=" + pwd + ", email="
				+ email + ", createDate=" + createDate + ", image=" + image
				+ ", getId()=" + getId() + "]";
	}

	
	
}
