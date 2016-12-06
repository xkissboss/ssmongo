package com.xkb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xkb.entity.Post;
import com.xkb.service.IPostService;
import com.xkb.support.Result;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年12月5日 下午3:02:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Controller
@RequestMapping("/post")
public class PostsController {

	@Autowired
	private IPostService postService;
	
	@RequestMapping("/{id}")
	public @ResponseBody Result detail(@PathVariable String id) {
		Post post = postService.findById(id);
		return Result.buildByData(post);
	}
	
}
