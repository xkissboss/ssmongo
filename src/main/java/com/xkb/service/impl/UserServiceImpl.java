package com.xkb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.xkb.dao.IUserDao;
import com.xkb.entity.User;
import com.xkb.service.IUserService;



/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午7:00:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User, IUserDao, String> implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	protected IUserDao getDao() {
		return this.userDao;
	}

	@Override
	public List<User> find(String userNo, String userName) {
		Query query = new Query();
		query.fields().include("phone");
		query.addCriteria(new Criteria("userNo").is(userNo).and("userName").is(userName));
//		BsonDocument bd;
//		new Criteria("").alike(new ExampleMatcher)
		//new Query(new Criteria().orOperator(Criteria.where("onumber").is("002"),Criteria.where("cname").is("zcy"))),entityClass); 
		return userDao.find(query);
	}

	@Override
	public long updateName(String id, String userName) {
		Update update = new Update();
		update.set("userName", userName);
		return userDao.updateById(id, update);
	}

}
