package Caribic;

import java.util.List;

import domaci_21_05.Sector;

public abstract class Product {
//	Kreirati abstraktnu klasu Proizvod koja ima:
//		 niz dodataka
//		 metodu ubaciDodatak koja dodaje dodatak u niz
//		 metodu koja vraca cenu svih dodataka koje ima proizvod
//		 abstraktnu metodu ukupnu racunaj cenu 
//		 abstraktnu metodu stampaj

	protected List<Ingredient> ingredients;

	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void addIngredient (Ingredient ingredient) {
		ingredients.add(ingredient);	
	}
	public double  ingredientPrice () {
		double ingPrice = 0;
		for (int i = 0; i < ingredients.size(); i++) {
		ingPrice = ingPrice + ingredients.get(i).getIngredientPrice();
		}
		 return ingPrice;
	}
	public abstract double totalPrice ();
	
	public abstract void print ();
	
	}

