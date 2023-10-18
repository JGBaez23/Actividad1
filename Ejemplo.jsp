<%@ page language="java" contentType="text/html; charset=ISO-UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Calculo.Triangulo" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" charset="UTF-8">
<title>calculo</title>
</head>
<body>
<h3>El perimetro de tu operacion es:</h3>
<% 
String b1=request.getParameter("base1");
String b2=request.getParameter("base2");
String b3=request.getParameter("base3");

Perimetro p = new Perimetro(b1, b2, b3);
p.hacerPerimetro();
int perimetro = p.getPerimetro();
%>
</body>
</html>