package weekopdracht;

public class WeekOpdracht2Hoofd {
	public static void main(String[] args) {
		Speler speler = new Speler();
		speler.verwelkomen();
		speler.naamInvoer();
		Dobbelsteen dice = new Dobbelsteen();
		dice.werpen();
		YatzheeSpel ys = new YatzheeSpel();
		ys.spelen();
		

	}
}

