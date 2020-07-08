<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- if 나 forEach를 사용하기 위한 태그 라이브러리 설정 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center" class="body">
		<h2>파일 목록</h2>
		<table>
			<c:forEach var="item" items="${list }">
				<tr>
					<td><a href="${pageContext.request.contextPath}/img/${item}">${item}</a></td>
					<!--download 라는 요청에 filename 이라는 파라미터로 파일 이름을 넘겨주도록 요청을 생성  -->
					<td><a href="download?filename=${item}">${item}</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>