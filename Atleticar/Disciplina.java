package Atleticar;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
//	Kreirati i klasu Disciplina čiji su privatni atributi: 
//		ime discipline
//		tip discipline (Trkacka ili Skakacka)
//		niz atletičara koji učestvuju u toj disciplini. 
	
	private String imeDiscipline;
	private String tipDiscipline;
	private List<Atleticar> atleticari;
	
	public Disciplina() {
		this.atleticari = new ArrayList<Atleticar>();
	}
	
	public Disciplina(String imeDiscipline, String tipDiscipline) {
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
	}

	public String getImeDiscipline() {
		return imeDiscipline;
	}

	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}

	public String getTipDiscipline() {
		return tipDiscipline;
	}

	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}

	public List<Atleticar> getAtleticari() {
		return atleticari;
	}
	
    
	public void dodajAtleticara (Atleticar atleticar) {
		atleticari.add(atleticar);
	}
	
	public void diskvalifikujAtleticara (String imePrezime) {
	     for (int i =0; i < atleticari.size(); i++) {
	    	 if (atleticari.get(i).getImePrezime().equals(imePrezime)) {
	    		 this.atleticari.remove(i);
	    	 }
	     }
	}
	private Atleticar najboljiRez () {
		Atleticar najbolji = atleticari.get(0);
		for (int i = 0; i < atleticari.size(); i++) {
			 if (this.atleticari.get(i).boljiRezultat(najbolji)) {
				 najbolji = this.atleticari.get(i);
			 } 
					}	 
		      return najbolji;
		
			 } 
	private Atleticar vratiNajboljeg() {
		Atleticar najbolji= this.atleticari.get(0);
		for (int i = 1; i < this.atleticari.size(); i++) {
			if(this.atleticari.get(i).boljiRezultat(najbolji)) {
				najbolji = this.atleticari.get(i);
			}
		}
		
		return najbolji;
	}
	
	public void stampajPobednika() {
		Atleticar najbolji = this.vratiNajboljeg();
		najbolji.stampa();
	}
	
		
	}
	
	
//	U javnom delu klase definisati: 
//		konstuktore, gettere i settere
//		konstruktor koji postavlja ime discipline i tip
//		metodu dodaj atleticara u disciplinu
//		metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//		privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom 
//		metoda koja prikazuje podatke o pobedniku discipline. 
	
	
	


