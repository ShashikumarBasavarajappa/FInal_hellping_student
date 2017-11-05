<c:set var="contextPath" value="development"/>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li><a href="#">Home</a></li>
      <li><a href="/${contextPath}/adminprofile/${main_user_name}">Profile</a></li>
      <li><a href="/${contextPath}/admin_welcomepage" class="active">Search</a></li>
      <li><a href="/${contextPath}/rejected_applicants/${main_user_name}"><span class="glyphicon glyphicon-user"></span> Rejected Users</a></li>

    </ul>
     <ul class="nav navbar-nav navbar-right">
     <li><a href="/${contextPath}/about_us/" class="active">About Us</a></li>
      <li><a href="/${contextPath}/notification/${main_user_name}"><span class="glyphicon glyphicon-log-in"></span> Notification</a></li>
        <li><a href="/${contextPath}/logout"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
    </ul>

  </div>
</nav>
