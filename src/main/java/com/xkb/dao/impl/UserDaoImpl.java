package com.xkb.dao.impl;

import org.springframework.stereotype.Repository;

import com.xkb.dao.IUserDao;
import com.xkb.entity.User;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午4:48:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User, String> implements IUserDao {

}
