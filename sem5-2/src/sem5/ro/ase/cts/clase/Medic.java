package sem5.ro.ase.cts.clase;

public class Medic extends PersonalSpital{

	public Medic(String nume) {
		super(nume);
	}

	public String toString() {
		return "Medic: " + super.getNume();
	}
}
