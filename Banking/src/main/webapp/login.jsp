<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.center {
  margin: auto;
  width: 60%;
  border: 3px solid #73AD21;
  padding: 10px;
}
</style>
</head>
<body>
<form action="personaldetails" method="get" >
Enter customer ID:<input type="text" id="cid" name="cid" required="required">  <br>
Password:<input type="password"  id="pass"  name="pass" required="required"> <br>
<input type="submit" value="submit"><br>
<p style="color:red;">${error}</p> 
</form>
<%-- <form:form action="personaldetails" method="get"  modelAttribute="mode"> --%>
<%-- Enter acc no :<form:input path="cid"/><br> --%>
<%-- Enter password :<form:input path="pass"/><br> --%>
<!-- <input type="submit" value="submit"> -->
<%-- </form:form> --%>
</body>
</html>