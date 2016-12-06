package com.xkb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.xkb.dao.IAdminDao;
import com.xkb.entity.Admin;
import com.xkb.service.IAdminService;



/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午7:00:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("adminService")
public class AdminServiceImpl extends BaseServiceImpl<Admin, IAdminDao, String> implements IAdminService{

	@Autowired
	private IAdminDao adminDao;
	
	@Override
	protected IAdminDao getDao() {
		return this.adminDao;
	}

	@Override
	public Admin findByLogin(String email, String pwd) {
		Query query = new Query();
		query.addCriteria(new Criteria("email").is(email).and("pwd").is(pwd));
		return adminDao.findOne(query);
	}
}
