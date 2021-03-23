package ro.ase.cts.clase;

public class GaraLazy {
	private String nume;
	private int nrColovoze;
	private int nrTrenuri;

	private static GaraLazy instance = null;

	public GaraLazy() {
		super();
		this.nume = "Ruse";
		this.nrColovoze = 15;
		this.nrTrenuri = 1;
	}

	public GaraLazy(String nume, int nrColovoze, int nrTrenuri) {
		super();
		this.nume = nume;
		this.nrColovoze = nrColovoze;
		this.nrTrenuri = nrTrenuri;
	}

	public static GaraLazy getInstance(String nume, int nrColovoze, int nrTrenuri) {
		if (instance == null) {
			instance = new GaraLazy(nume, nrColovoze, nrTrenuri);
		}
		return instance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GaraLazy [nume=");
		builder.append(nume);
		builder.append(", nrColovoze=");
		builder.append(nrColovoze);
		builder.append(", nrTrenuri=");
		builder.append(nrTrenuri);
		builder.append("]");
		return builder.toString();
	}

}