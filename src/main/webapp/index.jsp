<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" charset="text/html; charset=UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Formulario son JSP</title>
</head>
<body>
	<div class="mt-5 container">
		<div class="row">
			<div class="col-6 offset-3">
				<h2 class="text-center mb-5">Formulario de Datos</h2>
				
				<form action="Usuarios" method="post">

					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre</label> <input
							type="text" class="form-control" id="nombre" name="nombre"
							required>
					</div>

					<div class="mb-3">
						<label for="apellido" class="form-label">Apellido</label> <input
							type="text" class="form-control" id="apellido" name="apellido"
							required>
					</div>

					<div class="mb-3">
						<label for="lenguaje" class="form-label">lenguaje favorito</label>
						<select class="form-control" name="lenguaje">
							<option selected>Abrir menu de seleccion</option>
							<option>Java</option>
							<option>Python</option>
							<option>JavaScript</option>
						</select>
					</div>

					<!-- checkbox -->
					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="intereses"
							value="Inteligencia Artificial" id="flexCheckDefault" checked>
						<label class="form-label" for="flexCheckDefault">Inteligencia
							Artificial</label>
					</div>
					

					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="intereses"
							value="Desarrollo de Software" id="flexCheckDefault" checked>
						<label class="form-label" for="flexCheckDefault">Desarrollo
							de Software</label>
					</div>
					

					<div class="form-check">
						<input class="form-check-input" type="checkbox" name="intereses"
							value="Clean Code" id="flexCheckDefault" checked> <label
							class="form-label" for="flexCheckDefault">Clean Code</label>
					</div>

					<!-- fin de Checkbox -->
					<!-- Radio -->
					<div>
						<input class="form-check-input" type="radio" name="perfil"
							value="FrontEnd" id="flexRadioDefault"> <label
							class="form-check-label" for="flexRadioDefault1">FrontEnd</label>
					</div>
					<div>
						<input class="form-check-input" type="radio" name="perfil"
							value="BackEnd" id="flexRadioDefault"> <label
							class="form-check-label" for="flexRadioDefault1">BackEnd</label>
					</div>
					<div>
						<input class="form-check-input" type="radio" name="perfil"
							value="FullStack" id="flexRadioDefault"> <label
							class="form-check-label" for="flexRadioDefault1">FullStack</label>
					</div>
					<!--Fin Radio -->


					<div class="d-grip gap-2">
						<button type="submit" class="btn btn-primary">Enviar</button>
					</div>
				</form>
				<!-- Fin de Formulario para crear un usuario -->
			</div>
		</div>
		<div class="row mt-2">
			<div class="col-6 offset-3">
				<!-- Obtener Datos de una Base de Datos  -->
				<form action="Usuarios" method="GET">
					<div class="d-grip gap-2">
						<button class="btn btn-success">Obtener Usuarios</button>
					</div>
				</form>
				<!-- Fin Obtener Datos de una Base de Datos  -->
			
			
			</div>
		</div>
	</div>
</body>
</html>