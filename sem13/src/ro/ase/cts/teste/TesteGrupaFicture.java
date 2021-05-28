package ro.ase.cts.teste;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

public class TesteGrupaFicture {
	private Grupa grupa;

	@Before
	public void setup() {
		grupa = new Grupa(1090);
		for (int i=0; i<20; ++i) {
			IStudent student = new Student(); 
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		for (int i=0; i<15; ++i) {
			IStudent student = new Student(); 
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test (timeout = 500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}
