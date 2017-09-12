<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" width="600" align="center">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>密码</td>
			<td>生日</td>
			<td>年龄</td>
			<td>邮箱</td>
		

		</tr>
		<c:forEach items="${list}" var="reg">
			<tr>
				<td>${reg.id}</td>
				<td>${reg.name}</td>
				<td>${reg.password}</td>
				<td><fmt:formatDate value="${reg.birthday}" pattern="yyyy-MM-dd"/></td>
				<td>${reg.age}</td>
				<td>${reg.email}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>