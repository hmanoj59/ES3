<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<table class="page">
	<tbody>
		<tr>
			<td><form:form class="formlook" id="registrationForm" method="post"
					action="register" modelAttribute="newuser">
					<table>
						<tbody>
							<tr>
								<th colspan="2"><h1>User Registration Form</h1></th>
							</tr>
							<tr>
								<td>Email:</td>
								<td><form:input path="email" id="email" name="email"
										type="email" maxlength="50" /></td>
							</tr>
							<tr>
								<td>Password:</td>
								<td><form:input path="password" id="password"
										name="password" type="password" maxlength="50" /></td>
							</tr>
							<tr>
								<td>First Name:</td>
								<td><form:input id="fname" path="fname" name="first" /></td>
							</tr>
							<tr>
								<td>Last Name:</td>
								<td><form:input path="lname" id="lname" name="last"
										maxlength="30" /></td>
							</tr>
							<tr>
								<td>Street Address:</td>
								<td><form:input path="address" id="address" name="address"
										maxlength="100" /></td>
							</tr>
							<tr>
								<td>City:</td>
								<td><form:input path="city" id="city" name="city"
										maxlength="30" /></td>
							</tr>
							<tr>
								<td>State:</td>
								<td><form:input path="state" id="state" name="state"
										maxlength="30" /></td>
							</tr>

							<tr>
								<td>Zip xxxxx or xxxxxxxxx:</td>
								<td><form:input path="zip" id="zip" name="zip"
										pattern="\d{5}(\d{4})?$" maxlength="9" /></td>
							</tr>


							<tr>
								<td>Telephone Number (xxx) xxx-xxxx:</td>
								<td><form:input path="phonenumber" id="phonenumber"
										name="phonenumber" /></td>
							</tr>
							<tr>
								<td>Terms and Conditions:</td>
								<td><input type="checkbox" name="" value=""></td>
							</tr>

							<tr>
								<td>About:</td>
								<td><form:textarea path="comments" id="comments"
										name="comments" rows="4" cols="50" /></td>
							</tr>
							<tr>
								<td>As:</td>
								<td><form:select path="loginType">
										<form:option value="0" label="Student" />
										<form:option value="1" label="Teacher" />
										<form:option value="2" label="Moderator" />
									</form:select></td>
							</tr>
							<tr>
								<td colspan="2"><input id="submit" type="submit" /></td>
							</tr>
						</tbody>
					</table>
				</form:form></td>
		</tr>
	</tbody>
</table>
