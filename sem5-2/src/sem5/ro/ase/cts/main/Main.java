package sem5.ro.ase.cts.main;

import sem5.ro.ase.cts.clase.FactoryAsistent;
import sem5.ro.ase.cts.clase.FactoryMedic;
import sem5.ro.ase.cts.clase.IFactory;
import sem5.ro.ase.cts.clase.PersonalSpital;

public class Main {

	public static void afisareInformatiiPersonalSpital(IFactory factory, String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		afisareInformatiiPersonalSpital(new FactoryAsistent(), "Mircea");
		afisareInformatiiPersonalSpital(new FactoryMedic(), "Pavel");

	}

}
