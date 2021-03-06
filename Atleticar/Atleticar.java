package Atleticar;

public abstract class Atleticar {
//Kreirati apstraktnu klasu Atleticar čiji su tributi: 
//	ime i prezime privatni
//	i rezultat ostvaren na takmičenju koji je zasticen
//	Javne metode klase su: 
//	apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara
//	(metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//	metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)

	private String imePrezime;
	protected double rezultat;

	public Atleticar(String imePrezime, double rezultat) {
		
		this.imePrezime = imePrezime;
		this.rezultat = rezultat;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePreizme(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public double getRezultat() {
		return rezultat;
	}

	public void setRezultat(double rezultat) {
		this.rezultat = rezultat;
	}

	public abstract boolean boljiRezultat (Atleticar atleticar);

	public void stampa() {
		System.out.println("(" + this.imePrezime + "), (" + this.rezultat + ")");
	}

}
