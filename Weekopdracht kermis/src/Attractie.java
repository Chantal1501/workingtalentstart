class Attractie {
	String naam;
	double kosten;
	double omzet;
	int aantalKaartjes;
	
	
	static void inActie(Attractie attracties) {
		System.out.println("De attractie " + attracties.naam + " draait!");
		//attracties.omzet += attracties.kosten;
	}

}
