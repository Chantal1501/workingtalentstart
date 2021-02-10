import java.util.Scanner;

public class Aantal_e {
	public static void main(String [] args) {
		int aantal_e = 0;
		Scanner invoer = new Scanner(System.in);
		System.out.println("Voer een woord in");
		String woord = invoer.nextLine();
		for (int x = 0; x < woord.length(); x ++) {
			if (woord.charAt(x) == 'e') {
				aantal_e += 1;
			}
		}
		System.out.println("Er zitten " + aantal_e + " e's in het woord " + woord + ".");
	}
}
