package sem11.ro.ase.cts.template.main;

import sem11.ro.ase.cts.template.clase.*;

public class Main {

	public static void main(String[] args) {
		SpectatorAbstract spectator = new Spectator("Ion");
		SpectatorAbstract spectatorVIP = new SpectatorVIP("Maria");

		spectator.intrareInStadion();
		spectatorVIP.intrareInStadion();
	}

}
