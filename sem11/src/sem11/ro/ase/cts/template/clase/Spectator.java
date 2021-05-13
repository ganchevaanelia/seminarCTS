package sem11.ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
	private String nume;

	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println(nume + " se aseaza la coada.");

	}

	@Override
	public void prezentareBilet() {
		System.out.println(nume + " prezinta bilet.");

	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(nume + " e controlat.");

	}

	@Override
	public void ocupareLoc() {
		System.out.println(nume + " ocupa loc.");

	}

}
