package com.skilldistillery.recipebook.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;

	private String description;

	@Column(name = "image_url")
	private String imageUrl;

	private String ingredients;

	@Column(name = "cooking_instructions")
	private String cookingInstructions;
	
	
	
	public Recipe() {}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public String getIngredients() {
		return ingredients;
	}



	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}



	public String getCookingInstructions() {
		return cookingInstructions;
	}



	public void setCookingInstructions(String cookingInstructions) {
		this.cookingInstructions = cookingInstructions;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		return id == other.id;
	}



	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl
				+ ", ingredients=" + ingredients + ", cookingInstructions=" + cookingInstructions + "]";
	}
	
}
	

	