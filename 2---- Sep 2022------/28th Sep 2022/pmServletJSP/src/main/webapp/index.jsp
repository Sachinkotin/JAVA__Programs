<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Data of Prime Minister</h1><br><br>
<form action="pmdetail" method="post">
Name: <input type="text" name="Name"><br><br>
Country: <select name="Country">
<option value="India">India</option>
<option value="USA">USA</option>
<option value="South Africa">South Africa</option>
<option value="Russia">Russia</option>
<option value="France">France</option>
</select><br><br>
Marriage Status: <input type="radio" name="Status" value="Married">Married
				 <input type="radio" name="Status" value="UnMarried">UnMarried<br><br>
Party:  <select name="Party">
<option value="BJP">BJP</option>
<option value="INC">INC</option>
<option value="JDS">JDS</option>
<option value="AAP">AAP</option>
</select><br><br>
Age:  <input type="text" name="Age" ><br><br>
Gender: <input type="radio" name="Gender" value="Male">Male
		<input type="radio" name="Gender" value="Female">Female
		<input type="radio" name="Gender" value="Others">Others<br><br>
Period: <input type="text" name="Period" ><br><br> 
Times Represented:<select name="Times">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
</select><br><br>

<input type="submit" value="SAVE">
</form>

</body>
</html>