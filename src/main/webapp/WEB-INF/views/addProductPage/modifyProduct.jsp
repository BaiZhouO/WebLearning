<%--
  Created by IntelliJ IDEA.
  User: 贺俞凯
  Date: 2019/4/27
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../css/favicon.ico">
    <title>音像购物商城</title>
    <!-- css引用 -->
    <!-- Bootstrap core CSS -->
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../../css/childstyle.css" type="text/css" media="screen" />
    <link rel="stylesheet" href="../../../css/childmenu.css" type="text/css" media="screen">
    <link rel="stylesheet" href="../../../css/bootstrap-table.css"/>
    <link rel="stylesheet" href="../../../css/bootstrap-table-fixed-columns.css"/>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../../../css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../../../css/dashboard.css" rel="stylesheet">
    <link href="../../../css/carousel.css" rel="stylesheet">

    <script src="../../../js/ie-emulation-modes-warning.js"></script>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <!--jquery和box和bootstrap-->
    <script type="text/javascript" src="../../../js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../js/bootstrap.min.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/bootbox.js/4.4.0/bootbox.min.js"></script><!-- 如果断网，需要下载这个js -->
    <script type="text/javascript" src="../../../js/bootstrap-table.js"></script>
    <script type="text/javascript" src="../../../js/bootstrap-table-zh-CN.js"></script>
    <script type="text/javascript">baselocation="${ctx}"</script>


</head>

<body>
<style type="text/css">
    #result{
        width: 800px;
        height:500px;
        border:1px solid #eee;
    }
    #result img{
        height:500px;
    }
    #myimg{
        width: 100px;
        height:100px;
        border:1px solid #eee;
    }
</style>

<!--上方导航栏-->
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <img src="../../../img/mainlogo.png" style="width:50px">
        </div>
        <div class="navbar-header">
            <p class="navbar-brand" ><font size="5">音像购物商城</font></p>
        </div>
        <div>
            <p id= "huanying" class="navbar-brand" align="right"><font size="4">管理员：</font><label type="text" id="user" name="user">${currentStaff.loginName}</label>
        </div>

        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a type="text" id="a_gotoHomepageForStaff" class = "active"><font size="3">首页</font></a></li>
                <li><a type="text" id="a_gotoViewOrderForStaff" class = "active"><font size="3">查看订单</font></a></li>
                <button id="btn_logout"><font size="3">注销</font></button>
            </ul>
        </div>
    </div>
</nav>
<!--//上方导航栏-->


<!--内容-->
<div class="container-fluid">

    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <div class="w3ls-details">
            <!--个人信息-->
            <div class="w3ls-text">
                <h3>商品信息</h3>
                <p><b>商品名字 :</b> ${currentProduct.prod_name} </p>


                <br/>
                <h4>图片</h4>
            </div>

            <br/>
            <br/>
            <div display:block>

                <img class="thumbnail"
                     align = "left"
                     src="${currentProduct.prod_pic_dir}">

            </div>
            <br/><br/><br/>
            <div class="form-group has-feedback">
                <label for="prod_price">产品价格*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-user"></span>
                        </span>
                    <input id="prod_price" name="identity" class="form-control" placeholder="请输入产品价格" maxlength="20" type="text" required="" >
                </div>
            </div>

            <div class="form-group has-feedback">
                <label for="prod_description">产品描述*</label>
                <div class="input-group">
                        <span class="input-group-addon">
                            <span class="glyphicon glyphicon-user"></span>
                        </span>
                    <input id="prod_description" class="form-control"  placeholder="请输入简介" maxlength="128" type="text">
                </div>
            </div>
            <br/><br/><br/>

            <br/>
            <div class="form-group">
                <input class="form-control btn btn-primary" id="btn_modify" value="修&nbsp;&nbsp;改" type="submit">
            </div>

        </div>

    </div>
    <!-- //控制输出内容在右半部分 -->

</div>
<!--内容-->

</div>
</body>
</html>
<script type="text/javascript" src="../../../js/systemScripts/nav_bar.js"></script>
<script type="text/javascript" src="../../../js/systemScripts/viewDetails.js"></script>