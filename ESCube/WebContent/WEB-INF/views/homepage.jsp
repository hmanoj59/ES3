<table class="bg">
	<tbody>
		<tr>
			<td id="leftPane"><jsp:include
					page="${request.contextPath}/leftPane"></jsp:include></td>
			<td style="text-align: center;"><jsp:include
					page="${request.contextPath}/content"></jsp:include></td>
		</tr>
		<tr>
			<td colspan="2"><jsp:include page="${request.contextPath}/courseFlow"></jsp:include>
			</td>
		</tr>
	</tbody>
</table>