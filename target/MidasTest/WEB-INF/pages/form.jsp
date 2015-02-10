<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet" />
<title>Web Portal</title>
</head>
<body>

	<h1>What's Lorem Ipsum and how did it become so popular?</h1>
	<p>Lorem Ipsum is simply dummy text of the printing and typesetting
		industry. Lorem Ipsum has been the industry's standard dummy text ever
		since the 1500s, when an unknown printer took a galley of type and
		scrambled it to make a type specimen book. It has survived not only
		five centuries, but also the leap into electronic typesetting,
		remaining essentially unchanged. It was popularised in the 1960s with
		the release of Letraset sheets containing Lorem Ipsum passages, and
		more recently with desktop publishing software like Aldus PageMaker
		including versions of Lorem Ipsum.</p>

	<form:form id="registerForm" modelAttribute="comment" method="post"
		action="register">
		<h2 class="subtitle">
			<form:label path="comment">Comment:</form:label>
		</h2>
		<form:textarea path="comment" />
		<input type="submit" value="Send" />
	</form:form>

	<c:if test="${!empty commentList}">
		<table>
			<tr class="row">
				<td>Comments</td>
			</tr>
			<c:forEach items="${commentList}" var="comment">
				<tr class="link">
					<td class="comment"><c:out value="${comment.comment}" /></td>
					<td><a href="delete?id=<c:out value="${comment.id}"/>">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>