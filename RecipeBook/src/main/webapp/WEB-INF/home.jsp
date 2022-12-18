<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recipe Book</title>
</head>
<body>
	<h1>We're doing Recipe's Baby Oh yeah</h1>

	<form action="getRecipe.do" method="GET">
		Recipe ID: <input type="text" name="id" /><input type="submit"
			value="Show Recipe" />
			</form>
	<br>	
	<form action="create.do" method="GET">
	Create Your Own Recipe
	
	<p>
	<label for="name">Name</label><input type="text" name="name">
	<br>
	<label for="description">Description</label><input type="text" name="description">
	<br>
	<label for="ingredients">Ingredients</label><input type="text" name="ingredients">
	<br>
	<label for="cookingInstructions">Cooking Instructions</label><input type ="text" name="cookingInstructions">
	<br>
	<label for="history">History</label><input type="text" name="history">
	<br>
	<input type="submit" value="Submit" required>
	</p>
	
	
	</form>
	<c:choose>
		<c:when test="${empty recipeList}">
			<h2>No Recipe Found</h2>
		</c:when>
		<c:otherwise>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>

					</tr>
				</thead>
				<tbody>

					<c:forEach var="recipe" items="${recipeList}">

						<tr>
							<td>${recipe.id}</td>
							<td><a href="getRecipe.do?id=${recipe.id}">${recipe.name}</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:otherwise>
	</c:choose>
	</div>
</body>
</html>