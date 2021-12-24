<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.inner
{
    display: inline-block;
}
</style>
<body>

	<div align="center">
		<h2> Welcome again ${obj.name} </h2>
	</div>
	<div>
	<p> PERSONAL DETAILS </p><br>
	Name : ${obj.name} <br>
	Age : ${obj.age} <br>
	Address : ${obj.address} <br>
	Aadhaar : ${obj.aadhaar} <br>
	Mob no : ${obj.mobno} <br>
<%-- 	Acc type :${obj.Acctype}<br> --%>
	<p align="center"> Jointers details </p> <br>
	Accholder name : ${obj.accholdname} 
	<form action="editpage">
<button> EDIT </button> 
</form>
	</div>



<div>
<p> ACCOUNT DETAILS </p> <br>
	Accno  :${obj.accno}<br>
    Total balance : ${obj.amount} 
</div>

<br>
<button class="inner" onclick="window.location='Deposit.jsp'"> Deposit </button>

<br>

<button  class="inner"  onclick="window.location='transfer.jsp'"> Transfer amount</button>

<!-- <button onclick="window.location='detailsedit.jsp'"> EDIT </button>  -->

</body>
</html>