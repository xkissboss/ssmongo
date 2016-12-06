package com.xkb.controller.admin;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.xkb.entity.Admin;
import com.xkb.service.IAdminService;
import com.xkb.support.Result;
/** 
 * @Description: 
 * @author  作者 E-mail: xiaozhenqing@henhaoji.com, IM：6530
 * @date 创建时间：2016年12月5日 下午3:01:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@Controller
@RequestMapping("/admin")
@SessionAttributes("admin")
public class AdminController {

	@Autowired
	private IAdminService adminService;
	
	@RequestMapping("")
	public String index(@ModelAttribute("admin")Admin admin, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (null == session.getAttribute("admin"))
			return "admin/login";
		return "admin/home";
	}
	
	@RequestMapping("/login")
	public @ResponseBody Result login(HttpServletRequest request, HttpServletResponse response, String email, String pwd) {
		if (StringUtils.isEmpty(email))
			return Result.buildFail("邮箱不能为空");
		if (StringUtils.isEmpty(pwd))
			return Result.buildFail("密码不能为空");
		Admin admin = adminService.findByLogin(email, pwd);
		if (admin == null)
			return Result.buildFail("账号/密码不正确");
		HttpSession session = request.getSession();
		session.setAttribute("admin", admin);
		return Result.buildSuccess("登录成功", admin);
	}
	
	@RequestMapping("/add_admin")
	public @ResponseBody Result addAdmin() {
		
		Admin admin = new Admin("张三", "123456", "zhangsan@henhaoji.com", new Date(), "");
		adminService.insert(admin);
		return Result.buildSuccess("增加成功");
	}
}

