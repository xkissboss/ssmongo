package com.xkb.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午4:16:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Document(collection="t_user")
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userNo;
	
	private String userName;
	
	private String phone;
	
	private String sex;
	
	private String password;
	
	private Date createDate;
	
	private long count;
	
	private List<Article> artList;
	
	

	public User() {
	}

	public User(String userNo, String userName, String phone, String sex,
			String password) {
		this.userNo = userNo;
		this.userName = userName;
		this.phone = phone;
		this.sex = sex;
		this.password = password;
	}
	
	

	public User(String userNo, String userName, String phone, String sex,
			String password, List<Article> artList) {
		this.userNo = userNo;
		this.userName = userName;
		this.phone = phone;
		this.sex = sex;
		this.password = password;
		this.artList = artList;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Article> getArtList() {
		return artList;
	}

	public void setArtList(List<Article> artList) {
		this.artList = artList;
	}

	

	@Override
	public String toString() {
		return "User [userNo=" + userNo + ", userName=" + userName + ", phone="
				+ phone + ", sex=" + sex + ", password=" + password
				+ ", createDate=" + createDate + ", count=" + count
				+ ", artList=" + artList + "]";
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}
