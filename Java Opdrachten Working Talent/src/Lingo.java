import java.util.Scanner;

public class Lingo {
	public static void main(String args[]) {
		String woord = "fiets";
		streepjesTonen(woord);
		boolean woordGeraden = false;
		while (woordGeraden == false) {
			Scanner invoer = new Scanner(System.in);
			System.out.println("Voer een woord in");
			String lingoWoord = invoer.nextLine();
			System.out.println(lingoWoord);
			if (lingoWoord.equals(woord)) {
				System.out.println("Hoera je hebt het woord geraden!");
				woordGeraden = true;
			}
		}
	}
	
	public static void streepjesTonen(String woord) {
		for (int x = 0; x < woord.length(); x++) {
			System.out.print("_ ");
		}
		System.out.print("\n");
	}
}
