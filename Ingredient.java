package Caribic;

public class Ingredient {
//	Kreirati klasu Dodatak ili Sastojak kako hocete koja ima:
//		 naziv dodatka
//		 cenu dodatka
//		 konstruktore, gettere i settere koji su vam potrebni
//		 metodu stampaj koja stampa u formatu:
//		(dodatak)  (cena)

	private String ingredientName;
	private int ingredientPrice;
	public Ingredient(String ingredientName, int ingredientPrice) {
		this.ingredientName = ingredientName;
		this.ingredientPrice = ingredientPrice;
	}
	public String getIngredientName() {
		return ingredientName;
	}
	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}
	public int getIngredientPrice() {
		return ingredientPrice;
	}
	public void setIngredientPrice(int ingredientPrice) {
		this.ingredientPrice = ingredientPrice;
	}
	public void print () {
		System.out.println("(" + this.ingredientName + ")  (" + this.ingredientPrice);

	}
	

}
