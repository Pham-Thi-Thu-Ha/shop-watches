<%--
  Created by IntelliJ IDEA.
  User: rin
  Date: 7/21/18
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>

<c:url var="webRegister" value="/web-register.html" >
</c:url>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--start-breadcrumbs-->
<div class="breadcrumbs">
    <div class="container">
        <div class="breadcrumbs-main">
            <ol class="breadcrumb">
                <li><a href="index.html">Home</a></li>
                <li class="active">Account</li>
            </ol>
        </div>
    </div>
</div>
<!--end-breadcrumbs-->
<!--account-starts-->
<div class="account">
    <div class="container">
        <div class="account-top heading">
            <h2>ACCOUNT</h2>
        </div>
        <div class="account-main">
            <div class="col-md-6 account-left">
                <h3>Existing User</h3>
                <div class="account-bottom">
                    <input placeholder="Email" type="text" tabindex="3" required>
                    <input placeholder="Password" type="password" tabindex="4" required>
                    <div class="address">
                        <a class="forgot" href="#">Forgot Your Password?</a>
                        <input type="submit" value="Login">
                    </div>
                </div>
            </div>
            <div class="col-md-6 account-right account-left">
                <h3>New User? Create an Account</h3>
                <p>By creating an account with our store, you will be able to move through the checkout process faster, store multiple shipping addresses, view and track your orders in your account and more.</p>
                <a href="${webRegister}">Create an Account</a>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--account-end-->
</body>
</html>
