package sem5.ro.ase.cts.main;

import sem5.ro.ase.cts.clase.FactoryPersonal;
import sem5.ro.ase.cts.clase.TipPersonal;
import sem5.ro.ase.cts.clase.PersonalSpital;

public class Main {
public static void main(String[] args) {
	FactoryPersonal factoryPersonal = new FactoryPersonal();
	
	PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent,  "David");
	PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic,  "Razvan");
	
System.out.println(asistent);
System.out.println(medic);
}
}
