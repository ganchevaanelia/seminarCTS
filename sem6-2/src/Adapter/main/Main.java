package Adapter.main;

import Adapter.clase.Bilet;
import Adapter.clase.BiletAdaptor;
import Adapter.clase.BiletAdaptorClase;
import Adapter.clase.IBiletOnline;

public class Main {
	
private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
			bilet.rezervare();
			bilet.vanzare();
		}

private static void rezervaSiAfiseazaBiletLaCasaOnline(IBiletOnline bilet) {
	bilet.rezervaBiletOnline();
	bilet.vindeBiletOnline();
}

	public static void main(String[] args) {
		
		
		Bilet bilet = new Bilet(30f);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		IBiletOnline adaptor = new BiletAdaptor(bilet);
		rezervaSiAfiseazaBiletLaCasaOnline(adaptor);

		IBiletOnline biletOnlineClasa = new BiletAdaptorClase(44);
		rezervaSiAfiseazaBiletLaCasaOnline(biletOnlineClasa);
	}

}
