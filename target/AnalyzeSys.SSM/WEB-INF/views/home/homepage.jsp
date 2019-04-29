<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false"%>
<%
    /*获取工程路径*/
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
  </style>
  <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
          <div class="navbar-header">
              <img src="../../../img/mainlogo.png" style="width:50px">
          </div>
          <div class="navbar-header">
              <p class="navbar-brand" ><font size="5">音像购物商城</font></p>
          </div>
          <div>
              <p id= "huanying" class="navbar-brand" align="right"><font size="4">用户：</font><label type="text" id="user" name="user">${currentCustomer.loginName}</label>
              </p>
          </div>

          <div id="navbar" class="navbar-collapse collapse">
              <ul class="nav navbar-nav navbar-right">
                      <li><a type="text" id="a_gotoHomepage" class = "active"><font size="3">首页</font></a></li>
                      <li><a type="text" id="a_gotoViewOrder" class = "active"><font size="3">查看订单</font></a></li>
                      <li><a type="text" id="a_gotoViewPersonInfo" class = "active"><font size="3">我的信息</font></a></li>
                      <button id="btn_logout"><font size="3">注销</font></button>

              </ul>

          </div>
      </div>
  </nav>

  <div class="tab-content">
      <div class="tab-pane fade in active" id="A">
          <!-- Carousel
          ================================================== -->
          <div id="myCarousel" class="carousel slide" data-ride="carousel">
              <!-- Indicators -->
              <ol class="carousel-indicators">
                  <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                  <li data-target="#myCarousel" data-slide-to="1"></li>
                  <li data-target="#myCarousel" data-slide-to="2"></li>
              </ol>
              <div class="carousel-inner" role="listbox">
                  <div class="item active">
                      <img class="first-slide" src="../../../img/imdb.jpg" alt="First slide">
                      <div class="container">
                      </div>
                  </div>
                  <%--<div class="item">
                      <img class="second-slide" src="../../../img/BC2.jpg" alt="Second slide">
                      <div class="container">
                      </div>
                  </div>
                  <div class="item">
                      <img class="third-slide" src="../../../img/BC3.jpg" alt="Third slide">
                      <div class="container">
                      </div>
                  </div>--%>
              </div>
              <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                  <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                  <span class="sr-only">Previous</span>
              </a>
              <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                  <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                  <span class="sr-only">Next</span>
              </a>
          </div>

          <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">


          <c:forEach items="${products}" var="product">
              <div class="col-lg-4">

                  <img class="img-circle" src="${product.prod_pic_dir}" alt="Generic placeholder image" width="140" height="140">
                  <h2>${product.prod_name}</h2>
                  <p></p>
                  <p><button id="btn_showDetails_${product.prod_id}">查看详情</button></p>

              </div>



          </c:forEach>


          <%--<div class="col-lg-4">

              <img class="img-circle" src="../../../img/Farewell_My_Concubine.jpg" alt="Generic placeholder image" width="140" height="140">
              <h2>Farewell My Concubine</h2>
              <p></p>
              <p><button id="btn_showDetails_2">查看详情</button></p>

          </div>--%>


      </div><!-- /.row -->
              </div><!-- /.row -->

              <!-- FOOTER -->

          </div><!-- /.container -->
  </div>
  </body>

  <script type="text/javascript" src="../../../js/systemScripts/nav_bar.js"></script>
  <script type="text/javascript" src="../../../js/systemScripts/viewDetails.js"></script>
</html>

