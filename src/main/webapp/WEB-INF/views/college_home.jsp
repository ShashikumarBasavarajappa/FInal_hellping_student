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
   th{
   		text-align: center;
   		
   }
   
			body {
			    background-image: url("<%=request.getContextPath() %>/resources/images/back.png");
			}
			.no-background {
			    background-image: url("images/blank.jpg");
			}

			#sampleForm{
			padding-right:30%;
			}


.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}

$baseColor: #398B93;
$borderRadius: 10px;
$imageBig: 100px;
$imageSmall: 60px;
$padding: 10px;

body {
   background-color: lighten($baseColor, 30%);
   * { box-sizing: border-box; }
}

.header {
   background-color: darken($baseColor, 5%);
   color: white;
   font-size: 1.5em;
   padding: 1rem;
   text-align: center;
   text-transform: uppercase;
}

img {
   border-radius: 50%;
   height: $imageSmall;
   width: $imageSmall;
}

.table-users {
   border: 1px solid darken($baseColor, 5%);
   border-radius: $borderRadius;
   box-shadow: 3px 3px 0 rgba(0,0,0,0.1);
   max-width: calc(100% - 2em);
   margin: 1em auto;
   overflow: hidden;
   width: 800px;
}

table {
   width: 100%;
   
   td, th { 
      color: darken($baseColor, 10%);
      padding: $padding; 
   }
   
   td {
      text-align: center;
      vertical-align: middle;
      
      &:last-child {
         font-size: 0.95em;
         line-height: 1.4;
         text-align: left;
      }
   }
   
   th { 
      background-color: lighten($baseColor, 50%);
      font-weight: 300;
   }
   
   tr {     
      &:nth-child(2n) { background-color: white; }
      &:nth-child(2n+1) { background-color: lighten($baseColor, 55%) }
   }
}

@media screen and (max-width: 700px) {   
   table, tr, td { display: block; }
   
   td {
      &:first-child {
         position: absolute;
         top: 50%;
         transform: translateY(-50%);
         width: $imageBig;
      }

      &:not(:first-child) {
         clear: both;
         margin-left: $imageBig;
         padding: 4px 20px 4px 90px;
         position: relative;
         text-align: left;

         &:before {
            color: lighten($baseColor, 30%);
            content: '';
            display: block;
            left: 0;
            position: absolute;
         }
      }

      &:nth-child(2):before { content: 'Name:'; }
      &:nth-child(3):before { content: 'Email:'; }
      &:nth-child(4):before { content: 'Phone:'; }
      &:nth-child(5):before { content: 'Comments:'; }
   }
   
   tr {
      padding: $padding 0;
      position: relative;
      &:first-child { display: none; }
   }
}

@media screen and (max-width: 500px) {
   .header {
      background-color: transparent;
      color: lighten($baseColor, 60%);
      font-size: 2em;
      font-weight: 700;
      padding: 0;
      text-shadow: 2px 2px 0 rgba(0,0,0,0.1);
   }
   
   img {
      border: 3px solid;
      border-color: lighten($baseColor, 50%);
      height: $imageBig;
      margin: 0.5rem 0;
      width: $imageBig;
   }
   
   td {
      &:first-child { 
         background-color: lighten($baseColor, 45%); 
         border-bottom: 1px solid lighten($baseColor, 30%);
         border-radius: $borderRadius $borderRadius 0 0;
         position: relative;   
         top: 0;
         transform: translateY(0);
         width: 100%;
      }
      
      &:not(:first-child) {
         margin: 0;
         padding: 5px 1em;
         width: 100%;
         
         &:before {
            font-size: .8em;
            padding-top: 0.3em;
            position: relative;
         }
      }
      
      &:last-child  { padding-bottom: 1rem !important; }
   }
   
   tr {
      background-color: white !important;
      border: 1px solid lighten($baseColor, 20%);
      border-radius: $borderRadius;
      box-shadow: 2px 2px 0 rgba(0,0,0,0.1);
      margin: 0.5rem 0;
      padding: 0;
   }
   th{
   		text-align: center;
   		
   }
   
   .table-users { 
      border: none; 
      box-shadow: none;
      overflow: visible;
   }
}
        </style>


</head>
<body>
<div class="container">

<div class="jumbotron">
        <h3>Welcome To SSIT COLLEGE</h3>
        <p style="margin-left:30%;">Reach unreached.......</p>
        <p><a href="https://www.shashi.com" target="_blank" class="btn btn-success btn-lg">Apply for Job in the College</a></p>
    </div>
        
 

  
  <div id="mySidenav" class="sidenav">
	  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
	  	<a href="/development/college_data">Home</a>
	  <a href="/development/about_college">About College</a>	
	  
	  <a href="/development/college_braches">Braches</a>
	  <a href="/development/lectures_list">Lecture</a>
	  <a href="/development/contact_college">Contact</a>
</div>
  
  <span style="font-size:30px;cursor:pointer;color:red" onclick="openNav()">&#9776; View</span>
  
    <hr>
    <c:if test="${check_lecture != null}">
              
            
            <div class="table-users">
                   <div class="header">Lectures</div>
                    <table cellspacing="0">
                   <thead style='allign '>
                      <tr>
                         <th>Name</th>
                         <th>Branch Name</th>
                         <th>Active lecture</th>
                         <th>Update Information</th>

                      </tr>
                      </thead>
                 <tbody>
                        <tr>
                            <td> Shashikumar</td>
                            <td>Information Science</td>
                            <td> Yes</td>
                            <td><button type='button' class='btn btn-info' value='edit'>Edit</button></td>
                       </tr>        
                </tbody>
                </table>
            </div>
          
    </c:if>  
  <c:if test="${branchdetails != null}"> 
     <div class="table-users">
   <div class="header">Branches</div>
   
   <table cellspacing="0">
   <thead style='allign '>
      <tr>
         <th>ID</th>
         <th>College Id</th>
         <th>Branch Name</th>
         <th>Is Active Branch</th>
    
      </tr>
      </thead>
<tbody>
          <c:forEach items="${branchdetails}" var="emp">

                 <tr>
                    <td>${emp.id}</td>
                    <td>${emp.college_id}</td>
                    <td>${emp.branch_name}</td>     
                    <td>${emp.is_active_brach} </td>          
                 </tr>

  </c:forEach> 	
  </tbody>
   </table>
</div>
    </c:if>
<c:if test="${aboutcollege != null}">     
    <div class="jumbotron" style="background-color: darkcyan;">
  
    <div class="container">

      <div class="row">

        <div class="col-sm-8 blog-main">

          <div class="blog-post">
            <h2 class="blog-post-title">Sample blog post</h2>
            <p class="blog-post-meta">January 1, 2014 by <a href="#">Shashikumar</a></p>

            <p>This blog post shows a few different types of content that's supported and styled with Bootstrap. Basic typography, images, and code are all supported.</p>
            <hr>
            
            <blockquote>
              <p>Curabitur blandit tempus porttitor. <strong>Nullam quis risus eget urna mollis</strong> ornare vel eu leo. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
            </blockquote>
            <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
            
            <p>Cras mattis consectetur purus sit amet fermentum. Sed posuere consectetur est at lobortis.</p>
          </div><!-- /.blog-post -->

        </div><!-- /.blog-main -->

        <div class="col-sm-3 offset-sm-1 blog-sidebar">
          <div class="sidebar-module sidebar-module-inset">
            <h4>About</h4>
            <p>Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla sed consectetur.</p>
          </div>

          
        </div><!-- /.blog-sidebar -->

      </div><!-- /.row -->

    </div> 
  </div>
  </c:if>
    
    <div class="row">
        <div class="col-sm-12">
            <footer>
                <p>&copy; Copyright 2013 Tutorial Republic</p>
            </footer>
        </div>
    </div>
</div>

<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script>
</body>
</html>
