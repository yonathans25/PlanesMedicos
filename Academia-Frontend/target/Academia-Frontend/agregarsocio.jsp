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
<link href="<s:url value='socio.css'   />" rel="stylesheet" type="text/css"/>

<title>ABM</title>
</head>
<body>
	<h1>Agregar un socio</h1>
	<s:form name="formulario"  method="get">
		<%-- <table class="contenedor-tabla">
			<tr>
				<th>Numero de Socio</th>
				<td><s:textfield name="numeroSocio" id="numerodesocio" /></td>
			</tr>
			<tr>
				<th>Plan</th>
				
				<td><s:textfield name="planes" id="plan"  /></td>

				
			</tr>
			<tr>
				<th>Nombre y apellido</th>
				<td><s:textfield name="nombreApellido" id="nombreyapellido"  /></td>
			</tr>
			<tr>
				<th>Sexo</th>
				<td><s:textfield name="sexo" id="sexo"  /></td>
			</tr>
			<tr>
				<th>Estado civil</th>
				<td><s:textfield name="estadocivil" id="estado"  /></td>
			</tr>
			<tr class="oculto">
				<th>Nombre y apellido de esposa</th>
				<td><s:textfield name="nombreCoyuge" id ="nombreapellidoesposa" /></td>
			</tr>

			<tr class="oculto">
				<th>Tiene hijos?</th>
				<td>Si<s:textfield name="cantidadHijos" id="hijos"  /></td>
			<tr>
				<th>dni</th>
				<td><s:textfield name="dni" id ="dni" /></td>
			</tr>
			<tr>
				<th>telefono</th>
				<td><s:textfield name="telefono" id="telefono"  /></td>
			</tr>
			<tr>
				<th>direccion</th>
				<td><s:textfield name="direccion" id="direccion" /></td>
			</tr>
			<tr>
				<td><input type="button" value="Volver" class="boton-volver" ></input></td>
				<td><s:submit id="confirmar" type="submit" value="Confirmar" class="confirmar-socio" /></td>
			</tr>
		</table> --%>
	</s:form>
</body>
</html>