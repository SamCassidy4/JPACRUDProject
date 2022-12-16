package com.skilldistillery.recipebook.data;

import java.util.List;

import com.skilldistillery.recipebook.entities.Recipe;

public interface RecipeDAO {

	Recipe findById(int recipeId);

	List<Recipe> findAll();

	Recipe create(Recipe recipe);

	Recipe update(int id, Recipe reciep);

	boolean delete(int id);

}
