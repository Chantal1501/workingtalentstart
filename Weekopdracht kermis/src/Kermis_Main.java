import java.util.Scanner; 

public class Kermis_Main {
	public static void main(String args[]) {
		double kassa = 0;
		int aantalKaartjes = 0;
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
        	System.out.println("Voor het bekijken van de totale omzet kies 'o'. Voor het bekijken van het aantal verkochte kaartjes kies 'k'.");
        	Scanner scanner = new Scanner(System.in);
        	String attractieKeuze = scanner.nextLine();
        	System.out.println(attractieKeuze);
        	switch (attractieKeuze) {
        	case "1": Attractie.inActie(botsauto1); kassa += botsauto1.kosten; aantalKaartjes += 1; break;
        	case "2": Attractie.inActie(spin1); kassa += spin1.kosten; aantalKaartjes += 1; break;
        	case "3": Attractie.inActie(spiegelpaleis1); kassa += spiegelpaleis1.kosten; aantalKaartjes += 1; break;
        	case "4": Attractie.inActie(spookhuis1); kassa += spookhuis1.kosten; aantalKaartjes += 1; break;
        	case "5": Attractie.inActie(hawaii1); kassa += hawaii1.kosten; aantalKaartjes += 1; break;
        	case "6": Attractie.inActie(ladderklimmen1); kassa += ladderklimmen1.kosten; aantalKaartjes += 1; break;
        	case "o": System.out.println("De omzet tot nu toe is: €" + kassa + "\n"); break;
        	case "k": System.out.println("Het aantal verkochte kaartjes tot nu toe is: " + aantalKaartjes + "\n"); break;
        	default: System.out.println("Helaas dit is geen geldige input. De kermis stopt."); doorgaan = false; break;
        	}
        }
		System.out.println("Totale omzet: " + kassa + "\nBotsauto omzet: " + botsauto1.omzet);
		System.out.println("Aantal kaartjes: " + botsauto1.aantalKaartjes);
	}
}
