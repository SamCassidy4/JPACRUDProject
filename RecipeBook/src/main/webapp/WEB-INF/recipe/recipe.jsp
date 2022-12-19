<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Found Recipe</title>



<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
		crossorigin="anonymous">
		
		<link rel="stylesheet" href="css/main.css">
</head>
<body>

<div class="container-fluid"></div>



<ul>
<li><a href="/">Home</a></li>
</ul>

<form action="getRecipe.do" method="GET">
Recipe ID: <input type="text" name="id"/><input type="submit" value="Show Recipe"/> 
</form>

<h1>Found Recipe</h1>

	<div>
	<strong><h3>${recipe.name}</h3></strong>
			<br>
			<br>
	<em><h3>Ingredients: </em></h3>
		<h4>${recipe.ingredients}</h4>
			<br>
			<br>
	<em> <h3>Description: </h3></em>
		 <h4>${recipe.description}</h4>
			 <br>
			 <br>
	<em><h3>Cooking Instructions:</h3></em>
	 <h4>${recipe.cookingInstructions}</h4>
	 <br>
	 <br>
	  <em><h4>History:</h4> </em>
	  <h5>${recipe.history }</h5>
	
	</div>
	
	<br>
	<form action="delete.do" method="GET">
	<!-- <input type="radio" name="deleteRecipe" value="yes"><label>Yes</label> -->
		<input type="text" hidden="true" name="rid" value="${recipe.id }">
		<input type="submit" value="Delete Recipe">
	</form>
	<br>
	<br>
	
	<form action="updateView.do" method="GET">
	<!-- <input type="radio" name="updateView" value="yes"><label>Yes</label> -->
		<input type="text" hidden="true" name="id" value="${recipe.id}">
		<input type="submit" value="Edit Recipe">
	</form>



</body>
</html>