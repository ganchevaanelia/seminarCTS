package sem7.ro.ase.cts.clase;

class BirouDeCredite {
	public static boolean areCredite(Persoana persoana) {
		return Integer.parseInt("" + persoana.getCnp().charAt(11))%2==0;
	}
}
