<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="border border-secondary col-10">
<div class="container col-8">
<form method="post" action="Calculadora">
    <b>Calculadora</b>
	<div class="mb-4 col-4">
	Primeiro Valor
	<input type="text" name="val1" class="form-control">
	</div>
	
	<div class="mb-4 col-4">
	Segundo Valor
	<input type="text" name="val2" id="valor1" class="form-control">
	</div>
	
	<button type="reset" class="btn btn-secondary">Limpar</button>
	<button type="submit" class="btn btn-secondary">Calcular</button>
	
	
	</form>
	
Resultado Soma = ${requestScope.res } <p>
Resultado Subtração = ${requestScope.res2 } <p>
Resultado Multiplicação = ${requestScope.res3 } <p>
Resultado Divisão = ${requestScope.res4 } <p>
</div> 
</div>
</body>
</html>