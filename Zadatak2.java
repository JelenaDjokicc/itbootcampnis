package Domaci_07_05;

public class Zadatak2 {

	public static void main(String[] args) {
		// Napisati funkciju koja proverava da li je kliknuto u okviru login forme za
		// web stranicu.
		// Funkcija kao parametre prima x i y koordinate za T1, T2 i M i vraca da li je
		// tacka u tom regionu.
		// Napomena: Funkcija prima 6 broja, i vraca true/false.
		// T1 i T2 su pozicije login forme. M je pozicija na kojoj je kliknuto
		

		login(4, 3, 5, 6, 3, 3);

	}

	public static void login(double xT1, double yT1,
							 double xT2, double yT2, 
							 double xM, double yM) {

		boolean logovanje = true;
		boolean nijeUlogovan = false;

		if (xM <= xT1 && yM <= yT1 || xM <= xT2 && yM <= yT2) {
			System.out.println(logovanje);
		} else {
			System.out.println(nijeUlogovan);
		}

	}

}
