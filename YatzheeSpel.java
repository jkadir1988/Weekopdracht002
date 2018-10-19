package weekopdracht;

import java.util.ArrayList;
import java.util.Scanner;

public class YatzheeSpel {
	boolean doorSpelen = true;
	Scanner tekstInvoeren = new Scanner(System.in);
	ArrayList<Dobbelsteen> dobbelsteen = new ArrayList<>();

	YatzheeSpel() {
		int[] blokkeerArray = { 0,0,0,0,0 };
		for (int i = 0; i < 5; i++) {
			Dobbelsteen dice = new Dobbelsteen();
			dice.aantalOgen = dice.werpen();
			dobbelsteen.add(dice);
		}
	}

	void spelen() {
		while (doorSpelen) {
			System.out.println("Druk op Enter om door te gaan of kies 'q' om te stoppen");
			String invoer = tekstInvoeren.nextLine();
			verwerkenSpelen(invoer);
		}
	}

	void verwerkenSpelen(String deInvoer) {
		switch (deInvoer) {
		case "":
			doorSpelen = true;
			System.out.println("Positie: 	       [1, 2, 3, 4, 5]");
			System.out.println("Gegooide dobbelstenen: " + dobbelsteen);
			vasthouden();
			break;
		case "q":
			doorSpelen = false;
			System.out.println("Einde!");
			break;
		default:
			System.out.println("\nToets een geldige knop aub!");
			break;
		}
	}

	void vasthouden() {
		System.out.println("Welke posities wilt u vasthouden?");
		String invoerVasthouden = tekstInvoeren.nextLine();
		for(int h = 0 ; h < dobbelsteen.size() ; h++) {
			char j = invoerVasthouden.charAt(h);
			String l = Character.toString(j);
			
			
	//		invoerVasthouden = Integer.parseInt(invoerVasthouden) - 1;
			System.out.println(dobbelsteen.get(h));
		}
	}
}
