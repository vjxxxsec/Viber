<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.center {
  margin: auto;
  width: 60%;
 padding: 10px;
}
.form{
        padding: 20px;
        display: none;
        margin-top: 20px;
    }
    .individual{ }
    .joint{  }
</style>

<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script>
$(document).ready(function(){
    $('input[type="radio"]').click(function(){
        var inputValue = $(this).attr("value");
        var targetBox = $("." + inputValue);
        $(".form").not(targetBox).hide();
        $(targetBox).show();
    });
});
</script>

</head>
<body>
 <div class="center">
         <h1>USER REGISTRATION </h1>
  </div> 
         <div>
                  <label>Individual
                  <input type="radio" value="individual" name="Individual" /> 
         </label>     
           <label>Joint
                    <input type="radio" value="joint"   name="Individual" />  
         </label>          
         </div>
<div >

<form action="register2" class=" joint form"  method="post">

Enter your name: <input type="text" name="name"><br>
Age : <input type="text" name="age"><br>
Adress: <input type="text" name="street"><br>
Aadhaar no: <input type="text" name="aadhar"><br>
Mobile no:<input type="text" name="mobile"><br>
Account password:<input type="text" name="pass"><br>
Re-enter password:<input type="text" name="repass"><br>
Account type :<input type="text" name="acctype" value="joint" readonly="readonly">

<h2 class="center"> Reference for joint account</h2>
Enter accholder name:  <input type="text" name="jname"><br>
Acc No:  <input type="text" name="jaccno"><br>
Relationship:  <input type="text" name="relationship"><br>
Mobile no:<input type="text" name="jmobile"><br>
<input type="submit" value="Submit" >
</form>
</div>

<div   >
<form action="register" class=" individual form" method="post">
Enter your name: <input type="text" name="name"><br>
Age : <input type="text" name="age"><br>
Adress: <input type="text" name="street"><br>
Aadhaar no: <input type="text" name="aadhar"><br>
Mobile no:<input type="text" name="mobile"><br>
Account password:<input type="text" name="pass"><br>
Re-enter password:<input type="text" name="repass"><br>
Account type :<input type="text" name="acctype"  value="Individual" readonly="readonly">
<input type="submit" value="Submit" >
</form>
</div>
</body>
</html>