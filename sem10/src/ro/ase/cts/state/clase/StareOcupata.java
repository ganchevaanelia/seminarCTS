package ro.ase.cts.state.clase;

public class StareOcupata implements Stare{
	@Override
	public void modificaStare(Masa masa) {
		if((masa.getStare() instanceof StareLibera) || (masa.getStare() instanceof StareRezervata)) {
			masa.setStare(this);
			System.out.println("Masa cu nr " +masa.getNr() + " este ocupata");
			
		} else {
			System.out.println("Masa deja ocupata!");
		}
		
	}
}