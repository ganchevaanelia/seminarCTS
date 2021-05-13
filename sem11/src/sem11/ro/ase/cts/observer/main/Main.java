package sem11.ro.ase.cts.observer.main;

import sem11.ro.ase.cts.observer.clase.*;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		Client client1 = new Client("Dan");
		Client client2 = new Client("Razvan");
		Client client3 = new Client("Florin");
		
		manager.adaugaObservatori(client1);
		manager.adaugaObservatori(client2);
		manager.adaugaObservatori(client3);
		
		manager.anuntaMeci("Footbal");
		
		manager.stergeObservatori(client3);
		manager.anuntaMeci("Handball");
	}

}
