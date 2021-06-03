package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.*;
import ro.ase.cts.teste.categorii.ConstructorGrupaCategory;
import ro.ase.cts.teste.categorii.GetPromovabilitateCategory;
import ro.ase.cts.teste.categorii.TesteUrgenteCategory;

public class TesteGrupa {
	private Grupa grupa;

	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorNrGrupaCorect() {
		Grupa grupa = new Grupa(1081);
		assertEquals(1081, grupa.getNrGrupa());
	}

	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorExistaLista() { //correct - existance
		Grupa grupa = new Grupa(1081);
		assertNotNull(grupa.getStudenti());
	}

	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	@Category({ConstructorGrupaCategory.class, TesteUrgenteCategory.class})
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test (expected = IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorExceptieInferioara() {
		Grupa grupa = new Grupa(900);
	}
	
	@Test (expected = IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorExceptieSuperioara() {
		Grupa grupa = new Grupa(1900);
	}
	
	@Test (timeout = 500)
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1090);
	}
	
	//in JUnit 5
	/*@Test
	public void testConstructorPerformance() {
		assertTimeout(Duration.ofMillis(500), ()->{new Grupa(1081);});
	}*/
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1090);
		
		for (int i=0; i<10; ++i) {
			IStudent student = new Student(); 
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		for (int i=0; i<5; ++i) {
			IStudent student = new Student(); 
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.66f, grupa.getPromovabilitate(),0.1);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateLimitaInferioara() {
	Grupa grupa = new Grupa(1090);
		
		for (int i=0; i<10; ++i) {
			IStudent student = new Student(); 
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	@Test
	@Category({GetPromovabilitateCategory.class, TesteUrgenteCategory.class})
	public void testGetPromovabilitateLimitaSuperioara() {
	Grupa grupa = new Grupa(1090);
		
		for (int i=0; i<10; ++i) {
			IStudent student = new Student(); 
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testGetPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1081);
		grupa.getPromovabilitate();
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testgetPromovabilitateCardinality1() {
		Grupa grupa = new Grupa(1090);
		IStudent student = new Student();
		student.adaugaNota(7);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getPromovabilitate(),0.01);
	}
}






