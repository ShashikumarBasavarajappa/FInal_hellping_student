<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
 <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/js/bootstrap.min.js" rel="stylesheet"/>
 <!--
 <link type="text/css" href="<%=request.getContextPath() %>/resources/css/shaashi.css" rel="stylesheet"/>
 <link type="text/css" href="<%=request.getContextPath() %>/resources/css/background.css" rel="stylesheet"/>
 -->
 <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-1.8.3.min.js"></script>
 <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-ui-1.9.2.custom.min.js"></script>
     <style type="text/css">

         body {
             background-image: url("<%=request.getContextPath() %>/resources/images/back.png");
         }
         .no-background {
             background-image: url("images/blank.jpg");
         }

     </style>

<script type="text/javscript">
$(document).ready(function(){
alert("pppppppppppppppppppppppp");  
});

</script>
</head>
<body>
<div class="container">
<div class="head">
    <h1>Profile_Page</h1>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Home</a></li>
      <li><a href="adminprofile/${admindetails.email}">Profile</a></li>
      <li><a href="search_redirt/${profileresult.id}" class="active">Search</a></li>
    </ul>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="logout"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Notification</a></li>
    </ul>

    <button class="btn btn-danger navbar-btn">Rejected Appliants</button>
  </div>
</nav>

	<form  id="profilepage" action="profile_save" method="get">

<div class="col-md-3"></div>
    <div class="col-md-6">
         <div class="row myborder">
             <h4 style="color: #7EB59E; margin: initial; margin-bottom: 10px;">View the profile</h4><hr>
             <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <input size="60" maxlength="255" class="form-control" value= ${profileresult.id} type="text" id="id" name="id">                                                        </div>

            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <input size="60" maxlength="255" class="form-control" value= ${profileresult.email} type="text" id="email" name="email">                                                        </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <input size="60" maxlength="255" class="form-control" value= ${profileresult.first_name} type="text" id="first_name" name="first_name">                                    </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <input size="60" maxlength="255" class="form-control" value= ${profileresult.last_name} type="text" id="last_name" name="last_name"> </div>
            <div class="input-group margin-bottom-20">
                <span class="input-group-addon"><i class="glyphicon glyphicon-user mycolor"></i></span>
                <input size="60" maxlength="255" class="form-control" value= ${profileresult.password} type="text" id="password" name="password">                                    </div>

            <div class="row">
                <div class="col-md-6">
                    <button class="btn-u pull-left" type="submit" id="edit_button">Edit Profile</button>
                </div>
                <div class="col-md-6">
                    <button class="btn-u pull-left" type="submit" id="save_button">Save Profile</button>
                </div>
            </div>
        </div>
        <div class="col-md-2"></div>
    </div>
</form>
</div>
</body>
</html>
