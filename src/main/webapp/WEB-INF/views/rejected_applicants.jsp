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
      <script src="<%=request.getContextPath() %>/resources/jquery/js/archived_shashi.js"></script>


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
<%@include  file="default_nav_bar.jsp" %>
  <div class="container-fluid">

  <h2>Rejected applicants  By SHASHIKUMAR</h2>

  <c:choose>
  <c:when test="${empty adminRejected_users}">
    <div class="alert alert-warning">
        <a href="#" class="close" data-dismiss="alert">&times;</a>
        <strong>Warning!</strong> None of the User are Archived by you.
    </div>
  </c:when>
  <c:otherwise>
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
      <td><form  id="profilepage" action="enable_archiver" method="get"> <input type="checkbox" name="newsletter" id="newsletter" value="${emp.id}"></form></td>
    </tr>
     </c:forEach>

  </tbody>
</table>
</c:otherwise>
</c:choose>
</div>
  </body>
  </html>
