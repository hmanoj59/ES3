<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<table class="page">
	<tbody>
		<tr>
			<td><form:form id="loginForm" method="post" action="login"
					modelAttribute="logindetails">
					<c:if test="${loginmessage != null}">
						<h2 class="label label-danger" style="text-align: center;">${loginmessage}</h2>
					</c:if>
					<form:label path="username">Username</form:label>
					<form:input id="username" name="username" path="username" />
					<br>
					<form:label path="username">Password</form:label>
					<form:password id="password" name="password" path="password" />
					<br>
					<br>
					<form:select path="loginType">
						<form:option value="0" label="Student" />
						<form:option value="1" label="Teacher" />
						<form:option value="2" label="Moderator" />
					</form:select>
					<input type="submit" value="Submit" />
				</form:form></td>
		</tr>
	</tbody>
</table>