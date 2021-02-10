import java.util.Scanner;
public class String_plakker {
	public static void main(String[] args) {
		Boolean nieuwe_string = true;
		String concat_string = "";
		while (nieuwe_string == true) {
			Scanner invoer = new Scanner(System.in);
			System.out.println("Voer een nieuwe string in");
			String ingevoerde_string = invoer.nextLine();
			System.out.println("Wil je nog een nieuwe string invoeren? (ja/nee)");
			String keuze = invoer.nextLine();
			concat_string += ingevoerde_string;
			if (keuze.equals("nee")) {
				nieuwe_string = false;
			} else {
				nieuwe_string = true;
			}	
		}
		System.out.println("De samengevoegde string is: " + concat_string);
	}
}
