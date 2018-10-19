package weekopdracht;

import java.util.Scanner;

public class Speler {
	String naam;

	void verwelkomen() {
		System.out.println("Welkom bij Yatzhee !");
		Speler speler = new Speler();
//		System.out.println("\nWelkom " + Speler.naam);
	}
	
	void naamInvoer() {
		System.out.println("Voer uw naam in: ");
		Scanner inputNaam = new Scanner(System.in);
		naam = inputNaam.nextLine();
		System.out.println("Naam speler : " + naam);

	}
}
