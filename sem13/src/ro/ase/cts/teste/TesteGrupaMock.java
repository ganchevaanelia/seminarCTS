package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.*;
import ro.ase.cts.teste.mockuri.*;

public class TesteGrupaMock {

	@Test
	public void testAdaugaStudent() {
		IStudent student = new DummyStudent();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);

		assertEquals("Adaugare student", 1, grupa.getStudenti().size());
	}

	@Test
	public void testGetPromovabilitate() {
		// boundary superior
		IStudent student = new Student();
		Grupa grupa = new Grupa(1081);
		grupa.adaugaStudent(student);

		assertEquals(1, grupa.getPromovabilitate(), 0.0001);
	}

	@Test
	public void testGetPronovabilitateFake() { //right
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<8; i++)
		{
			FakeStudent student = new FakeStudent();
			student.setAreRestange(false);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<2; i++)
		{
			FakeStudent student = new FakeStudent();
			student.setAreRestange(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8f, grupa.getPromovabilitate(), 0.001);
	}

}
