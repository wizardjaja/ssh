<%@page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <script type="text/javascript" src="js/libs/modernizr.min.js"></script>
    <script type="text/javascript">
    	function allChoose() {
			var allcheck = document.getElementById("allck");
			var idcks = document.getElementsByName("ids");
			if(allcheck.checked == true){
				for(var i=0; i<idcks.length; i++){
					idcks[i].checked = true;
				}
			}
			else{
				for(var i=0; i<idcks.length; i++){
					idcks[i].checked = false;
				}
			}
		}
    	function toPage(){
    		var fm = document.getElementById("myform");
    		var redPage = document.getElementById("redPage").value;
			fm.action="userAction.action?currentPage="+redPage;
			fm.submit();
    	}
    </script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="index.html">首页</a></li>
                <li><a href=" " target="_blank">网站首页</a></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                        <li><a href="userAction.action"><i class="icon-font">&#xe008;</i>用户管理</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe006;</i>产品类别</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe005;</i>产品管理</a></li>
                        <li><a href="ordersAction.action"><i class="icon-font">&#xe005;</i>订单管理</a></li>
                        <li><a href="adminAction.action"><i class="icon-font">&#xe005;</i>管理员管理</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe012;</i>评论管理</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe052;</i>友情链接</a></li>
                        <li><a href="design.html"><i class="icon-font">&#xe033;</i>广告管理</a></li> 
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
                    <ul class="sub-menu">
                        <li><a href="system.html"><i class="icon-font">&#xe017;</i>系统设置</a></li> 
                        <li><a href="system.html"><i class="icon-font">&#xe046;</i>数据备份</a></li>
                        <li><a href="system.html"><i class="icon-font">&#xe045;</i>数据还原</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="index.html">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">用户管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="#" method="post">
                    <table class="search-tab">
                        <tr>
                            <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="关键字" name="keywords" value="" id="" type="text"></td>
                            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <form action="userAction!deleteUsers.action" name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="addUser.jsp"><i class="icon-font"></i>增加订单</a>
                        <input type="submit" value="批量删除"> 
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                            <th class="tc" width="5%"><input class="allChoose" id="allck" type="checkbox" onclick="allChoose()"></th>
                            <th>ID</th>
                            <th>订单编号</th>
                            <th>接收时间</th> 
                            <th>用户</th>
                            <th>订单状态</th>
                            <th>操作</th>
                        </tr>
                        <s:iterator value="page.data">
                        <tr>
                            <td class="tc"><input name="ids" value="${id}" type="checkbox"></td>
                            <td><s:property value="id"/></td>
                            <td><s:property value="ordersNo"/></td>
                            <td><s:property value="receiveTime"/></td>
                            <td><s:property value="user"/></td>
                            <td><s:property value="status"/></td>
                            <td>
                                <a class="link-update" href="userAction!findUserById.action?id=${id}">修改</a>
                                <a class="link-del" href="userAction!delete.action?id=${id}">删除</a>
                            </td>
                        </tr> 
                        </s:iterator>
                    </table>
                    <div class="list-page"> 2 条 1/1 页
                    	${page.allRow }条   ${page.currentPage }/${page.totalPage }页
                    	<s:if test="page.hasPrePage"><a href="userAction.action?currentPage=${currentPage-1 }">上一页</a></s:if>
                    	<s:if test="page.hasNextPage"><a href="userAction.action?currentPage=${currentPage+1 }">下一页</a></s:if>
                    	<input type="text" id="redPage" placeholder="${page.currentPage }" style="width: 5%"/>
                    	<input type="button" id="toPageBtn" value="转到" onclick="toPage()"/>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>