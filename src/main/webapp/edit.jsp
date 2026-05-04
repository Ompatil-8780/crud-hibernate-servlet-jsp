<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="update" method="post">

		<input type="hidden" name="id" value="${laptop.id}"> Name: <input
			type="text" name="name" value="${laptop.nameString}"><br>
		<br> Price: <input type="text" name="price"
			value="${laptop.price}"><br>
		<br> RAM: <input type="text" name="ram" value="${laptop.ram}"><br>
		<br> ROM: <input type="text" name="rom" value="${laptop.rom}"><br>
		<br> Version: <input type="text" name="version"
			value="${laptop.verstionString}"><br>
		<br> Color: <input type="text" name="color"
			value="${laptop.colorString}"><br>
		<br> Weight: <input type="text" name="weight"
			value="${laptop.weight}"><br>
		<br> <input type="submit" value="Update">

	</form>
</body>
</html>