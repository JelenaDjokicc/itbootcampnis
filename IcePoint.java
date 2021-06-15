package Caribic;

public class IcePoint extends Product {
//	Kreirati klasu IcePoint koja nasledjuje klasu Proizvod i koja ima:
//		 tip sladoleda (vanila, cokolada)
//		 atribut koji kaze da li je mali ice point ili veliki (promenljiva tipa boolean)
//		 override uje metodu koja ukupnu cenu racuna:
//		ako je mali ice point na cenu svih dodataka doda 100
//		ako je veliki ice point cenu svih dodataka doda 130
//		override uje metodu stampaj da stampa sve podatke
	
	private String iceCreamTaste;
	private boolean size;
	
	
	public IcePoint(String iceCreamTaste, boolean size) {
		this.iceCreamTaste = iceCreamTaste;
		this.size = size;
	}

	public String getIceCreamTaste() {
		return iceCreamTaste;
	}

	public void setIceCreamTaste(String iceCreamTaste) {
		this.iceCreamTaste = iceCreamTaste;
	}

	public boolean isSize() {
		return size;
	}

	public void setSize(boolean size) {
		this.size = size;
	}


	@Override
	public  double totalPrice () {
		double totalPrice = 0;
		if (this.size==true) {
			totalPrice = this.totalPrice() + 130;		
		}else if (this.size==false){
			totalPrice = this.totalPrice() + 100;
		} return totalPrice;
		 
		
	}

	@Override
	public void print() {  
		System.out.println(this.iceCreamTaste + ", " + this.totalPrice());
	
	}

	
	


}
