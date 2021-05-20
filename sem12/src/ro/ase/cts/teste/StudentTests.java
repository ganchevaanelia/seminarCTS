package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.Student;


public class StudentTests {

	@Test //adnotarea obligatorie in junit 4
	public void testConstructorCuUnParametru() {
		//fail("Not yet implemented"); //fail forteaza testul sa pice
		String nume = "Costica";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
		assertNotNull(student.getNote());
	}

	@Test
	public void testConstructorFaraParametrii() {
		Student student = new Student();
		assertNotNull("atributul nume nu e initializat",student.getNume());
		assertNotNull("atributul note e initializat",student.getNote());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 5;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAdaugaNotaDimensiune() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(8);
		
		assertEquals(2, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(8);
		
		assertEquals(6.5f, student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		assertEquals(0, student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void testCalculeazaMedieCuNota() {
		Student student = new Student();
		student.adaugaNota(5);
		assertEquals(5, student.calculeazaMedie(),0.1);
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(3);
		
		assertTrue(student.areRestante());
	}
	
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testGetNotaExceptieV3() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);

		//junit 3
		try {
			student.getNota(5);
			fail("nu trebiua sa ajunga aici. metoda nu arunca exceptie.");
		} catch (IndexOutOfBoundsException e) {
			
		}
		catch (Exception e) {
			fail();
		}
	}
	
	//junit 4
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetNotaExceptieV4() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		student.getNota(5);
	}
	
	//ver junit5
	/*@Test
	public void testGetNotaExceptieV5() {
		Student student = new Student();
		student.adaugaNota(9);
		student.adaugaNota(8);
		
		assertThrows(IndexOutOfBoundsException.class, {} ->{
			student.getNota(5);
		});
	}*/
}





