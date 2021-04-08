package sem7.ro.ase.cts.clase;

public class Facade {
public static boolean isEligibil(Persoana persoana) {
	if(persoana.getVarsta()>=18) {
		if(!Politie.esteUrmarit(persoana)) {
			if(!BirouDeCredite.areCredite(persoana)) {
				return true;
			}
		}
	}
	return false;
}
}
