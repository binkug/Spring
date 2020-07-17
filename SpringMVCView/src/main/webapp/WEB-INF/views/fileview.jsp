<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- if 나 forEach를 사용하기 위한 태그 라이브러리 설정 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 목록</title>
</head>
<body>
	<div align="center" class="body">
		<h2>파일 목록</h2>
		<table border="1">
			<!-- items에 있는 ${list}가 serviceimpl에 있는 것과 같아야 한다.ㄴ  --> 
			<c:forEach var="item" items="${list}">
				<tr>
					<!-- <td><a href="${pageContext.request.contextPath}/img/${item}">${item}</a></td> -->
					<td><a href="download?filename=${item}">${item}</a></td>
				</tr>	
			</c:forEach>
		</table>
	</div>
</body>
</html>


