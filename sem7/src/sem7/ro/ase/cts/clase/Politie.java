package sem7.ro.ase.cts.clase;

 class Politie {

			//functie
			public static boolean esteUrmarit(Persoana persoana) {
			if(Integer.parseInt(""+persoana.getCnp().charAt(12))%2==0) {
				return false;
			}
			else {
				return true;
			}
			}

}
