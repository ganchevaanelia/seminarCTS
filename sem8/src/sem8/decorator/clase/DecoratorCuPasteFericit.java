package sem8.decorator.clase;

public class DecoratorCuPasteFericit extends DecoratorAbstract{

	public DecoratorCuPasteFericit(INota nota) {
		super(nota);
	}

	@Override
	public void printeaza() {
		super.printeaza();
		System.out.println("Paste fericit");
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare! Paste fericit");
		
	}
	
	

}
