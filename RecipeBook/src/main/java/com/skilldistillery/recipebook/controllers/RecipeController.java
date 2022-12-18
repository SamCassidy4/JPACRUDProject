package com.skilldistillery.recipebook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.recipebook.data.RecipeDAO;
import com.skilldistillery.recipebook.entities.Recipe;

@Controller
public class RecipeController {

	@Autowired
	private RecipeDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String goToHome(Model model) {
		model.addAttribute("recipeList", dao.findAll());
		return "home";
	}

	@RequestMapping(path = "getRecipe.do")
	public String findRecipe(@RequestParam int id, Model model) {
		Recipe r = dao.findById(id);
		System.out.println( r);
		model.addAttribute("recipe", r);
		return "recipe/recipe";
	}

	@RequestMapping(path = "create.do")
	public String createRecipe(Recipe recipe, Model model) {
		Recipe r = dao.create(recipe);
		model.addAttribute("recipe", dao.create(recipe));

		if (r != null) {
			return "recipe/recipe";

		} else
			return "fail";

	}

	@RequestMapping(path = "update.do")
	public String updateRecipe(int id, Recipe recipe, Model model) {
		Recipe r = dao.findById(id);
		model.addAttribute("recipe", r);

		if (r != null) {
			return "recipe/editRecipe";
		} else {
			return "fail";
		}

	}

	@RequestMapping(path = "delete.do")
	public String deleteRecipe(Integer rid, Model model) {
		boolean deletedRecipe = dao.delete(rid);
		model.addAttribute("recipe", deletedRecipe);

		if (deletedRecipe = true) {
			return "recipe/delete";

		} else {
			return "fail";
		}

	}

}
