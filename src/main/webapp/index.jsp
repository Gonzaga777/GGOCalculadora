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

<div class="container col-6 border-secondary"style="background-color:orange; margin-top:100px;">
<form method="post" action="Calculadora">
    <h1 style="margin-left:143px;">Calculadora</h1>
	<div class="mb-4 col-4">
	<b >Primeiro Valor</b>
	<input style="width: 417px;" type="number" name="val1" class="form-control">
	</div>
	
	<div class="mb-4 col-4">
	<b >Segundo Valor</b>
	<input style="width: 417px;" type="number" name="val2" id="valor1" class="form-control">
	</div>
	
	 
	<button type="reset" class="btn btn-secondary">Limpar</button>
	<button type="submit" name="Somar" name="Somar"class="btn btn-secondary">Somar</button>
	<button type="submit" name="Multiplicar" name="Multiplicar" class="btn btn-secondary">Multiplicar</button>
	<button type="submit" name="Dividir" name="Dividir"class="btn btn-secondary">Dividir</button>
	<button type="submit" name="Subtrair" name="Subtrair"class="btn btn-secondary">Subtrair</button>
	
	
	</form>
	
<div class="row bg-success"style="margin-top:29px"><h2 style="color:white;">Resultado = ${requestScope.res }</h2></div>

</div> 
</div>
</body>
</html>