<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="socio.js"></script>

<link href="<s:url value ='socio.css'/>" rel="stylesheet" type="text/css"/>
<title>ABM</title>
</head>
<body>
	<h1>Lista de socios</h1>

	<s:form action="addSocio" namespace="/" >
	<s:submit />
  </s:form>
  
	<!-- <form>
		<div id="adicionados"></div>
			<table id="mytable" class="tabla-socios">
				<tr>
					<th>Numero de socio</th>
					<th>Plan</th>
					<th>Nombre y apellido</th>
					<th>Sexo</th>
					<th>Estado civil</th>
					<th>Nombre y apellido esposa</th>
					<th>Hijos</th>
					<th>Dni</th>
					<th>Telefono</th>
					<th>Direccion</th>
				</tr>
			</table>	
	</form> -->
</body>
</html>
