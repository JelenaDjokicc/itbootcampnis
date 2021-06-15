package Atleticar;

public class Main_Atleticari {

	public static void main(String[] args) {
		
//		U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika, 
//		učitati podatke o učesnicima obe discipline sa tastature i na ekranu prikazati poruke o pobednicima obe discipline. 

		Disciplina skok = new Disciplina("Skok u dalj", "skakaci");
		Disciplina sprint = new Disciplina("110m s preponama", "trakaci");
		
		skok.dodajAtleticara(new Skakac("Marko Markovic", 8.9));
		skok.dodajAtleticara(new Skakac("Darko Darkovic", 7.2));
		skok.dodajAtleticara(new Skakac("Zarko Zarkovic", 6.8));
		
		skok.diskvalifikujAtleticara("Marko Markovic");
		
		skok.stampajPobednika();
		
		
		sprint.dodajAtleticara(new Trkac("Nikola Nikolic", 10.1));
		sprint.dodajAtleticara(new Trkac("Usain Bolt", 9.1));
		sprint.dodajAtleticara(new Trkac("Dragan Jankovic", 9.9));
		sprint.diskvalifikujAtleticara("Dragan Jankovic");
		sprint.stampajPobednika();
		

	}

}
