<%@page import="Models.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
	%>

	<div class="users-page">
		<h2 class="text-center mt-5">Lista Usuarios</h2>
		<div class="container mt-5">
			<!-- Tabla -->
			<table class="table table-striped table-hover">
				<thead class="table-dark">
					<tr>
						<th scope="col">Rut</th>
						<th scope="col">Nombre</th>
						<th scope="col">Apellido</th>
						<th scope="col">Telefono</th>
					</tr>
				</thead>
				<!-- row -->
				<%
				for (Usuario itemUsuario : listaUsuarios) {
				%>
				<tr>
					<td><%= itemUsuario.getRut()%> </td>
					<td><%= itemUsuario.getNombre()%> </td>
					<td><%= itemUsuario.getApellido()%> </td>
					<td><%= itemUsuario.getTelefono()%> </td>
				</tr> 
				<%
				}
				%>
				</tbody>

			</table>
		</div>
		>


	</div>

</body>
</html>