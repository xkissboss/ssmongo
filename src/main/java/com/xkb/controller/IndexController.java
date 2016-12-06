package com.xkb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xkb.entity.Article;
import com.xkb.entity.User;
import com.xkb.service.IUserService;
import com.xkb.util.Page;

/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年11月29日 下午3:58:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Controller
public class IndexController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/update_username/{id}")
	public @ResponseBody long updateUserName(@PathVariable String id, String userName) {
		return userService.updateName(id, userName);
	}
	
	
	@RequestMapping("/user_list")
	public @ResponseBody List<User> userList(String name, String no) {
		return  userService.find(no, name);
	}
	
	
	@RequestMapping("/updateUser/{id}")
	public @ResponseBody User updateUser(@PathVariable String id, String userName) {
		User u = userService.findById(id);
		u.setUserName(userName);
		userService.saveOrUpdate(u);
		return u;
	}
	
	
	
	@RequestMapping("/insert_user")
	public @ResponseBody User insertUser() {
		User user = new User();
		user.setPassword("s43546521");
		user.setPhone("10086");
		user.setSex("男");
		user.setUserName("张三");
		user.setUserNo("xh1005");
		user.setCount(20);
		user.setCreateDate(new Date());
		userService.insert(user);
		return user;
	}
	
	@RequestMapping("/find_by_page")
	public @ResponseBody Page findByPage() {
		
		Page page = new Page();
		return userService.findByPage(page);
	}
	
	
	@RequestMapping("/insert_user2")
	public @ResponseBody List<User> insertUser2() {
		
		
		List<User> userList = new ArrayList<User>(); 
		for (int i = 0; i < 10; i++) {
			
			User user = new User();
			user.setPassword("s43546521" + i);
			user.setPhone("10086_" + i);
			user.setSex("男");
			user.setUserName("张三" + i);
			user.setUserNo("xh1005" + i);
			
			
			List<Article> artList = new ArrayList<Article>();
			
			artList.add(new Article(ObjectId.get().toString(), "title1", "context1"));
			artList.add(new Article(ObjectId.get().toString(), "title2", "context2"));
			
			user.setArtList(artList);
			
			userList.add(user);
		}
		userService.insertBatch(userList);
		return userList;
	}
	
	
	@RequestMapping("/find_by_id/{id}")
	public @ResponseBody User findById(@PathVariable String id) {
		if (StringUtils.isEmpty(id)) return null;
		return userService.findById(id);
	}
	
	@RequestMapping("/del/{id}")
	public @ResponseBody String deleteById(@PathVariable String id) {
		if (StringUtils.isEmpty(id)) return "false";
		return userService.deleteById(id) + "";
	}
	
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	
}
