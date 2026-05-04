<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Price</th>
<th>RAM</th>
<th>ROM</th>
<th>Version</th>
<th>Color</th>
<th>Weight</th>
<th>Action</th>
</tr>

<c:forEach var="l" items="${data}">
<tr>
<td>${l.id}</td>
<td>${l.nameString}</td>
<td>${l.price}</td>
<td>${l.ram}</td>
<td>${l.rom}</td>
<td>${l.verstionString}</td>
<td>${l.colorString}</td>
<td>${l.weight}</td>

<td>
<a href="delete?id=${l.id}">Delete</a> |
<a href="edit?id=${l.id}">Update</a>
</td>

</tr>
</c:forEach>
</table>