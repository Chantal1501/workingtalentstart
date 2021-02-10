public class Opdracht5_Main {
	public static void main(String[] args) {
		Monteur monteur1 = new Monteur();
		boolean[] kapot_array = {true, false, false, true};
		Auto auto1 = new Auto(kapot_array[0], kapot_array[1], kapot_array[2], kapot_array[3]);
		String [] auto_onderdelen = {"motor", "deur", "voorruit", "uitlaat"};
		System.out.println("Motor kapot: " + auto1.motor + ", Deur kapot: " + auto1.deur + ", Voorruit kapot: " + auto1.voorruit + ", Uitlaat kapot: " + auto1.uitlaat);
		monteur1.repareren(kapot_array);
	}
}
