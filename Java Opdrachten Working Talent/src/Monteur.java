import java.util.Arrays;

public class Monteur {		
	
	void repareren(boolean[] kapot_array) {
		int reparatiekosten = 0;
		for (int x = 0; x < kapot_array.length; x ++) {
			boolean kapot = kapot_array[x];
			if (kapot == true) {
				reparatiekosten += 25;
			}	
		}
		System.out.println("De totale reparatiekosten zijn: " + reparatiekosten + " euro.");
	}
}
