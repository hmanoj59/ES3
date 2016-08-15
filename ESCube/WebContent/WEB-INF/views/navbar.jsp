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
<%@ page session="true"%>

<table id="navbar">
	<tbody>
		<tr>
			<td>${data.brand}<span class="label label-success">${user}</span></td>
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
					<td><a href="<c:url value="/logout" />">${user}</a></td>
				</c:otherwise>
			</c:choose>
		</tr>
	</tbody>

</table>