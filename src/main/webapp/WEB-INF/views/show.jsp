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
<title>show</title>
<meta name="keywords" content="">
<meta name="description" content="">
<%@include file="include/cssjs.html"%>
</head>
<body class="user-select single">
	<%-- 头部--%>
	<%@include file="include/head.html"%>
	<section class="container">
	<div class="content-wrap">
		<div class="content">
			<header class="article-header">
			<h1 class="article-title">
				<a href="#" title="${post.details }">${post.details }</a>
			</h1>
			<div class="article-meta">
				<span class="item article-meta-time"> <time class="time"
						data-toggle="tooltip" data-placement="bottom" title=""
						data-original-title="发表时间：2016-10-14"> <i
						class="glyphicon glyphicon-time"></i> 2016-10-14</time>
				</span> <span class="item article-meta-source" data-toggle="tooltip"
					data-placement="bottom" title="" data-original-title="来源：木庄网络博客"><i
					class="glyphicon glyphicon-globe"></i> 木庄网络博客</span> <span
					class="item article-meta-category" data-toggle="tooltip"
					data-placement="bottom" title="" data-original-title="MZ-NetBlog主题"><i
					class="glyphicon glyphicon-list"></i> <a href="#"
					title="MZ-NetBlog主题">MZ-NetBlog主题</a></span> <span
					class="item article-meta-views" data-toggle="tooltip"
					data-placement="bottom" title="" data-original-title="浏览量：219"><i
					class="glyphicon glyphicon-eye-open"></i> 219</span> <span
					class="item article-meta-comment" data-toggle="tooltip"
					data-placement="bottom" title="" data-original-title="评论量"><i
					class="glyphicon glyphicon-comment"></i> 4</span>
			</div>
			</header>
			<article class="article-content">
			<p>
				<img data-original="<%=path %>/static/images/201610181557196870.jpg"
					src="<%=path %>/static/images/201610181557196870.jpg" alt="" />
			</p>
			<p>${post.title }</p>
			<pre class="prettyprint lang-cs">内容：
				${post.details }
			</pre>
			<div class="bdsharebuttonbox">
				<a href="#" class="bds_more" data-cmd="more"></a><a href="#"
					class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a><a href="#"
					class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a><a href="#"
					class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a><a href="#"
					class="bds_weixin" data-cmd="weixin" title="分享到微信"></a><a href="#"
					class="bds_tieba" data-cmd="tieba" title="分享到百度贴吧"></a><a href="#"
					class="bds_sqq" data-cmd="sqq" title="分享到QQ好友"></a>
			</div>

			<script>
				window._bd_share_config = {
					"common" : {
						"bdSnsKey" : {},
						"bdText" : "",
						"bdMini" : "2",
						"bdMiniList" : false,
						"bdPic" : "",
						"bdStyle" : "1",
						"bdSize" : "32"
					},
					"share" : {}
				};
				with (document)
					0[(getElementsByTagName('head')[0] || body)
							.appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=0.js?cdnversion='
							+ ~(-new Date() / 36e5)];
			</script> </article>
			<div class="article-tags">
				标签：<a href="#list/2/" rel="tag">DTcms博客</a><a href="#list/3/"
					rel="tag">木庄网络博客</a><a href="#list/4/" rel="tag">独立博客</a><a
					href="#list/5/" rel="tag">修复优化</a>
			</div>
			<div class="relates">
				<div class="title">
					<h3>相关推荐</h3>
				</div>
				<ul>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
					<li><a href="#" title="">用DTcms做一个独立博客网站（响应式模板）-MZ-NetBlog主题</a></li>
				</ul>
			</div>
			<div class="title" id="comment">
				<h3>评论</h3>
			</div>
			<div id="respond">
				<form id="comment-form" name="comment-form" action="" method="POST">
					<div class="comment">
						<input name="" id="" class="form-control" size="22"
							placeholder="您的昵称（必填）" maxlength="15" autocomplete="off"
							tabindex="1" type="text"> <input name="" id=""
							class="form-control" size="22" placeholder="您的网址或邮箱（非必填）"
							maxlength="58" autocomplete="off" tabindex="2" type="text">
						<div class="comment-box">
							<textarea placeholder="您的评论或留言（必填）" name="comment-textarea"
								id="comment-textarea" cols="100%" rows="3" tabindex="3"></textarea>
							<div class="comment-ctrl">
								<div class="comment-prompt" style="display: none;">
									<i class="fa fa-spin fa-circle-o-notch"></i> <span
										class="comment-prompt-text">评论正在提交中...请稍后</span>
								</div>
								<div class="comment-success" style="display: none;">
									<i class="fa fa-check"></i> <span class="comment-prompt-text">评论提交成功...</span>
								</div>
								<button type="submit" name="comment-submit" id="comment-submit"
									tabindex="4">评论</button>
							</div>
						</div>
					</div>
				</form>

			</div>
			<div id="postcomments">
				<ol id="comment_list" class="commentlist">
					<li class="comment-content"><span class="comment-f">#2</span>
						<div class="comment-main">
							<p>
								<a class="address" href="#" rel="nofollow" target="_blank">木庄网络博客</a><span
									class="time">(2016/10/28 11:41:03)</span><br>不错的网站主题，看着相当舒服
							</p>
						</div></li>
					<li class="comment-content"><span class="comment-f">#1</span>
						<div class="comment-main">
							<p>
								<a class="address" href="#" rel="nofollow" target="_blank">木庄网络博客</a><span
									class="time">(2016/10/14 21:02:39)</span><br>博客做得好漂亮哦！
							</p>
						</div></li>
				</ol>
			</div>
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
		<div class="widget widget_sentence">

			<a href="#" target="_blank" rel="nofollow" title="MZ-NetBlog主题">
				<img style="width: 100%" src="<%=path %>/static/images/ad.jpg"
				alt="MZ-NetBlog主题">
			</a>

		</div>
		<div class="widget widget_sentence">

			<a href="#" target="_blank" rel="nofollow" title="专业网站建设"> <img
				style="width: 100%" src="<%=path %>/static/images/201610241224221511.jpg"
				alt="专业网站建设"></a>

		</div>
	</div>
	</section>

	<%@include file="include/foot.html"%>
</body>
</html>