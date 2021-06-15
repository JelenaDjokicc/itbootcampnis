package Domaci_07_05;

public class Zadatak1 {

	public static void main(String[] args) {
	//Napisati funkciju koja vraca indeks trazenog broj K u nizu N. Niz i K su parametri funkcije. 
    //Napomena ukoliko se vrednost K ne nalazi u nizu vratiti -1.	
	//Primer: 
	//niz = {8,3,4, 5, 0} i K = 33 => vraca -1
	//niz = {8,3,4, 5, 0} i K = 3 => vraca 1
		
	   int [] nizN = { 2, 5, 6, 7, 8, 9, 2, 3, 5, 7, 0};
	
       index ( nizN, 44);

	}
        public static void index ( int [] nizN, int k) {
    	
    	
    	 for (int i = 0; i < nizN.length; i ++) {
    		 if (i == k) { System.out.println (1);}
    	 else {System.out.println(-1);}
    		 
     }
    	 }
}