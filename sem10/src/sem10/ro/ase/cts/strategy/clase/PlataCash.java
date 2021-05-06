package sem10.ro.ase.cts.strategy.clase;

public class PlataCash implements IPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("Plata cash pentru "+ suma);
		
	}
	
}
