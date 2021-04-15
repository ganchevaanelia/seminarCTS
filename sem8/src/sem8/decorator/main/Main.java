package sem8.decorator.main;

import sem8.decorator.clase.DecoratorAbstract;
import sem8.decorator.clase.DecoratorCuLaMultiAni;
import sem8.decorator.clase.DecoratorCuPasteFericit;
import sem8.decorator.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		
		NotaDePlata notaInitiala = new NotaDePlata(55);
		notaInitiala.printeaza();
		
		DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
		decoratorLaMultiAni.printeazaFelicitare();
		System.out.println();
		decoratorLaMultiAni.printeaza();

		DecoratorAbstract decoratorPaste = new DecoratorCuPasteFericit(notaInitiala);
		decoratorPaste.printeazaFelicitare();
		System.out.println();
		decoratorPaste.printeaza();
		
		//mostenire multipla
		NotaDePlata notaDePlata = new NotaDePlata(150);
		DecoratorAbstract decoratorLaMultiAni2 = new DecoratorCuLaMultiAni(notaDePlata);
		DecoratorAbstract decoratorPaste2 = new DecoratorCuPasteFericit(notaDePlata);
		decoratorPaste2.printeaza();
	}

}
