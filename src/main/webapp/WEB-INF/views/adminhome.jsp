<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/js/bootstrap.min.js" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/shaashi.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/background.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/profile.css" rel="stylesheet"/>
    
            
        <style type="text/css">
			        
			body {
			    background-image: url("<%=request.getContextPath() %>/resources/images/back.png");
			}
			.no-background {
			    background-image: url("images/blank.jpg");
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
    </ul>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Notification</a></li>
    </ul>
    
    <button class="btn btn-danger navbar-btn">Rejected Appliants</button>
  </div>
</nav>


  <h2>Main Design Bar</h2>
  <p>We Are developed lot thing here ....................</p>
<p> rrrrrrrrrrrrrrrrr     ${admindetails} </p>
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
						<h1>${searchresult}</h1>                        
                    </div>
                </form>
            </div>
            </div>
            &nbsp;
&nbsp;

    <table class="table table-bordered table-inverse"  >
                   <thead style="background-color: black;color:red;"   >
                    <tr>
                      <th>#</th>
                      <th>First Name</th>
                      <th>Email</th>
                      <th>Accept/Reject</th>
                    </tr>
                  </thead>
                  <tbody>
                  
                  <c:forEach var="emp" items="${searchresult}">   
					
                    <tr>
                       <td>${emp.last_name}</td>
                       <td>${emp.first_name}</td>
                       <td>${emp.email}</td>
                       <td>
                           <input type="checkbox" checked data-toggle="toggle" data-style="android" data-onstyle="info">
                       </td>
                    </tr>
                  </tbody>
                 </c:forEach>  
	</table> 
</div>

</body>
</html>