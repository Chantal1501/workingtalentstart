import java.util.Scanner; 

//Het is mij wel gelukt om de onderhoudsbeurt toe te voegen, maar alleen niet met een abstracte klasse RisicoRijkeAttracties.
//Ook is het mij wel gelukt om de kansspelbelasting te betalen, maar niet om dit met behulp van de interface GokAttractie en de klasse Belastinginspecteur te doen.

public class Kermis_Main {
	public static void main(String args[]) {
		double kassa = 0;
		int aantalKaartjes = 0;
		double kansspelbelasting = 0;
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
        	System.out.println("Voor het bezoek van de belasting inspecteur kies 'b'. ");
        	Scanner scanner = new Scanner(System.in);
        	String attractieKeuze = scanner.nextLine();
        	System.out.println(attractieKeuze);
        	switch (attractieKeuze) {
        	case "1": 
        		Attractie.inActie(botsauto1); 
        		kassa += botsauto1.kosten; 
        		aantalKaartjes += 1; 
        		break;
        	case "2": 
        		Attractie.inActie(spin1); 
        		kassa += spin1.kosten; 
        		aantalKaartjes += 1; 
        		if ((spin1.aantalKaartjes % 5) == 0) {
        			opstellingsKeuring(spin1);
        		}
        		break;
        	case "3": 
        		Attractie.inActie(spiegelpaleis1); 
        		kassa += spiegelpaleis1.kosten; 
        		aantalKaartjes += 1; 
        		break;
        	case "4": 
        		Attractie.inActie(spookhuis1); 
        		kassa += spookhuis1.kosten; 
        		aantalKaartjes += 1; 
        		break;
        	case "5": 
        		Attractie.inActie(hawaii1); 
        		kassa += hawaii1.kosten; 
        		aantalKaartjes += 1;
        		if ((hawaii1.aantalKaartjes % 10) == 0) {
        			opstellingsKeuring(hawaii1);
        		}
        		break;
        	case "6": 
        		Attractie.inActie(ladderklimmen1); 
        		kassa += ladderklimmen1.kosten; 
        		aantalKaartjes += 1; 
        		kansspelbelasting += (0.30 * ladderklimmen1.kosten);
        		break;
        	case "o": 
        		System.out.println("De omzet tot nu toe is: €" + kassa + "\n"); 
        		break;
        	case "k": 
        		System.out.println("Het aantal verkochte kaartjes tot nu toe is: " + aantalKaartjes + "\n"); 
        		break;
        	case "b": 
        		System.out.println("De gereserveerde kansspel belasting is: €" + kansspelbelasting); 
        		System.out.println("De omzet was: €" + kassa);
        		kassa -= kansspelbelasting;
        		ladderklimmen1.omzet -= kansspelbelasting;
        		kansspelbelasting = 0;
        		System.out.println("De omzet wordt nu: €" + kassa + "\n");
        		break;
        	default: 
        		System.out.println("Helaas dit is geen geldige input. De kermis stopt."); 
        		doorgaan = false; 
        		break;
        	}
        }
		System.out.println("Totale omzet= €" + kassa + ", aantal kaartjes= " + aantalKaartjes); 
		System.out.println("Botsauto omzet= €" + botsauto1.omzet + ", aantal kaartjes= " + botsauto1.aantalKaartjes);
		System.out.println("Spin omzet= €" + spin1.omzet + ", aantal kaartjes= " + spin1.aantalKaartjes);
		System.out.println("Spiegelpaleis omzet= €" + spiegelpaleis1.omzet + ", aantal kaartjes= " + spiegelpaleis1.aantalKaartjes);
		System.out.println("Spookhuis omzet= €" + spookhuis1.omzet + ", aantal kaartjes= " + spookhuis1.aantalKaartjes);
		System.out.println("Hawaii omzet= €" + hawaii1.omzet + ", aantal kaartjes= " + hawaii1.aantalKaartjes);
		System.out.println("Ladderklimmen omzet= €" + ladderklimmen1.omzet + ", aantal kaartjes= " + ladderklimmen1.aantalKaartjes);
	}
	
	static void opstellingsKeuring(Attractie attractie) {
		System.out.println("De onderhoudsbeurt aan de " + attractie.naam + " vind plaats.\n");
	}
}
