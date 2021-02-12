class Kapitein {
	
	void varen(Boot boot) {
		boot.starten();
		if (boot.bootType == "Speedboot") {
			System.out.println("Ik zet even mijn pet af");
		}
		else {
			System.out.println("Ik vaar nu lekker met een " + boot.bootType);
		}
	}

}
