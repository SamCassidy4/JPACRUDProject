package com.skilldistillery.recipebook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.recipebook.data.RecipeDAO;

@Controller
public class RecipeController {
	
	@Autowired
	private RecipeDAO dao;
	
	@RequestMapping(path= {"/","home.do"})
	public String goToHome(Model model) {
		model.addAttribute("recipeList", dao.findAll());
		return "home";
	}

}
