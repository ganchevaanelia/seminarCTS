package sem10.ro.ase.cts.strategy.main;

import sem10.ro.ase.cts.strategy.clase.*;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Alice");
		
		client.plateste(30);
		client.setTipPlata(new PlataCard());
		client.plateste(25);
	}

}
