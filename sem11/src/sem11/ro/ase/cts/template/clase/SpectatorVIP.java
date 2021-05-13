package sem11.ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract {
	private String nume;

	public SpectatorVIP(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println(this.nume + " nu sta la coada ca e VIP.");
	}

	@Override
	public void prezentareBilet() {
		System.out.println(this.nume + " prezinta bilet.");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(this.nume + " este controlat.");

	}

	@Override
	public void ocupareLoc() {
		System.out.println(this.nume + " ocupa loc VIP.");

	}

}
