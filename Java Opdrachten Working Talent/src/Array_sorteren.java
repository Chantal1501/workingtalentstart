import java.util.Arrays;

public class Array_sorteren {
	public static void main(String [] args) {
		int [] randomLijst = new int[10];
		for (int x = 0; x < 10; x ++) {
			randomLijst[x] = (int)(Math.random() * 100 + 1);
		}
		System.out.println("De originele array was: " + Arrays.toString(randomLijst));
		Arrays.sort(randomLijst);
		System.out.println("De gesorteerde array is: " + Arrays.toString(randomLijst));
	}
}
