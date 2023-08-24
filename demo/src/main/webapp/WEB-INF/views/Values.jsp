<%@ page import="java.util.Date" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
table,th,td
{
border:2px solid black;
border-collapse:collapse;
}
</style>

</head>
 <body>
 <img  src="<c:url value="./static/images/5509862.jpg" />"/>
  <center>
<table border="1" cellspacing="10" cellpadding="10">
<colgroup>
<col span="1" style="background-color:cyan">
<col span="1" style="background-color:red">
<col span="1" style="background-color:yellow">
<col span="1" style="background-color:green">

</colgroup>
<tr>
<th>ID</th>
<th>PhoneNumber</th>
<th>PhoneCompanyName</th>
<th>PhoneCost</th>
</tr>

<tr>
<th>${details.id }</th>
<th>${details.phonenumber}</th>
<th>${details.phonecompanyname}</th>
<th>${details.phonecost}</th>
</tr>
</table>
</center>
<a href="./done">go back</a>

</body>
</html>