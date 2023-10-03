<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Print Medicine List</title>
<style type="text/css">
table{

border: 1px solid blue;
border-collapse: collapse;
margin-left: auto;
margin-right: auto;
}

tr,td,th{
border: 1px solid blue;

}
</style>
</head>
<body>

<h1 style="text-align: center;">Medicine List</h1>
<table>

<tr>
<th>Medicine Name</th>
<th>Generic Name</th>
<th>Rate Per Unit</th>
<th>Date of Manufacture</th>

</tr>

<c:forEach items="${data}" var="item">
<tr>
<td> <c:out value="${item.medicineName}"/>
</td>
<td> <c:out value="${item.genericName}"/>
 </td>
<td> <c:out value="${item.ratePerUnit}"/>
 </td>
<td>  <c:out value="${item.dateOfMfg }"/>
</td>
 </tr> 

  </c:forEach>
  </table>
  
</body>
</html>