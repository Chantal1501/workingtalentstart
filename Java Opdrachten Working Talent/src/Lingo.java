import java.util.Scanner;

public class Lingo {
	public static void main(String args[]) {
		String woord = "fiets";
		streepjesTonen(woord);
		boolean woordGeraden = false;
		while (woordGeraden == false) {
			Scanner invoer = new Scanner(System.in);
			System.out.println("Voer een woord in");
			String lingoWoord = invoer.nextLine().toLowerCase();
			while(lingoWoord.length() != woord.length()) {
				System.out.println("Helaas dit woord is niet even lang als het lingo woord.");
				Scanner invoer2 = new Scanner(System.in);
				System.out.println("Voer een nieuw woord in");
				lingoWoord = invoer2.nextLine().toLowerCase();
			}
			System.out.println(lingoWoord);
			uitslagCode(woord, lingoWoord);
			if (lingoWoord.equals(woord)) {
				System.out.println("Hoera je hebt het woord geraden!");
				woordGeraden = true;
			}
		}
	}
	
	public static void uitslagCode(String woord, String lingoWoord) {
		
	}
	
	public static void streepjesTonen(String woord) {
		for (int x = 0; x < woord.length(); x++) {
			System.out.print("_ ");
		}
		System.out.print("\n");
	}
}
