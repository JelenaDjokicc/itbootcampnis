package Atleticar;

public class Skakac extends Atleticar {
	
	public Skakac(String imePrezime, double rezultat) {
		super(imePrezime, rezultat);
		
	}

	@Override
	public boolean boljiRezultat(Atleticar atleticar) {
		if (this.rezultat > atleticar.getRezultat() ) {
			return true;
		}
		return false;
	}
	

}
