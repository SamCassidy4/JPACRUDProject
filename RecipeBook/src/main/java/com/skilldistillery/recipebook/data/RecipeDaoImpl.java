package com.skilldistillery.recipebook.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.recipebook.entities.Recipe;

@Service
@Transactional
public class RecipeDaoImpl implements RecipeDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Recipe findById(int recipeId) {
		return em.find(Recipe.class, recipeId);
	}

	@Override
	public List<Recipe> findAll() {
		String query = "SELECT r FROM Recipe r";
		return em.createQuery(query, Recipe.class).getResultList();
	}

	@Override
	public Recipe create(Recipe recipe) {
		em.getTransaction().begin();
		em.persist(recipe);
		em.getTransaction().commit();
		
		return recipe;
	}

	@Override
	public Recipe update(int id, Recipe recipe) {
		
		Recipe alteredRecipe = em.find(Recipe.class, id);
		
		if(alteredRecipe != null) {
			em.getTransaction().begin();
			
			alteredRecipe.setName(recipe.getName());
			alteredRecipe.setDescription(recipe.getDescription());
			alteredRecipe.setIngredients(recipe.getIngredients());
			alteredRecipe.setCookingInstructions(recipe.getCookingInstructions());
			alteredRecipe.setHistory(recipe.getHistory());
			
			em.getTransaction().commit();
		}
		
		return recipe;
	}

	@Override
	public boolean delete(int id) {
		boolean deleted = false;
		Recipe deletedRecipe = em.find(Recipe.class, id);
		
		if(deletedRecipe != null) {
			em.getTransaction().begin();
			em.remove(deletedRecipe);
			
			deleted =!em.contains(deletedRecipe);
			em.getTransaction().commit();
		}
		return deleted; 
	}

}
