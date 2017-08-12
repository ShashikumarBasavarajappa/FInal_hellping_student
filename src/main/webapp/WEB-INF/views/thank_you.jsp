<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <!-- <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/js/bootstrap.min.js" rel="stylesheet"/> -->
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/shaashi.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/background.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/profile.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/tabledesign.css" rel="stylesheet"/>
   <link type="text/css" href="<%=request.getContextPath() %>/resources/css/about_us.css" rel="stylesheet"/>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-1.8.3.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/profile.js"></script>

    <script src="<%=request.getContextPath() %>/resources/jquery/js/Image.js"></script>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-ui-1.9.2.custom.min.js"></script>
     <script src='//cloud.tinymce.com/stable/tinymce.min.js'></script>
     <script src="<%=request.getContextPath() %>/resources/jquery/js/about_js.js"></script>
    <!-- <script src="<%=request.getContextPath() %>/resources/jquery/js/tinymce.min.js"></script> -->


        <style type="text/css">

			body {
			    background-image: url("<%=request.getContextPath() %>/resources/images/back.png");
			}
			.no-background {
			    background-image: url("images/blank.jpg");
			}

			#sampleForm{
			padding-right:30%;
			}

        </style>
    <!--
     <script>
          tinymce.init({
            selector: '#mytextarea'
          });
     </script>
    -->
    <style>
        #comments{
            width: 986px;
            height: 281px;
            resize: none;
        }
    </style>
</head>
<body>

<div class="container">

<%@include  file="default_nav_bar.jsp" %>

<div class="jumbotron text-xs-center">
  <h1 class="display-3">Thank You!</h1>
  <p class="lead"><strong>Your valuable reply help full for us!!!!!!!!!!!!</p>
  <hr>
  <p>
    Having trouble? <a href="">Contact us</a>
  </p>
  <p class="lead">
    <a class="btn btn-primary btn-sm" href="/${contextPath}/about_us" role="button">Continue to addning comments</a>
  </p>
</div>
</div>
</body>
</html>
