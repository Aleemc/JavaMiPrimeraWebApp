<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" type="text/css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<form action="ServletOperaciones" method="post">
<label>Input a number:</label>
<input type="text" name="txtNumber1">
</br>
<label> Input another number: </label>
<input type="text" name="txtNumber2" >
</br>
<input type="submit" value="accept">

</form>
<table>

<thead><th>Usuarios</th><th>Contraseñas</th></thead>
<tbody>

<% for (int i=0;i<=10;i++)
{
  out.println("<tr><td><input type\"text\" name=\"admin"+i+"\" placeholder=\"admin"+i+"\"></td><td>admin"+i+"</td></tr>");
}

%>

</tbody>
</table>

</body>
</html>