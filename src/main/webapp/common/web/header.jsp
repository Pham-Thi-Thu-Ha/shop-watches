
<c:url value="/check-out.html" var="webCheckOut">
</c:url>

<c:url value="/web-home.html" var="webHome">
</c:url>

<c:url var="webProducts" value="/products.html" >
    <c:param name="type" value="products"></c:param>
</c:url>

<c:url var="webLogin" value="/login.html" >

</c:url>

<c:url var="webContact" value="/web-contact.html" >

</c:url>

<c:url var="webLogin2" value="/web-login2.html" >

</c:url>


<!--top-header-->
<div class="top-header">
    <div class="container">
        <div class="top-header-main">
            <div class="col-md-6 top-header-left">
                <div class="drop">
                    <div class="box">
                        <select tabindex="4" class="dropdown drop">
                            <option value="" class="label">Dollar :</option>
                            <option value="1">Dollar</option>
                            <option value="2">Euro</option>
                        </select>
                    </div>
                    <div class="box1">
                        <select tabindex="4" class="dropdown">
                            <option value="" class="label">English :</option>
                            <option value="1">English</option>
                            <option value="2">French</option>
                            <option value="3">German</option>
                        </select>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="col-md-6 top-header-left">
                <div class="cart box_1">
                    <a href="${webCheckOut}">
                        <div class="total">
                            <span class="simpleCart_total"></span></div>
                        <img src="/template/web/images/cart-1.png" alt="" />
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>
                    <div class="clearfix"> </div>
                </div>

                <div class="cart box_1">
                    <a href="${webLogin}">
                        <div class="total">
                            <span class="simpleCart_total"></span></div>
                        <img src="/template/web/images/cart-1.png" alt="" />
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">My Account</a></p>
                    <div class="clearfix"> </div>
                </div>

                <div class="cart box_1">
                    <a href="${webLogin2}">
                        <div class="total">
                            <span class="simpleCart_total"></span></div>
                        <img src="/template/web/images/cart-1.png" alt="" />
                    </a>
                    <p><a href="javascript:;" class="simpleCart_empty">My Account 2</a></p>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--top-header-->