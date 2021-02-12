class Attractie {
	String naam;
	double kosten;
	double omzet;
	int aantalKaartjes;
	
	
	static void inActie(Attractie attractie) {
		System.out.println("De attractie " + attractie.naam + " draait!\n");
		attractie.omzet += attractie.kosten;
		attractie.aantalKaartjes += 1;
	}

}
