package Builder.main;

import Builder.clase.Rezervare;
import Builder.clase.RezervareBuilder;
import Builder.clase.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1;
		Rezervare rezervare2;
		
RezervareBuilder rezervareBuilder = new RezervareBuilder();
rezervareBuilder.setCodRezervare(100).setAreMancare(true);
rezervare1=rezervareBuilder.build();

rezervare2 = new RezervareBuilder().setCodRezervare(101).setAreMuzica(true).build();
	}
	
	Rezervare rezervare3 = new Rezervare(102,true,false,true,true,"pop");

	
	RezervareBuilderV2 rbv2 = new RezervareBuilderV2().setAreMancare(true).
			setAreBautura(true).setAreScaunErgonomic(true);
	Rezervare rezervare5 = rbv2.setCodRezervare(105).build();
	
	Rezervare rezervare6 = rbv2.setCodRezervare(106).build();
}
