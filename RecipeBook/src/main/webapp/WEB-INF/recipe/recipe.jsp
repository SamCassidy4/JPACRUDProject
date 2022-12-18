<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Found Recipe</title>
</head>
<body>



<ul>
<li><a href="">Home</a></li>
</ul>

<form action="getRecipe.do" method="GET">
Recipe ID: <input type="text" name="id"/><input type="submit" value="Show Recipe"/> 
</form>

<h1>Found Recipe</h1>

	<div>
	<h2>${recipe.name}</h2>
	<h2>Ingredients: ${recipe.ingredients }</h2>
	 <h3>Description: ${recipe.description }</h3>
	 <h3>Cooking Instructions: ${recipe.cookingInstructions}</h3>
	  <h4>History: ${recipe.history}</h4> 
	
	</div>
	
	<br>
	<form action="delete.do" method="GET">
	<input type="radio" name="deleteRecipe" value="yes"><label>Yes</label>
		<input type="text" hidden="true" name="rid" value="${recipe.id }">
		<input type="submit" value="Delete Recipe">
	</form>
	<br>
	<br>
	
	<form action="updateView.do" method="GET">
	<input type="radio" name="updateView" value="yes"><label>Yes</label>
		<input type="text" hidden="true" name="id" value="${recipe.id}">
		<input type="submit" value="Edit Recipe">
	</form>



</body>
</html>