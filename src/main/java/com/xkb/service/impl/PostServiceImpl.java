package com.xkb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xkb.dao.IPostDao;
import com.xkb.entity.Post;
import com.xkb.service.IPostService;



/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午7:00:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Service("postService")
public class PostServiceImpl extends BaseServiceImpl<Post, IPostDao, String> implements IPostService{

	@Autowired
	private IPostDao postDao;
	
	@Override
	protected IPostDao getDao() {
		return this.postDao;
	}
}
