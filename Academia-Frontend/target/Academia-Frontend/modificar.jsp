<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="socio.js"></script>
<link rel="stylesheet" href="socio.css">
<title>ABM</title>
</head>
<body>
	<h1>Modificar socio</h1>
	<form name="formulario" action="C:Users/alumno/desktop/index.html"
		onsubmit="return validateForm()" method="post">
		<table class="contenedor-tabla">
			<tr>
				<th>Numero de Socio</th>
				<td><input id="numerodesocio" type="text"></input></td>
			</tr>
			<tr>
				<th>Plan</th>
				<td><select id="plan">
						<option value="Plan">Seleccione</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
				</select></td>
			</tr>
			<tr>
				<th>Nombre y apellido</th>
				<td><input id="nombreyapellido" type="text"></input></td>
			</tr>
			<tr>
				<th>Sexo</th>
				<td><select>
						<option value="Sexo">Seleccione</option>
						<option value="masculino">masculino</option>
						<option value="femenino">femenino</option>
				</select></td>
			</tr>
			<tr>
				<th>Estado civil</th>
				<td><select>
						<option value="estadocivil">Seleccione</option>
						<option value="casado">casado</option>
						<option value="soltero">soltero</option>
				</select></td>
			</tr>
			<tr class="oculto">
				<th>Nombre y apellido de esposa</th>
				<td><input type="text"></input></td>
			</tr>

			<tr class="oculto">
				<th>Tiene hijos?</th>
				<td>Si<input type="checkbox"></input></td>
			<tr>
				<th>dni</th>
				<td><input type="text"></input></td>
			</tr>
			<tr>
				<th>telefono</th>
				<td><input type="text"></input></td>
			</tr>
			<tr>
				<th>direccion</th>
				<td><input type="text"></input></td>
			</tr>
			<tr>
				<td><input type="button" value="Volver" class="boton-volver"></input></td>
				<td><input id="confirmar" type="submit" value="Modificar"
					class="confirmar-socio"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>