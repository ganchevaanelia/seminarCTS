package sem11.ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {

	private List<Observator> colectieObservatori;

	public ManagerSalaDeSport() {
		this.colectieObservatori = new ArrayList<>();
	}
	
	public void adaugaObservatori(Observator observator) {
		colectieObservatori.add(observator);
	}
	
	public void stergeObservatori(Observator observator) {
		colectieObservatori.remove(observator);
	}
	
	public void notificaObservatori(String mesajNotificare) {
		for (Observator o : colectieObservatori) {
			o.primesteMesaj(mesajNotificare);
		}
	}
}
