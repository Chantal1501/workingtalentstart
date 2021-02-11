import java.util.Arrays;
import java.util.Scanner;

public class Letter_volgorde {
	public static void main(String[]args) {
		Scanner invoer = new Scanner(System.in);
		System.out.println("Voer een String in");
		String zin = invoer.nextLine();
		System.out.println("De ingevoerde String is: " + zin);
		char[] karakterLijst = aanmakenKarakterLijst(zin);
		Arrays.sort(karakterLijst);
		printVolgorde(karakterLijst);
		
	}
	
	public static char[] aanmakenKarakterLijst(String zin) {
		char [] karakterLijst = new char[zin.length()];
		for (int x = 0; x < zin.length(); x ++) {
			karakterLijst[x] = zin.charAt(x);
		}
		return karakterLijst;
	}
	
	public static void printVolgorde(char[] karakterLijst) {
		System.out.print("De letters uit de String gesorteerd op alfabetische volgorde zijn: ");
		for (int x = 0; x < karakterLijst.length; x ++) {
			if (karakterLijst[x] != ' ') {
				System.out.print(karakterLijst[x]);
			}
		}
	}
}
