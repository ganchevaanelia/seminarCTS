package sem11.ro.ase.cts.memento.clase;

public class Memento {

	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspete;

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public String getEchipaGazda() {
		return echipaGazda;
	}

	public String getEchipaOaspete() {
		return echipaOaspete;
	}

	public Memento(int nrSpectatori, String echipaGazda, String echipaOaspete) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
	}
}
