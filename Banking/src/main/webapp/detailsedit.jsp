<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="savepersonaldetails" method="post">
	Name <input type="text" name="name" value="${obj.name}" readonly="readonly"> <br>
	accno  <input type="text" name="accno" value="${obj.accno}" readonly="readonly"> <br>
	Age <input type="text" name="age" value="${obj.age}" > <br>
	Address <input type="text" name="address" value="${obj.address}" > <br>
	Aadhaar <input type="text" name="aadhaar" value="${obj.aadhaar}" readonly="readonly" > <br>
	Mob no <input type="text" name="mobno" value="${obj.mobno}"  > <br>
	<input type="submit" value="Save">
</form>
</body>
</html>