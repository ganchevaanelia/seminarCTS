package sem8.decorator.clase;

public class DecoratorCuLaMultiAni extends DecoratorAbstract{

	public DecoratorCuLaMultiAni(INota nota) {
		super(nota);
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("Felicitare! La multi ani!");
	}

	@Override
	public void printeaza() {
		super.printeaza();
		System.out.println("La multi ani");
	}

	
}
