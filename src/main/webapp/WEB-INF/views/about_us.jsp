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

      body{
        position: relative;
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

<div class="container">
<!-- <%@include  file="chat_design.jsp" %> -->
<div class="row">
<div class="col-sm-12">
<h3 style="color:red;"><b>User Comment Convesation</b></h3>
</div><!-- /col-sm-12 -->
</div><!-- /row -->
<div class="row">

<div class="col-sm-1">
<div class="thumbnail">
<img class="img-responsive user-photo" src="https://ssl.gstatic.com/accounts/ui/avatar_2x.png">
</div><!-- /thumbnail -->
</div><!-- /col-sm-1 -->

<div class="col-sm-5">
<div class="panel panel-default">
<div class="panel-heading">
<strong>Admin</strong> <span class="text-muted">commented 5 days ago</span>
</div>
<c:forEach items="${user_comments}" var="user_comments">
<div class="panel-body">

  <tr>
      <td>${user_comments.comments}</td>
      <td>${user_comments.rating_number}</td>
  </tr>

</div><!-- /panel-body -->
</c:forEach>
</div><!-- /panel panel-default -->
</div><!-- /col-sm-5 -->
<div class="col-sm-1">
<div class="thumbnail">
<img class="img-responsive user-photo" src="https://ssl.gstatic.com/accounts/ui/avatar_2x.png">
</div><!-- /thumbnail -->
</div><!-- /col-sm-1 -->

<div class="col-sm-5">
<div class="panel panel-default">
<div class="panel-heading">
<strong>${main_user_name}</strong> <span class="text-muted">commented 5 days ago</span>
</div>
<c:forEach items="${user_comments}" var="user_comments">
<div class="panel-body">

  <tr>
      <td>${user_comments.comments}</td>
      <td>${user_comments.rating_number}</td>
  </tr>

</div><!-- /panel-body -->
</c:forEach>
</div><!-- /panel panel-default -->
</div><!-- /col-sm-5 -->

</div><!-- /row -->

</div><!-- /container -->
<br />
<br />
<form method="post" action="/development/about_us_save/${main_user_name}">
    <textarea id="comments" name="comments" class="comments">
      Please enter something before leaving the page!
    </textarea>
    <input type="hidden" value="${main_user_name}" name="username" />
    <input type="hidden" value="5" name="rating_number" />
    
    <br />
    <br />
    <button class="btn btn-success navbar-btn">send the comments</button>
</form>

</body>
</html>
