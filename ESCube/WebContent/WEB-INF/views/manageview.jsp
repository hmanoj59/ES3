<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<table>
	<tbody>
		<tr>
			<td>
				<table id="manageNavbar">
					<tbody>
						<tr>
							<td><a href="<c:url value=" addcourse " />">Add Course</a></td>
							<td><a href="<c:url value=" teachingrequests " />">Teaching
									requests</a></td>
							<td><a style="color: gray;" href='javascript:void(0);'>Admin
									requests</a></td>
							<td><a style="color: gray;" href='javascript:void(0);'>Manage
									Courses</a></td>
						</tr>
					</tbody>
				</table>
			</td>
		</tr>
		<tr>
			<td id="view"><c:choose>
					<c:when test="${managepage != null}">
						<jsp:include page="${request.contextPath}/${managepage }"></jsp:include>
					</c:when>
				</c:choose></td>
		</tr>
	</tbody>
</table>