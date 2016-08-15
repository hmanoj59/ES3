<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>

<head>
<title>ESCube</title>

<!--        <link href='https://fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic' rel='stylesheet' type='text/css'>-->

<link href="<c:url value="/resources/css/escube.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/registration.css" />"
	rel="stylesheet">

<link href="<c:url value="/resources/css/manage.css" />"
	rel="stylesheet">
	<link href="<c:url value="/resources/css/course.css" />"
	rel="stylesheet">

<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>

<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

<link
	href='https://fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic'
	rel='stylesheet' type='text/css'>
<style>
</style>
</head>

<body>
	<table id="bodyTable">
		<tbody>
			<tr>
				<td><table id="navbar">
						<tbody>
							<tr>
								<td></td>
								<td>${data.brand}</td>
								<td><a href="<c:url value="/index" />">Home</a></td>
								<td><a href="<c:url value="/courses" />">Courses</a></td>
								<td><a href="<c:url value="/contactus" />">Contact Us</a></td>
								<c:choose>
									<c:when test="${type == 2}">
										<td><a href="<c:url value="/manage" />">Manage</a></td>
									</c:when>
								</c:choose>
								<c:choose>
									<c:when test="${user == null}">
										<td><a href="<c:url value="/registration" />">Register</a></td>
										<td><a href="<c:url value="/login" />">Login</a></td>
									</c:when>
									<c:otherwise>
										<td><a href="<c:url value="/logout" />">Logout</a></td>
										<td class="username"><a href="<c:url value="/logout" />">${user}</a></td>
									</c:otherwise>
								</c:choose>
							</tr>
						</tbody>

					</table></td>
			</tr>
			<tr>
				<td ><jsp:include
						page="${request.contextPath}/${page }"></jsp:include>
						<br><br></td>
			</tr>
			<tr>
				<td><table id="footer">
						<tbody>
							<tr>

								<td><a href="">One</a></td>
								<td><a href="">Two</a></td>

								<td><a href="">Three</a></td>

								<td><a href="">Four</a></td>

								<td><a href="">Five</a></td>
								<td><a href="">Six</a></td>

								<td><a href="">Seven</a></td>

								<td><a href="">Eight</a></td>

								<td><a href="">Nine</a></td>

							</tr>
						</tbody>

					</table></td>
			</tr>
		</tbody>
	</table>
	
	<script type="text/javascript">
	function accepted(){
		alert("Your request has been accepted.");
	}
	function rejected(){
		alert("Your request has been Rejected.");
	}
	
	function regis(){
		alert("Your request will be processed soon");
	}
	</script>
	
</body>

</html>