<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}

.btn-3:hover{
	background: #ff96ad;
	box-shadow: 0 0 5px #ff96ad, 0 0 25px
	#ff96ad,0 0 50px #ff96ad,0 0 200px #ff96ad;
}

#outer
{
    width:100%;
    text-align: center;
}
.inner
{
    display: inline-block;
}

</style>
<body>
<ul>
  <li><a class="active" href="/">VJBank</a></li>
  <li style="float:right" ><a href="/About">About us</a></li>
  <li style="float:right"><a href="/contact">Contact</a></li>
</ul>

<br><br>

<div  id="outer">

<button class="btn-3" onclick="window.location='login.jsp'"> Login </button> 
<button class="btn-3" onclick="window.location='register.jsp'"> Register</button>

</div>





</body>
</html>