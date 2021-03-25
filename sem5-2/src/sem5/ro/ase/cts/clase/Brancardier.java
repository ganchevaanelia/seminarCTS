package sem5.ro.ase.cts.clase;

public class Brancardier extends PersonalSpital{

	public Brancardier(String nume) {
		super(nume);
		
	}

	@Override
	public String toString() {
		return "Barcardier: " + super.getNume();
	}

	
}
