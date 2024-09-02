<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/">+Add New Book</a>
	<table border="1">
		<thead>
			<tr>
				<th>s.no</th>
				<th>ProductName</th>
				<th>Price</th>
				<th>Qty</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="products" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${products.name}</td>
					<td>${products.price}</td>
					<td>${products.Qty}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>