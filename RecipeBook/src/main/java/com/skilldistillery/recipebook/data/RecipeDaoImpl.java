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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Recipe update(int id, Recipe reciep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
