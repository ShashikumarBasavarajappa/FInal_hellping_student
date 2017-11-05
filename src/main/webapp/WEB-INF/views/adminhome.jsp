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

<%@include  file="default_nav_bar.jsp" %>

  <h2 class="title"><span class="highlight" style="background: black;color: chartreuse;">Please search to see the result</h2>


  <div class="container-fluid">
            <div class="well-searchbox">
                <form id="sampleForm" class="form-horizontal" action="Adminsearch" method-="get">
                    <div class="form-group">
                        <label class="col-md-4 control-label">Keyword</label>
                        <div class="col-md-8">
                            <input type="text" name="email" class="form-control" placeholder="Keyword">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Country</label>
                        <div class="col-md-8">
                            <select class="form-control" placeholder="Country">
                                <option value="">All</option>
                                <option value="">Country 1</option>
                                <option value="">Country 2</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Province</label>
                        <div class="col-md-8">
                            <select class="form-control" placeholder="Province">
                                <option value="">All</option>
                                <option value="">Province 1</option>
                                <option value="">Province 2</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">City</label>
                        <div class="col-md-8">
                            <select class="form-control" placeholder="City">
                                <option value="">All</option>
                                <option value="">City 1</option>
                                <option value="">City 2</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Category</label>
                        <div class="col-md-8">
                            <select class="form-control" placeholder="Category">
                                <option value="">All</option>
                                <option value="">Category 1</option>
                                <option value="">Category 2</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-sm-offset-4 col-sm-5">
                        <button type="submit" class="btn btn-success">Search</button>

                    </div>
                </form>
            </div>
            </div>
            &nbsp;
&nbsp;
<c:choose>
<c:when test="${empty searchresult}">
  <div class="alert alert-warning">
      <a href="#" class="close" data-dismiss="alert">&times;</a>
      <strong>Warning!</strong> Search you will get result other wise you can't able to see the result.
  </div>
</c:when>
<c:otherwise>
    <table class="table table-bordered table-inverse">
                   <thead class="thead-inverse">
                    <tr>
                      <th>First Name</th>
                      <th>Last Name</th>
                      <th>Email</th>
                      <th>Accept/Reject</th>
                      <th>View/Application</th>
                    </tr>
                  </thead>
                  <tbody>
                    <!--
                    <c:forEach items="${searchresult}" var="emp">
                    <tr>
                       <td>${emp.first_name}</td>
                       <td>${emp.last_name}</td>
                       <td>${emp.email}</td>
                   	   <td><label class="switch">
							  <input type="checkbox">
							  <div class="slider round"></div>
							</label>
				       </td>
				      <td><a href="downloadPDF/${emp.email}"><span class="glyphicon glyphicon-open" aria-hidden="true">View</span></a></td>
                    </tr>
                   </c:forEach>
                 -->
                 <c:forEach items="${searchresult}" var="emp">

                 <tr>
                    <td>${emp.first_name}</td>
                    <td>${emp.last_name}</td>
                    <td>${emp.email}</td>
                    <td><form  id="profilepage" action="archive_user" method="get"> <input type="checkbox" name="newsletter" id="newsletter" value="${emp.id}"></form></td>
                    <td><a href="downloadPDF/${emp.email}"><span class="glyphicon glyphicon-open" aria-hidden="true">View</span></a></td>
                 </tr>

                </c:forEach>
                  </tbody>

	</table>
  <br />
    <button class="btn btn-danger navbar-btn" id="archive_user">Download Excel</button>
  </c:otherwise>
</c:choose>
</div>

</body>
</html>
