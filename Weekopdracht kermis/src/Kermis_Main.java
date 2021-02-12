import java.util.Scanner; 

public class Kermis_Main {
	public static void main(String args[]) {
		Botsauto botsauto1 = new Botsauto();
		Spin spin1 = new Spin();
		Spiegelpaleis spiegelpaleis1 = new Spiegelpaleis(); 
		Spookhuis spookhuis1 = new Spookhuis(); 
		Hawaii hawaii1 = new Hawaii(); 
		Ladderklimmen ladderklimmen1 = new Ladderklimmen(); 
		boolean doorgaan = true;
		while (doorgaan == true) {
        	System.out.println("Welke attractie wil je doen?");
        	System.out.println("1: Botsauto\n2: Spin\n3: Spiegelpaleis\n4: Spookhuis\n5: Hawaii\n6: Ladderklimmen");
        	Scanner scanner = new Scanner(System.in);
        	String attractieKeuze = scanner.nextLine();
        	System.out.println(attractieKeuze);
        	switch (attractieKeuze) {
        	case "1": Attractie.inActie(botsauto1); break;
        	case "2": Attractie.inActie(spin1); break;
        	case "3": Attractie.inActie(spiegelpaleis1); break;
        	case "4": Attractie.inActie(spookhuis1); break;
        	case "5": Attractie.inActie(hawaii1); break;
        	case "6": Attractie.inActie(ladderklimmen1); break;
        	default: System.out.println("Helaas dit is geen geldige input. De kermis stopt."); doorgaan = false; break;
        	}
        }
		System.out.println(botsauto1.omzet);
	}
}
