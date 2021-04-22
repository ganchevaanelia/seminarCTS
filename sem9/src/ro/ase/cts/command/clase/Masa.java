package ro.ase.cts.command.clase;

public class Masa {
	private int numarMasa;
	private Boolean esteOcupata;
	private Boolean esteRezervata;
	
	
	
	public Masa(int numarMasa) {
		super();
		this.numarMasa = numarMasa;
		this.esteOcupata = false;
		this.esteRezervata = false;
	}

	public void ocupaMasa() {
		if (!this.esteOcupata) {
			System.out.println("Masa poate fi ocupata");
			this.esteOcupata=true;
		}
		else
		{
			System.out.println("Masa nu poate fi ocupata");
		}
	}
	
	public void rezervaMasa() {
		if (!this.esteRezervata) {
			System.out.println("Masa poate fi rezervata");
			this.esteRezervata=true;
		}
		else
		{
			System.out.println("Masa nu poate fi rezervata");
		}
	}
}
