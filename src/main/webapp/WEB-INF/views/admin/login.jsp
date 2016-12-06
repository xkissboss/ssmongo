<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=path%>/static/admin/css/style.css" rel='stylesheet'
	type='text/css' />
<link
	href='http://fonts.useso.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,400,300,600,700,800'
	rel='stylesheet' type='text/css'>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="application/x-javascript">
	addEventListener("load", function() {
	 setTimeout(hideURLbar, 0); 
	 }, false
	);
	function hideURLbar(){ 
	 window.scrollTo(0,1); 
	} 
</script>

<title>登录</title>
</head>
<body>
	<h1>后台登录</h1>
	<div class="app-location">
		<h2>Welcome to Locaticus</h2>
		<div class="line">
			<span></span>
		</div>
		<div class="location">
			<img src="<%=path%>/static/admin/images/location.png" class="img-responsive" alt="" />
		</div>
		<form>
			<input type="text" class="text" value="E-mail address"
				onfocus="this.value = '';"
				onblur="if (this.value == '') {this.value = 'E-mail address';}">
			<input type="password" value="Password" onfocus="this.value = '';"
				onblur="if (this.value == '') {this.value = 'Password';}">
			<div class="submit">
				<input type="submit" onclick="myFunction()" value="Sign in">
			</div>
			<div class="clear"></div>
			<div class="new">
				<h3>
					<a href="#">Forgot password ?</a>
				</h3>
				<h4>
					<a href="#">New here ? Sign Up</a>
				</h4>
				<div class="clear"></div>
			</div>
		</form>
	</div>
	<!--start-copyright-->
	<div class="copy-right">
		<p>
			Copyright &copy; 2015.Company name All rights reserved.<a
				target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a>
		</p>
	</div>
	<!--//end-copyright-->
</body>
</html>