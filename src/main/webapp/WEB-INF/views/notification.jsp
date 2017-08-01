<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <link type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <!-- <link	 type="text/css" href="<%=request.getContextPath() %>/resources/css/bootstrap/js/bootstrap.min.js" rel="stylesheet"/> -->
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/shaashi.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/background.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/profile.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/tabledesign.css" rel="stylesheet"/>
    <link type="text/css" href="<%=request.getContextPath() %>/resources/css/notification.css" rel="stylesheet"/>

  <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-1.8.3.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/jquery-ui-1.9.2.custom.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/jquery/js/notification.js"></script>


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
      table{
        margin-top: 5%;
        text-align: center;
      }
      table  th{
        width: 50%;
      }
      #notification_date{
        align-items: center;
      }

</style>

</head>
<body>
<div class="container">
<%@include  file="default_nav_bar.jsp" %>
  <h2>Main Notification Bar By SHASHIKUMAR</h2>
 <table class="table table-bordered table-inverse">
                   <thead class="thead-inverse">
                    <tr>
                      <th>Date</th>
                      <th>Message</th>
                    </tr>
                  </thead>
                  <tbody>
                  	<tr>

                  		<td id="notification_date">${notificatonresult.notified_date}</td>

                  			<td id="message" data-popup-open="popup-1">${notificatonresult.message}</td>

                  	</tr>
                  </tbody>

	</table>

  <div class="popup" data-popup="popup-1">
      <div class="popup-inner">
          <p id="d"></p>
          <p><a data-popup-close="popup-1" href="#">Close</a></p>
          <a class="popup-close" data-popup-close="popup-1" href="#">x</a>
  </div>
</div>
</body>
</html>
