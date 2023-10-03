<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" modelAttribute="command">

<div>
<label>Id</label>
<form:input path="id"/>
</div>


<div>
<label>Medicine Name</label>
<form:input path="medicineName"/>
</div>


<div>
<label>Generic Name</label>
<form:input path="genericName"/>
</div>


<div>
<label>Rate Per Unit</label>
<form:input path="ratePerUnit"/>
</div>

<div>
<label>Date of Manufacturing</label>
<form:input path="dateOfMfg" type="date" />
</div>

<div>
<input type="submit" value ="Add">
</div>




</form:form>
</body>
</html>