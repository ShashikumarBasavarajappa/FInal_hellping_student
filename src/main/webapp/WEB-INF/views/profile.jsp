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
    
    <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-1.8.3.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/profile.js"></script>
    
    <script src="<%=request.getContextPath() %>/resources/jquery/js/Image.js"></script>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-ui-1.9.2.custom.min.js"></script>
   
            
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
<div class="head">
    <h1>Profile_Page</h1>
</div>



<div class="container">
    <div class="stepwizard">
        <div class="stepwizard-row setup-panel">
            <div class="stepwizard-step">
                <a href="#step-1" type="button" class="btn btn-primary btn-circle">
                <i class="glyphicon glyphicon-user"></i></a>    
            </div>
            <div class="stepwizard-step">
                <a href="#step-2" type="button" class="btn btn-default btn-circle" disabled="disabled">
                <i class="glyphicon glyphicon-heart"></i></a>
            </div>
            <div class="stepwizard-step">
                <a href="#step-3" type="button" class="btn btn-default btn-circle" disabled="disabled">
                <i class="glyphicon glyphicon-ok"></i></a>  
            </div>
        </div>
    </div>

    <div class="row setup-content" id="step-2">
        <div class="col-xs-12">
            <div class="col-md-12">
                <h3>Business Info</h3>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">Business Name</label>
                            <input  maxlength="100" type="text" required="required" class="form-control" placeholder="Enter Name"  />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">EIN (used to verify your business)</label>
                            <input  maxlength="10" type="text" required="required" class="form-control" placeholder="12-3456789"  />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label for="subject">
                                Type of Business</label>
                            <select id="subject" name="subject" class="form-control" required="required">
                                <option value="na" selected="">Choose One:</option>
                                <option value="service">Restaurant</option>
                                <option value="suggestions">Shopping</option>
                                <option value="product">Financial</option>
                                <option value="product">Retail</option>
                                <option value="product">Online</option>
                                <option value="product">Other</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">Website (option)</label>
                            <input maxlength="100" type="text"  class="form-control" placeholder="URL" />
                        </div>
                    </div> 
                    <h3>Business Location</h3>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">Street Adress</label>
                            <input  maxlength="100" type="text" required="required" class="form-control" placeholder="Enter Address"  />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">City</label>
                            <input  maxlength="40" type="text" required="required" class="form-control" placeholder="Enter City"  />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">ZIP</label>
                            <input  maxlength="5" type="text" required="required" class="form-control" placeholder="Enter ZIP Code"  />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">State</label>
                            <input  maxlength="2" type="text" required="required" class="form-control" placeholder="Enter State"  />
                        </div>
                    </div>
                    <h3>Business Contact</h3>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">Phone Number</label>
                            <input  maxlength="14" type="text" required="required" class="form-control" placeholder="(555) 555-5555"  />
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label">Email</label>
                            <input  maxlength="100" type="text" required="required" class="form-control" placeholder="Enter Email"  />
                        </div>
                    </div>
                </div>
                <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Next</button> 
            </div>
        </div>
    </div>

  <div class="row setup-content" id="step-1">
        <div class="col-xs-12">
            <div class="col-md-12">
         <div class="input-group image-preview">
                <input type="text" class="form-control image-preview-filename" disabled="disabled"> <!-- don't give a name === doesn't send on POST/GET -->
                <span class="input-group-btn">
                    <!-- image-preview-clear button -->
                    <button type="button" class="btn btn-default image-preview-clear" style="display:none;">
                        <span class="glyphicon glyphicon-remove"></span> Clear
                    </button>
                    <div class="btn btn-default image-preview-input">
                        <span class="glyphicon glyphicon-folder-open"></span>
                        <span class="image-preview-input-title">Browse</span>
                        <input type="file" accept="image/png, image/jpeg, image/gif" name="input-file-preview"/> <!-- rename it -->
                    </div>
                </span>
            </div>
            <br />
            <br />
            <button class="btn btn-primary nextBtn btn-lg pull-right" type="button" >Next</button>
         </div>
        </div>
   </div>
    <div class="row setup-content" id="step-3">
        <div class="col-xs-12">
            <div class="col-md-12">
                <div class="container">
                 <h4>Complete Registration</h4>            
                <button class="btn btn-success completeBtn btn-lg pull-right" type="button" >Complete</button>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</div>
</body>
</html>