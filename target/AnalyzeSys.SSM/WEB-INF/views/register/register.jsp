<%@ page contentType="text/html;charset=UTF-8"%>
<%@include file="/WEB-INF/base.jsp" %>
<html>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css">
<link href="../../../css/signin.css" rel="stylesheet">
<link href="../../../css/style1.css" rel="stylesheet">
<script src="../../../js/jquery-1.7.1.min.js"></script>
<script src="../../../js/ui.js"></script>
<script type="text/javascript">baselocation="${ctx}"</script>

<title>欢迎注册音像购物商城</title>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%--<link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <script src="../../../js/jquery-1.7.1.min.js"></script>
    <script src="../../../js/bootstrap.min.js"></script>--%>
    <title>欢迎注册音像购物商城</title>
</head>
<body>


<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <p class="navbar-brand">
                <font size="5">音像购物商城</font>
            </p>
        </div>
    </div>
</nav>

<div class="container" style="margin-top: 80px;">
    <div class="col-md-6 col-md-offset-3">
        <form class="">

            <div class="form-group has-feedback">
                <label for="loginName">用户名*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-user"></span>
                        </span>
                    <input id="loginName" name="identity" class="form-control" placeholder="请输入注册用户名" maxlength="20" type="text" required="" >
                </div>
                <span id="id-message" style="color: red; font-size: small;"></span>
            </div>

            <div class="form-group has-feedback">
                <label for="loginPassword">密码*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-lock"></span>
                        </span>
                    <input id="loginPassword" class="form-control" name="password" placeholder="请输入密码" maxlength="20" type="password" required="">
                </div>
                <span id="password-message" style="color: red; font-size: small;"></span>
            </div>

            <div class="form-group has-feedback">
                <label for="passwordConfirm">确认密码*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-lock"></span>
                        </span>
                    <input id="passwordConfirm" class="form-control" name="chkpassword" placeholder="请再次输入密码" maxlength="20" type="password" required="">
                </div>
                <span id="repassword-message" style="color: red; font-size: small;"></span>
            </div>

            <div class="form-group has-feedback">
                <label for="cus_name">个人姓名*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-user"></span>
                        </span>
                    <input id="cus_name" name="identity" class="form-control" placeholder="请输入用户姓名" maxlength="20" type="text" required="" >
                </div>
                <span id="cus_name-message" style="color: red; font-size: small;"></span>
            </div>

            <div class="form-group has-feedback">
                <label for="cus_phone">个人电话*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-user"></span>
                        </span>
                    <input id="cus_phone" name="identity" class="form-control" placeholder="请输入手机号码" maxlength="20" type="text" required="" >
                </div>
                <span id="cus_phone-message" style="color: red; font-size: small;"></span>
            </div>

            <div class="form-group has-feedback">
                <label for="cus_address">用户地址*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-user"></span>
                        </span>
                    <input id="cus_address" class="form-control"  placeholder="请输入住址" maxlength="45" type="text">
                </div>
                <span id="address-message" style="color: red; font-size: small;"></span>
            </div>



            <div class="form-group has-feedback">
                <label for="sex">性别*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-user"></span>
                        </span>
                    <input id="sex" class="form-control" name="studentNumber" placeholder="请输入性别" maxlength="45" type="text" required="">
                </div>
            </div>

            <div class="form-group has-feedback">
                <label for="Email">联系邮箱*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-phone"></span>
                        </span>
                    <input id="Email" class="form-control" name="phone" placeholder="请输入邮箱" maxlength="40" type="text" required="">
                </div>
                <span id="email-message" style="color: red; font-size: small;"></span>
            </div>


            <div class="form-group">
                <input class="form-control btn btn-primary" id="btn_register"  value="立&nbsp;&nbsp;即&nbsp;&nbsp;注&nbsp;&nbsp;册" type="submit">
            </div>

            <div class="form-group">
                <input value="重置" id="reset" class="form-control btn btn-danger" type="reset">
            </div>

            <br><br>

            <div class="form-group">
                <input class="form-control btn btn-primary" id="btn_gotoLogin"  value="去&nbsp;&nbsp;登&nbsp;&nbsp;录" type="submit">
            </div>
        </form>
    </div>
</div>

<script type="text/javascript" src="../../../js/systemScripts/register.js"></script>


</body>
</html>