package com.xkb.service;

import com.xkb.entity.Admin;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午6:59:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
public interface IAdminService extends IBaseService<Admin, String>{

	public Admin findByLogin(String email, String pwd);
}
