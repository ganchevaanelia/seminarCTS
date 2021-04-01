package Builder.clase;

public class RezervareBuilder implements AbstractBuilder {
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		this.rezervare= new Rezervare(0,false,false,false,false,"notFound");
	}
	
public RezervareBuilder setCodRezervare(int cod) {
	rezervare.setCodRezervare(cod);
	return this;
}

public RezervareBuilder setAreMancare(boolean areMancare) {
	rezervare.setAreMancare(areMancare);
	return this;
}

public RezervareBuilder setAreScaunErgonomic(boolean areScaun) {
	rezervare.setAreScaunErgonomic(areScaun);
	return this;
}

public RezervareBuilder setAreBautura(boolean areBautura) {
	rezervare.setAreBautura(areBautura);
	return this;
}

public RezervareBuilder setAreMuzica(boolean areMuzica) {
	rezervare.setAreMuzica(areMuzica);
	return this;
}

public RezervareBuilder setGenMuzica(String muzica) {
	rezervare.setGenMuzica(muzica);
	return this;
}

@Override
public Rezervare build() {
	return rezervare;
}
}
