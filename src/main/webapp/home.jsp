<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To Home Page</h1>
	<form action="save" method="post">
		Name: <input type="text" name="name"><br><br>
		 Price: <input type="text" name="price"><br><br>
		RAM: <input type="text" name="ram"><br> <br>
		ROM: <input type="text" name="rom"><br><br>
		Version: <input type="text" name="version"><br><br>
		 Color: <input type="text" name="color"><br><br>
		  Weight: <input type="text" name="weight"><br><br>
		   <input type="submit" value="Save">
	</form>
	<h3>Search Laptop</h3>

<form action="search" method="get">
    <input type="text" name="keyword" placeholder="Enter laptop name">
    <input type="submit" value="Search">
</form>

<hr>

</body>
</html>