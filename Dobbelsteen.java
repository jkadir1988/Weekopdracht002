package weekopdracht;

import java.util.Random;

public class Dobbelsteen {
	int aantalOgen;

	int werpen() {
		Random random = new Random();
		int dobbelSteen = random.nextInt(6) + 1;
//		System.out.println(Speler.naam + " heeft " + dobbelSteen + " gegooid!");
		return dobbelSteen;
	}
	@Override
	public String toString() {
		return aantalOgen + "";
	}
}
