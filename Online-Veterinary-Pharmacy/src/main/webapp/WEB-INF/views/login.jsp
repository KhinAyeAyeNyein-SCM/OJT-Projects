<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Veterinary Pharmacy | LOGIN FORM</title>
<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

</head>
<body>
	<div class="wrapper">
		<div class="container">
			<div class="sec-form">
				<h2 class="cmn-ttl">Login Form</h2>
				<font color="red"> ${SPRING_SECURITY_LAST_EXCEPTION.message}
				</font>
				<form action="<%=request.getContextPath()%>/login" method="POST""
					Class="form">
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" /> <label for="username"
						class="form-cmn-txt"> Name</label> <input Class="input" /> <label
						for="password" class="form-cmn-txt">Password</label> <input
						path="password" Class="input" /> <input type="submit"
						value="Login" Class="btn">
				</form>
			</div>
		</div>
	</div>
</body>
</html>