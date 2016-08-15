<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<ul id="leftpaneCourseList" style="margin-top: 1px;">
	<c:forEach items="${data.courses}" var="course">
		<fmt:formatNumber var="coursePerCent"
			value="${course.getNumRegistered() / course.getCapacity() * 100}"
			maxFractionDigits="0" />
		<li>
			<h4 class="title">${course.getCourseName() }</h4>
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
			<div class="links"><a onclick="regis();") href="">Register</a><a href="">more</a></div>
			
			<%-- <p class="description">
				${course.getDescription() }</p> --%> <%-- 				<img src="${pageContext.request.contextPath}/resources/courseIcons/${course.getIconUrl()}" />
 --%> <%--  <div class="progress">
				<div class="progress-bar" role="progressbar" aria-valuenow="60"
					aria-valuemin="0" aria-valuemax="100" style="width: ${coursePerCent}%;">
					<c:out value="${coursePerCent}" />%
				</div>
			</div> --%>
		</li>
	</c:forEach>
</ul>