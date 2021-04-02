package Adapter.clase;

public class Bilet {
	private float pret;

	public Bilet(float pret) {
		super();
		this.pret = pret;
	}

	public void vanzare() {
		System.out.println("S-a vandut biletul cu pretul " + this.pret);
	}

	public void rezervare() {
		System.out.println("S-a rezervat biletul cu pretul " + this.pret);
	}
}
