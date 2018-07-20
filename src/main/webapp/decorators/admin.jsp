<%--
  Created by IntelliJ IDEA.
  User: rin
  Date: 7/10/18
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<html>
<head>
    <title><dec:title default="Admin"></dec:title></title>
    <link href="/template/amdin/css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
    <script src="/template/amdin/js/jquery-1.11.0.min.js"></script>
    <!--Custom-Theme-files-->
    <!--theme-style-->
    <link href="/template/amdin/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!--start-menu-->
    <script src="/template/amdin/js/simpleCart.min.js"> </script>
    <link href="/template/amdin/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="/template/amdin/js/memenu.js"></script>
    <script>$(document).ready(function(){$(".memenu").memenu();});</script>
    <!--dropdown-->
    <script src="/template/amdin/js/jquery.easydropdown.js"></script>
    <dec:head/>
</head>
<body>
    <%@include file="/common/admin/header.jsp"%>
    <%@include file="/common/admin/logo.jsp"%>
    <%@include file="/common/admin/menu.jsp"%>
    <%@include file="/common/admin/banner.jsp"%>
    <dec:body>
    </dec:body>
    <%@include file="/common/admin/footer.jsp"%>
</body>
</html>
