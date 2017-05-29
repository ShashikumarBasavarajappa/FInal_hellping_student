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

    <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-1.8.3.min.js"></script>
      <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-ui-1.9.2.custom.min.js"></script>
      <script src="<%=request.getContextPath() %>/resources/jquery/js/Adminhome_shashi.js"></script>


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


</head>
<body>
<div class="container">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Home</a></li>
      <li><a href="adminprofile/${admindetails.email}">Profile</a></li>
      <li><a href="#" class="active">Search</a></li>
      <li><a href="rejected_applicants/${admindetails.id}"  class="active"><span class="glyphicon glyphicon-user"></span> Rejected Users</a></li>

    </ul>
     <ul class="nav navbar-nav navbar-right">
     <li><a href="about_us">About Us</a></li>
      <li><a href="logout"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      <li><a href="notification/${admindetails.id}"><span class="glyphicon glyphicon-log-in"></span> Notification</a></li>
    </ul>

  </div>
</nav>

  <div class="container-fluid">

  <h2>Rejected applicants  By SHASHIKUMAR</h2>

  <table class="table table-bordered table-inverse">
  <thead>
    <tr>
      <th class="table-active">Uniq_ID</th>
      <th class="table-success">First Name</th>
      <th class="table-warning">Last Name</th>
      <th class="table-danger">EMail</th>
      <th class="table-danger">Enable User</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${adminRejected_users}" var="emp">
    <tr>
      <td class="table-active">${emp.id}</td>
      <td class="table-danger">${emp.first_name}</td>
      <td class="table-success">${emp.last_name}</td>
      <td class="table-warning">${emp.email}</td>
      <td><form  id="profilepage" action="archive_user" method="get"> <input type="checkbox" name="newsletter" id="newsletter" value="${emp.id}"></form></td>
    </tr>
     </c:forEach>

  </tbody>
</table>
</div>
  </body>
  </html>
