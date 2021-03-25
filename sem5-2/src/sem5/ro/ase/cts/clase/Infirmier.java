package sem5.ro.ase.cts.clase;

public class Infirmier extends PersonalSpital{

	public Infirmier(String nume) {
		super(nume);
	}

	public String toString() {
		return "Infirmier: " + super.getNume();
	}
}
