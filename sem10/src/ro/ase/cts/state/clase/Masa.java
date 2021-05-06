package ro.ase.cts.state.clase;


public class Masa {
	private Stare stare;
	private int nr;
	
	public Masa(int nr) {
		super();
		this.nr = nr;
		this.stare = new StareLibera();
	}

	public Stare getStare() {
		return stare;
	}

	public int getNr() {
		return nr;
	}

	void setStare(Stare stare) {
		this.stare = stare;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}
	
	public void rezervaMasa() {
		StareRezervata rezervata = new StareRezervata();
		rezervata.modificaStare(this);
	}
	
	public void ocupaMasa() {
		StareOcupata ocupata = new StareOcupata();
		ocupata.modificaStare(this);
	}

	public void elibereazaMasa() {
		StareLibera libera = new StareLibera();
		libera.modificaStare(this);
	}
	
}