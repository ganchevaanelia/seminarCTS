package ro.ase.cts.state.clase;

public class StareLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Masa deja libera!");
		} else {
			masa.setStare(this);
			System.out.println("Masa cu nr " +masa.getNr() + " este libera");
		}
	}

}