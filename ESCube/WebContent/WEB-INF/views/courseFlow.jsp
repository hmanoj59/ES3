<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<div id="courseflow">
	<c:forEach items="${data.courses}" var="course" varStatus="status">
		<fmt:formatNumber var="coursePerCent"
			value="${course.getNumRegistered() / course.getCapacity() * 100}"
			maxFractionDigits="0" />
		<div class="largecourse">
			<p class="title">${course.getCourseName() }</p>
			<hr>
			<div>
				<span class="dates"> From: <fmt:formatDate type="date"
						pattern="dd MMM" value="${course.getStartDate() }" /> To: <fmt:formatDate
						type="date" pattern="dd MMM" value="${course.getEndDate() }" />
				</span> <span class="openseats">Open: ${course.getNumRegistered()} /
					${course.getCapacity()} </span>
				<div style="clear: both;"></div>
			</div>
<hr>
			<img
				src="${pageContext.request.contextPath}/resources/courseIcons/${course.getIconUrl()}" />
			<p class="description">${course.getDescription() }</p>
			<%--  <div class="progress">
				<div class="progress-bar" role="progressbar" aria-valuenow="60"
					aria-valuemin="0" aria-valuemax="100" style="width: ${coursePerCent}%;">
					<c:out value="${coursePerCent}" />%
				</div>
			</div> --%>
		</div>
	</c:forEach>
	<div style="clear: both;"></div>
</div>