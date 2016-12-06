package com.xkb.controller.admin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xkb.entity.Admin;
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
@RequestMapping("/admin/post")
@SessionAttributes("admin")
public class PostController {

	@Autowired
	private IPostService postService;
	
	@RequestMapping("/add")
	public @ResponseBody Result add(@ModelAttribute("admin")Admin admin) {
		Post post = new Post("肖老师", "这是内容 ", 0, 1, new Date(), admin.getId());
		postService.insert(post);
		return Result.buildSuccess("添加成功");
	}
	
}
