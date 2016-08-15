<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form id="loginForm" method="post" action="login"
	modelAttribute="logindetails">

	<form:label path="username">Username</form:label>
	<form:input id="username" name="username" path="username" />
	<br>
	<form:label path="username">Password</form:label>
	<form:password id="password" name="password" path="password" />
	<br>
	<br>
	<input type="submit" value="Submit" />
</form:form>