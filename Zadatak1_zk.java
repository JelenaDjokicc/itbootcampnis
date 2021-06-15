package domaci_17_05;

import java.util.ArrayList;

public class Zadatak1_zk {

	public static void main(String[] args) {
	
		
		ArrayList <ZeleniKarton> zeleniKarton = new ArrayList <ZeleniKarton>();
		ZeleniKarton z1 = new ZeleniKarton("Jovana Milenakovic", 234, "Geeografija", "Mila Pavlovic", 6);
		ZeleniKarton z2 = new ZeleniKarton ("Srecko Savic", 345, "Istorija", "Radoslav Jovanovic", 5);
		ZeleniKarton z3 = new ZeleniKarton ("Milan Kovacevic", 675, "Istorija", "Radoslav Jovanovic", 9);
		ZeleniKarton z4 = new ZeleniKarton ("Milica Ilic", 368, "Hemija", "Zvezdan Jovanovic", 8);
		ZeleniKarton z5 = new ZeleniKarton ("Stefan Stojanovic", 198,"Turisticka geografija", "Ranko Dragovic", 10);
		ZeleniKarton z6 = new ZeleniKarton ("Ljiljana Nikolic", 847, "Informatika", "Milica Pajic", 9);
		ZeleniKarton z7 = new ZeleniKarton ("Sergej Pavlovic", 238, "Geografija", "Mila Pavlovic", 5);
		ZeleniKarton z8 = new ZeleniKarton ("Milunka Jovic", 876, "Fizika", "Goran Rakic", 5);
		ZeleniKarton z9 = new ZeleniKarton ("Suznana Nikolic", 348, "Engleski jezik", "Sonja Maric", 9);

		zeleniKarton.add(z1);
		zeleniKarton.add(z2);
		zeleniKarton.add(z3);
		zeleniKarton.add(z4);
		zeleniKarton.add(z5);
		zeleniKarton.add(z6);
		zeleniKarton.add(z7);
		zeleniKarton.add(z8);
		zeleniKarton.add(z9);
		
		for (int i = 0; i < zeleniKarton.size(); i++) {
			zeleniKarton.get(i).stampaj();
		}
		double avg = 0;
		double sum = 0;
​
		for (int i = 0; i < zeleniKarton.size(); i++) {
			sum = sum + zeleniKarton.get(i).getOcena();
			avg = sum / zeleniKarton.size();
		}

		System.out.println("Prosecna ocena svih ispita je: " + avg);

		double zbirPolozenih = 0;
		double sumPolozenih = 0;
		double avgPolozenih = 0;
​
		for (int i = 0; i < zeleniKarton.size(); i++) {
​
			if (zeleniKarton.get(i).polozenIspit()) {
				sumPolozenih= sumPolozenih + zeleniKarton.get(i).getOcena();
				zbirPolozenih = zbirPolozenih + 1;
			}

		avgPolozenih = sumPolozenih / zbirPolozenih;
​
		System.out.println("Prosecna ocena svih polozenih ispita je: " + avgPolozenih);
​
	}
	}

}
