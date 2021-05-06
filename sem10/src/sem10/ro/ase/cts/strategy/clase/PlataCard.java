package sem10.ro.ase.cts.strategy.clase;

public class PlataCard implements IPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("Plata cu cardul pentru "+ suma);
		
	}

}
