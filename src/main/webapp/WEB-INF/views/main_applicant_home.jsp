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
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/welcome_homepage.css" rel="stylesheet"/>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-1.8.3.min.js"></script>
      <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-ui-1.9.2.custom.min.js"></script>
      
    <!-- <script src="<%=request.getContextPath() %>/resources/jquery/js/welcome_home_page_validation.js"></script> -->

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

      h2, p, span{
        color: white;
      }
        </style>


</head>
<body>
  <div id="mySidenav" class="sidenav">
  
  <p id="closeDev">  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a></p>
    <a id="viewinformation">Your Information</a>
    <a href="#" id="resume_details">UpDate Resume</a>
    <a href="#">Search For Jobs</a>
    <a href="#">About</a>
  </div>

  <div id="main">
    <h2>Welcome to Job Searching page</h2>
    <p>Click on the side view bar to see the changes.</p>
    <p>${shashi }</p>
    <p id="opennav">
    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; View Data</span>
    <p>
    <div id="divProcessing">
    
        <div class="container">


    <form class="well form-horizontal" action=" " method="post"  id="contact_form">
<fieldset>

<!-- Form Name -->
<legend><center><h2><b>Your Complete Information</b></h2></center></legend><br>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">First Name</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <p style="color:red;"><b>sssssssssss </b>   ${profileresult }  </p>
  <input  type="text" name="first_name" placeholder="First Name" class="form-control"   value= ${shashi}>
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Last Name</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="last_name" placeholder="Last Name" class="form-control"  type="text">
    </div>
  </div>
</div>

  <div class="form-group"> 
  <label class="col-md-4 control-label">Department / Office</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
    <select name="department" class="form-control selectpicker">
      <option value="">Select your Department/Office</option>
      <option>Department of Engineering</option>
      <option>Department of Agriculture</option>
      <option >Accounting Office</option>
      <option >Tresurer's Office</option>
      <option >MPDC</option>
      <option >MCTC</option>
      <option >MCR</option>
      <option >Mayor's Office</option>
      <option >Tourism Office</option>
    </select>
  </div>
</div>
</div>
  
<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Username</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="user_name" placeholder="Username" class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Password</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="user_password" placeholder="Password" class="form-control"  type="password">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Confirm Password</label> 
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="confirm_password" placeholder="Confirm Password" class="form-control"  type="password">
    </div>
  </div>
</div>

<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input name="email" placeholder="E-Mail Address" class="form-control"  type="text">
    </div>
  </div>
</div>


<!-- Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Contact No.</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
  <input name="contact_no" placeholder="(639)" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Select Basic -->

<!-- Success message -->
<div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Success!.</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4"><br>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<button type="submit" class="btn btn-warning" >&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspSUBMIT <span class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
    </div>
    <form action="file_upload_to_db" method="get">
 <div class="file_upload" id="file_upload">
 
  <div class="fileupload fileupload-new" data-provides="fileupload">
    <span class="btn btn-primary btn-file"><span class="fileupload-new">Select file</span>
    <span class="fileupload-exists">Change</span>         <input type="file" /></span>
    <span class="fileupload-preview"></span>
    <a href="" class="close fileupload-exists" data-dismiss="fileupload" style="float: none"></a>    
  </div>
  
 </div>
 <button type="button" class="btn btn-primary" value="Upload" >
 </form>
  
<script>
$(document).ready(function(){
//	alert("hello shashi page loaded");
      $('#divProcessing').hide();
      $('#file_upload').hide();
      $('#resume_details').click(function(){
    	  document.getElementById("file_upload").style.width = "250px";
	      document.getElementById("file_upload").style.marginLeft = "250px";
    	  $('#file_upload').show();
      });
	  $('#viewinformation').click(function(){
	         var email = 'shivahosur@gmail.com';
	         var data = 'email=' + email;
	         $.ajax({
	         url : 'welcome_information',
	         data : data,
	         type : "GET",
	         success : function(response) {
	        	 alert("ddddd" + response);
	        	 $('#divProcessing').show();
	         },
	         error: function(){
	        	 
	              alert('Error while request..');
	          }
	       });
	  });
	$('#opennav').click(function(){
		 // $('#divProcessing').hide();
	      document.getElementById("mySidenav").style.width = "250px";
	      document.getElementById("main").style.marginLeft = "250px";
	      document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
	});
	$('#closeDev').click(function(){
		  document.getElementById("file_upload").style.width = "0";
	      document.getElementById("file_upload").style.marginLeft = "0";
	      document.getElementById("mySidenav").style.width = "0";
	      document.getElementById("main").style.marginLeft= "0";
	      document.body.style.backgroundColor = "white";
	});
	  });
</script>
</body>
</html>
