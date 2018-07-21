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
    <title><dec:title default="Home Page"></dec:title></title>
    <link href="/template/web/css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
    <!--jQuery(necessary for Bootstrap's JavaScript plugins)-->
    <script src="/template/web/js/jquery-1.11.0.min.js"></script>
    <!--Custom-Theme-files-->
    <!--theme-style-->
    <link href="/template/web/css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Luxury Watches Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);

    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <!--start-menu-->
    <script src="/template/web/js/simpleCart.min.js"></script>
    <link href="/template/web/css/memenu.css" rel="stylesheet" type="text/css" media="all"/>
    <script type="text/javascript" src="/template/web/js/memenu.js"></script>
    <script>$(document).ready(function () {
        $(".memenu").memenu();
    });</script>
    <!--dropdown-->
    <script src="/template/web/js/jquery.easydropdown.js"></script>
    <dec:head/>
</head>
<body>
    <%@include file="/common/web/header.jsp" %>
    <%@include file="/common/web/logo.jsp" %>
    <%@include file="/common/web/menu.jsp" %>
    <dec:body>

    </dec:body>
    <%@include file="/common/web/footer.jsp" %>
</body>
</html>
