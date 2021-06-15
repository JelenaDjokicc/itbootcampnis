package Atleticar;

public class Trkac extends Atleticar {


	public Trkac(String imePrezime, double rezultat) {
		super(imePrezime, rezultat);
	}

	@Override
	public boolean boljiRezultat(Atleticar atleticar) {
		
		return this.rezultat < atleticar.rezultat;
	}
	

	
	
}


