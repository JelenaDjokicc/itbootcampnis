package domaci_17_05;

public class ZeleniKarton {
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
	
	private String imePrezime;
	private int brIndexa;
	private String predmet;
	private String imePrezimeProf;
	private int ocena;
	public String getImePrezime() {
		return imePrezime;
	}
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	public int getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(int brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getPredmet() {
		return predmet;
	}
	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public String getImePrezimeProf() {
		return imePrezimeProf;
	}
	public void setImePrezimeProf(String imePrezimeProf) {
		this.imePrezimeProf = imePrezimeProf;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public ZeleniKarton(String imePrezime, int brIndexa, String predmet, String imePrezimeProf, int ocena) {
		
		this.imePrezime = imePrezime;
		this.brIndexa = brIndexa;
		this.predmet = predmet;
		this.imePrezimeProf = imePrezimeProf;
		this.ocena = ocena;
	}
	
	public boolean polozenIspit () {
		boolean polozen = false;
		if (this.ocena > 5 && this.ocena <=10) {
			polozen = true;
		}  return polozen;
	} 
	
	public void stampaj () {
		System.out.println("(" + this.predmet + ")" + " - " + "(" + this.ocena + ")");
		System.out.println("Student: " + this.imePrezime + ", " + this.brIndexa );
		System.out.println("Profesor: " + this.imePrezimeProf);
	}
	
}
