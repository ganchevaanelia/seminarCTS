package ro.ase.cts.teste;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.teste.categorii.GetPromovabilitateCategory;

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
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
}
