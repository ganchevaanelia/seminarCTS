package ro.ase.cts.state.clase;

public class StareRezervata implements Stare{
	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			masa.setStare(this);
			System.out.println("Masa cu nr " +masa.getNr() + " este rezervata");
		} else {
			System.out.println("Masa deja ocupata sau rezervata!");
		}
		
	}
}