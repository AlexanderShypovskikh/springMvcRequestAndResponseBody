<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Login Form</title>
 	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"/>
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  <script src="js/script.js"></script>
</head>
<body>
  <section class="container">
    <div class="login">
      <h1>Login to Web App</h1>
      
        <form:form name="loginForm" method="POST" commandName="user" action="check-user">
        	
        	<form:label path="email">Email</form:label>
        	<form:input path="email" placeholder="email"/>
       		<form:errors path="email" class="error"/>
            <br>
        	<form:label path="password">Password</form:label>
        	<form:input path="password"  placeholder="email"/>
        	<form:errors path="password" class="error"/>
        
         <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>
      </form:form>
      
       <p class="submit"><sub class="registration"><a href="jsp/registration.jsp">not registered? register now</a></sub></p>
    </div>

    <div class="login-help">
      <p>Forgot your password? <a href="index.html">Click here to reset it</a>.</p>
    </div>
  </section>
  </body>
</html>