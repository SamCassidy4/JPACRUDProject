package com.skilldistillery.recipebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		System.out.println(r);
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

	@RequestMapping(path = "updateView.do")
	public String updateView(@RequestParam("id") int id, Model model) {
		Recipe recipe = dao.findById(id);

		model.addAttribute("recipe", recipe);

		return "recipe/update";

	}

	@RequestMapping(path = "update.do")
	public String updateRecipe(int id, String name, String description, String ingredients, String cookingInstructions,
			String history, RedirectAttributes redir) {
		Recipe update = new Recipe();

		update.setName(name);
		update.setDescription(description);
		update.setIngredients(ingredients);
		update.setCookingInstructions(cookingInstructions);
		update.setHistory(history);

		dao.update(id, update);

		redir.addAttribute("id", id);
		return "recipe/display";

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
