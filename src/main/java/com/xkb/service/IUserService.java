package com.xkb.service;

import java.util.List;

import com.xkb.entity.User;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午6:59:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface IUserService extends IBaseService<User, String>{

	public List<User> find(String userNo, String userName);
	
	public long updateName(String id, String userName);
}
