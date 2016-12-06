package com.xkb.dao.impl;

import org.springframework.stereotype.Repository;

import com.xkb.dao.IAdminDao;
import com.xkb.entity.Admin;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午4:48:27 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Repository("adminDao")
public class AdminrDaoImpl extends BaseDaoImpl<Admin, String> implements IAdminDao {

}
