<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Recipe</title>
</head>
<body>
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
	<input type="submit" value="Show Edited Recipe">
	</p>
	</form>




</body>
</html>