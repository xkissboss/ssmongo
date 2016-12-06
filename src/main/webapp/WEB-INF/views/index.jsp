<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>老肖博客</title>
<meta name="keywords" content="">
<meta name="description" content="">
<%@include file="include/cssjs.html"%>
</head>
<body class="user-select">
	<%-- 头部--%>
	<%@include file="include/head.html"%>
	<section class="container">
	<div class="content-wrap">
		<div class="content">
			<div id="focusslide" class="carousel slide" data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#focusslide" data-slide-to="0" class="active"></li>
					<li data-target="#focusslide" data-slide-to="1"></li>
				</ol>
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<a href="#" target="_blank" title="木庄网络博客源码"> <img
							src="<%=path %>/static/images/201610181557196870.jpg" alt="木庄网络博客源码"
							class="img-responsive"></a>
					</div>
					<div class="item">
						<a href="#" target="_blank" title="专业网站建设"> <img
							src="<%=path %>/static/images/201610241227558789.jpg" alt="专业网站建设"
							class="img-responsive"></a>
					</div>
				</div>
				<a class="left carousel-control" href="#focusslide" role="button"
					data-slide="prev" rel="nofollow"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">上一个</span>
				</a> <a class="right carousel-control" href="#focusslide" role="button"
					data-slide="next" rel="nofollow"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">下一个</span>
				</a>
			</div>
			<article class="excerpt-minic excerpt-minic-index">
			<h2>
				<span class="red">【推荐】</span><a target="_blank" href="#"
					title="用DTcms做一个独立博客网站（响应式模板）">用DTcms做一个独立博客网站（响应式模板）</a>
			</h2>
			<p class="note">用DTcms做一个独立博客网站（响应式模板），采用DTcms
				V4.0正式版（MSSQL）。开发环境：SQL2008R2+VS2010。DTcms
				V4.0正式版功能修复和优化：1、favicon.ico图标后台上传。（解决要换图标时要连FTP或者开服务器的麻烦）</p>
			</article>
			<div class="title">
				<h3>最新发布</h3>
				<div class="more">
					<a href="#" title="MZ-NetBlog主题">MZ-NetBlog主题</a> <a href="#"
						title="IT技术笔记">IT技术笔记</a> <a href="#" title="源码分享">源码分享</a> <a
						href="#" title="靠谱网赚">靠谱网赚</a> <a href="#" title="资讯分享">资讯分享</a>
				</div>
			</div>
			<article class="excerpt excerpt-1" style=""> <a
				class="focus" href="#" title="用DTcms做一个独立博客网站（响应式模板）"
				target="_blank"><img class="thumb"
				data-original="<%=path %>/static/images/201610181739277776.jpg"
				src="<%=path %>/static/images/201610181739277776.jpg"
				alt="用DTcms做一个独立博客网站（响应式模板）" style="display: inline;"></a> <header>
			<a class="cat" href="#" title="MZ-NetBlog主题">MZ-NetBlog主题<i></i></a>
			<h2>
				<a href="#" title="用DTcms做一个独立博客网站（响应式模板）" target="_blank">用DTcms做一个独立博客网站（响应式模板）</a>
			</h2>
			</header>
			<p class="meta">
				<time class="time"> <i class="glyphicon glyphicon-time"></i>
				2016-10-14</time>
				<span class="views"><i class="glyphicon glyphicon-eye-open"></i>
					216</span> <a class="comment" href="##comment" title="评论" target="_blank"><i
					class="glyphicon glyphicon-comment"></i> 20</a>
			</p>
			<p class="note">用DTcms做一个独立博客网站（响应式模板），采用DTcms
				V4.0正式版（MSSQL）。开发环境：SQL2008R2+VS2010。DTcms
				V4.0正式版功能修复和优化：1、favicon.ico图标后台上传。（解决要换图标时要连FTP或者开服务器的麻烦）</p>
			</article>
			<nav class="pagination" style="display: none;">
			<ul>
				<li class="prev-page"></li>
				<li class="active"><span>1</span></li>
				<li><a href="?page=2">2</a></li>
				<li class="next-page"><a href="?page=2">下一页</a></li>
				<li><span>共 2 页</span></li>
			</ul>
			</nav>
		</div>
	</div>
	<div class="sidebar">
	<div class="fixed">
		<%-- 站点信息--%>
		<%@include file="include/site_info.html"%>
		<%-- 站点信息--%>
		<%@include file="include/search.html"%>
	</div>
	<%-- 最新评论文章--%> 
	<%@include file="include/new_review_article.html"%>

	<!-- 	<div class="widget widget_sentence">
		<a href="#" target="_blank" rel="nofollow" title="专业网站建设"> <img
			style="width: 100%" src="<%=path %>/static/images/201610241224221511.jpg"
			alt="专业网站建设"></a>
	</div> -->
	<div class="widget widget_sentence">
		<a href="#" target="_blank" rel="nofollow" title="MZ-NetBlog主题"> <img
			style="width: 100%" src="<%=path %>/static/images/ad.jpg" alt="MZ-NetBlog主题">
		</a>
	</div>
	<div class="widget widget_sentence">
		<h3>友情链接</h3>
		<div class="widget-sentence-link">
			<a href="#" title="网站建设" target="_blank">网站建设</a>&nbsp;&nbsp;&nbsp;
		</div>
	</div>
	</div> </section>
	<%@include file="include/foot.html"%>
</body>
</html>