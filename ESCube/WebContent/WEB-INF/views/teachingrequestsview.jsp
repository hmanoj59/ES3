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
<table class="page">
	<tbody>
		<tr>
			<td>
				<div class="formlook">
					<c:forEach
						items="${teachers}"
						var="teacher"
					>
					<div>
					<div style="width: 300px;">${teacher.fname } ${teacher.lname }</div>
					
					
					<button onclick="accepted();" class="accept">Accept</button><button onclick="rejected();" class="decline">Decline</button>
					</div>
					<br>
					</c:forEach>

				</div>


			</td>
		</tr>
	</tbody>
</table>
