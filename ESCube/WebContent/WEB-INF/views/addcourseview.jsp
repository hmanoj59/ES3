<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<table class="page">
	<tbody>
		<tr>
			<td><form:form class="formlook" id="addCourseForm" method="post"
					action="finishAddingCourse" modelAttribute="course">
					<table>
						<tbody>
							<tr>
								<th colspan="2"><h1>Add course Form</h1></th>
							</tr>
							<tr>
								<td>Course name:</td>
								<td><form:input path="courseName" id="courseName"
										name="courseName" type="text" maxlength="50" /></td>
							</tr>
							<tr>
								<td>Instructor name:</td>
								<td><form:input path="instructor"/></td>
							</tr>
							<tr>
								<td>Description:</td>
								<td><form:textarea path="description" rows="5" cols="50" /></td>
							</tr>
							<tr>
								<td>Course Num:</td>
								<td><form:input path="courseNum" /></td>
							</tr>
							<%-- <tr>
								<td>Start Date:</td>
								<td><form:input path="startDate"  /></td>
							</tr>

							<tr>
								<td>Start Date:</td>
								<td><form:input path="startDate"  /></td>
							</tr>
							<tr>
								<td>Schedules:</td>
								<td><form:input path="scheduledDates"  /></td>
							</tr> --%>
							<tr>
								<td>Location:</td>
								<td><form:input path="location" /></td>
							</tr>
							<tr>
								<td>Capacity:</td>
								<td><form:input path="capacity" /></td>
							</tr>
							<tr>
								<td>Icon:</td>
								<td><form:input path="iconUrl" /></td>
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
