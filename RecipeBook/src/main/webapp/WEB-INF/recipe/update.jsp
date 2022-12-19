<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Recipe</title>

<!-- CSS only -->
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
		crossorigin="anonymous">
		
		<link rel="stylesheet" href="css/main.css">
</head>
<body>


<ul>
<li><a href="/">Home</a></li>
</ul>
<h1>Edit Recipe </h1>

<h2>Edit ${recipe.name}</h2>


<p>
	<form action="update.do" method ="GET">
		<input type="hidden" value="${recipe.id}" name="id"/>
	
	
	
	<label for="name">Name</label>
	<input type="text" name="name" value="${recipe.name}" required/>
	<br>
	<label for="description">Description</label>
	<input type="text" name="description" value="${recipe.description}"/>
	<br>
	<label for="ingredients">Ingredients</label>
	<input type="text" name="ingredients" value="${recipe.ingredients}"/>
	<br>
	<label for="cookingInstructions">Cooking Instructions</label>
	<input type="text" name="cookingInstructions" value="${recipe.cookingInstructions}"/>
	<br>
	<label for="history">History</label>
	<input type="text" name="history" value="${recipe.history}"/>
	<br>
	<input type="submit" value="Submit Edited Recipe">
	</p>
	</form>




</body>
</html>