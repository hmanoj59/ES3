<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib
	prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"
%>
<%@ taglib
	prefix="fmt"
	uri="http://java.sun.com/jsp/jstl/fmt"
%>
<%@ taglib
	prefix="fn"
	uri="http://java.sun.com/jsp/jstl/functions"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=UTF-8"
>
<meta
	name="viewport"
	content="width=device-width, initial-scale=1"
>
<title>ESCube</title>
<!-- Latest compiled and minified CSS -->

<link
	href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet"
>
<link
	href="<c:url value="/resources/css/bootstrap-theme.min.css" />"
	rel="stylesheet"
>


<!-- Optional theme -->

<link
	href="<c:url value="/resources/css/escube.css" />"
	rel="stylesheet"
>
<link
	href="<c:url value="/resources/css/login.css" />"
	rel="stylesheet"
>
<link
	href="<c:url value="/resources/css/registration.css" />"
	rel="stylesheet"
>



<!-- Latest compiled and minified JavaScript -->
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>

<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

<link
	href='https://fonts.googleapis.com/css?family=Roboto+Condensed:400,300,300italic,400italic,700,700italic'
	rel='stylesheet'
	type='text/css'
>
<style>
body {
	font-family: 'Roboto Condensed', sans-serif;
	/*                background-color: rgba(0, 0, 0, 0.7);*/
}

#navbar {
	background-color: rgba(255, 255, 255, 0.7);
	padding: 10px;
	border-radius: 5px;
	margin: 0 auto;
	width: 500px;
	background-color: deepskyblue;
	box-shadow: 0px 0px 5px 2px darkgray, inset 0px 0px 2px 1px whitesmoke;
}

#navbar a {
	color: black;
	text-decoration: none;
	font-weight: 100;
	color: white;
}

#navbar td {
	text-align: center;
}

#footer {
	background-color: rgba(255, 255, 255, 0.7);
	padding: 10px;
	border-radius: 2px;
	margin: 0 auto;
	background-color: whitesmoke;
	width: 100%;
	position: fixed;
	bottom: 5px;
}

#footer a {
	color: black;
	text-decoration: none;
	font-weight: 100;
	color: gray;
	font-size: 14px;
}

#footer td {
	text-align: center;
}

#content {
	height: auto;
	min-height: 500px;
	text-align: center;
	/*                display: table-cell;*/
	font-size: 300px;
	color: yellowgreen;
}
</style>

</head>
<body>
	<table style="width: 100%;">
		<tbody>
			<tr>
				<td style="text-align: center;"><jsp:include
						page="${request.contextPath}/navbar"
					></jsp:include></td>
			</tr>
			<jsp:include page="${request.contextPath}/${page }"></jsp:include>
			<tr>
				<td>
					<table id="footer">
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
					</table>
				</td>
			</tr>
		</tbody>
	</table>

</body>
</html>