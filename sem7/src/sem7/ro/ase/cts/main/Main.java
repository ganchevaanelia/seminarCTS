package sem7.ro.ase.cts.main;

import sem7.ro.ase.cts.clase.Facade;
import sem7.ro.ase.cts.clase.Persoana;

public class Main {

	public static void main(String[] args) {
		Persoana pers = new Persoana("Alex", "1912345678907");
		
if (Facade.isEligibil(pers)) {
	System.out.println("Persoana este eligibila");
}
else
{
	System.out.println("Persoana nu este eligibila");
}
	}

}
