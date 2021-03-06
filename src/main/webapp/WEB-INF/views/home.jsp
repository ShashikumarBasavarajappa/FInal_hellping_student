<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    <!--
    <spring:url value="/resources/bootstrap/css/bootstrap.min" var="crunchifyCSS" />
        <spring:url value="/resources/bootstrap/js/bootstrap.min" var="crunchifyJS" />
    -->
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/js/bootstrap.min.js" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/shaashi.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/background.css" rel="stylesheet"/>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/login_page_validation.js"></script>

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
<%@include  file="default_nav_bar.jsp" %>
        <div class="container">
          <!--
            <header class="jumbotron hero-spacer">
                <h4>WELCOME TO MY APPLICATION</h4>
                <legend style="text-align: center"> Designed By ${printme} WEB APPLICATION</legend>
            </header>
          -->
            <!--login  form come here -->
            <!--
            <form class="form-horizontal" method="post" action="signin">
             <div class="row">
                <div class="col-md-offset-5 col-md-3">
                    <div class="form-login">
                    <h4>Hello Shashi,,,,</h4>
                    <h5 style="color:red">${error_msg}</h5>
                  <div class="form-group">
                    <label for="firstname" class="col-sm-3 control-label">EMAIL</label>
                    <div class="col-sm-9">
                        <input type="text" id="email" name="email" placeholder="USERNAME" class="form-control" autofocus>

                    </div>
                </div>
                    <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">PASSWORD</label>
                    <div class="col-sm-9">
                        <input type="password" id="password" name="password" placeholder="PASSWORD" class="form-control" autofocus>

                    </div>
                </div>
                    <div class="wrapper">
                    <span class="group-btn">
                        <button type="submit" class="btn btn-primary btn-block">Login</button><br />
                        <a href="register" class="btn btn-primary btn-md">Register <i class="fa fa-sign-in"></i></a>
                    </span>
                    </div>
                    </div>

                </div>
            </div>
            </form>
          -->
          <div class="row">

		  <div class="col-sm-5" id="corbonads" style="border-radius: 5%;">
		  	<b><i><h2 class="text-info"> Why we developed this</h2></i></b>
		  <div class="panel panel-default">
		  		<p class="text-success"><i>We are helping job seeker through the company employees.</i>
		  		<br />
		  		<ul>
		  			<li>We are findind the colleges for the job. </li>
		  			<li>People searching for Good college they can go through the portal.</li>
		  			<li>you can communicate for admin for job and lectures for the college sections.</li>

		  		</ul>
		  		<p class="text-info"> Please give the suggetion for anything new changes and contact us for any thing from our side.</p>
		  			<br />
		  			<i class="text-primary">SHASHIKUMAR , 7259127489</i>

		  		</p>

		  	</div>
		  </div>
		   <div class="col-sm-2">
		   </div>
          <div class="col-sm-5">
              <div class="panel panel-default">
                  <div class="panel-heading">
                      <span class="glyphicon glyphicon-lock"></span> Login</div>
                  <div class="panel-body">
                      <form class="form-horizontal" method="post" action="signin">
                      <div class="form-group">
                       <label for="inputEmail3" class="col-sm-3 control-label"> </label>
                       <div class="col-sm-9">
                        	<h5 style="color:red">${error_msg}</h5>
                        </div>    
                      </div>      
                      <div class="form-group">
                          <label for="inputEmail3" class="col-sm-3 control-label">
                              Email</label>
                          <div class="col-sm-9">
                              <input type="email" class="form-control" name="email" id="email" placeholder="Email" required>
                          </div>
                      </div>
                      <div class="form-group">
                          <label for="inputPassword3" class="col-sm-3 control-label">
                              Password</label>
                          <div class="col-sm-9">
                              <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
                          </div>
                      </div>
                      <div class="form-group">
                          <div class="col-sm-offset-3 col-sm-9">
                              <div class="checkbox">
                                  <label>
                                      <input type="checkbox"/>
                                      Remember me
                                  </label>
                              </div>
                          </div>
                      </div>
                      <div class="form-group last">
                          <div class="col-sm-offset-3 col-sm-9">
                              <button type="submit" class="btn btn-success btn-sm">
                                  Sign in</button>
                                   <button type="reset" class="btn btn-default btn-sm">
                                  Reset</button>
                          </div>
                      </div>
                      </form>
                  </div>
                  <div class="panel-footer">
                      Not Registred? <a href="register" class="btn btn-primary btn-md">Register here<i class="fa fa-sign-in"></i></a>
              </div>
          </div>
      </div>

            <!-- designed for exa,ple -->

        <!-- Title -->
        <div class="row">
            <div class="col-lg-12" style="margin-top: 10%;">
                <h3 class="text-danger"><strong>TOP JOBS AND COLLEGES</strong></h3>
            </div>
        </div>
        <!-- /.row -->

        <!-- Page Features -->
        <div class="row text-center">

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="<%=request.getContextPath() %>/resources/images/college.JPG" alt="">
                    <div class="caption">
                        <h3>College Details</h3>
                        <p>Sri siddhratha Institute Of technology.</p>
                        <p>
                            <a href="/development/college_data" class="btn btn-primary">VIEW</a> <a href="#" class="btn btn-default">APPLY</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="<%=request.getContextPath() %>/resources/images/college.JPG" alt="">
                    <div class="caption">
                        <h3>College details</h3>
                        <p>Sri Siddhaganga Institute Technology.</p>
                        <p>
                            <a href="/development/college_data" class="btn btn-primary">VIEW</a> <a href="#" class="btn btn-default">APPLY</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="<%=request.getContextPath() %>/resources/images/college.JPG" alt="">
                    <div class="caption">
                        <h3>College Details</h3>
                        <p>Deshiya Vidya Samsthe.</p>
                        <p>
                            <a href="/development/college_data" class="btn btn-primary">VIEW</a> <a href="#" class="btn btn-default">APPLY</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-3 col-sm-6 hero-feature">
                <div class="thumbnail">
                    <img src="<%=request.getContextPath() %>/resources/images/college.JPG" alt="">
                    <div class="caption">
                        <h3>School Imformation</h3>
                        <p>Madappa higher Primary School.</p>
                        <p>
                            <a href="/development/college_data" class="btn btn-primary">VIEW</a> <a href="#" class="btn btn-default">APPLY</a>
                        </p>
                    </div>
                </div>
            </div>

        </div>
        <!-- /.row -->

        <hr>

          <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </footer>

        </div>
    </body>
</html>
