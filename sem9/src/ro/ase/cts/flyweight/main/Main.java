package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.Flyweight;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(10, 5, 15);
		Rezervare rezervare2 = new Rezervare(42, 7, 10);
		Rezervare rezervare3 = new Rezervare(19, 2, 14);
		Rezervare rezervare4 = new Rezervare(15, 1, 20);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight client1 = flyweightFactory.getFlyweight("0727078");
		client1.printeazaRezervare(rezervare1);
		
		flyweightFactory.getFlyweight("0727078").printeazaRezervare(rezervare2);
		flyweightFactory.getFlyweight("078764765").printeazaRezervare(rezervare3);
		flyweightFactory.getFlyweight("078764765").printeazaRezervare(rezervare4);

	}

}
