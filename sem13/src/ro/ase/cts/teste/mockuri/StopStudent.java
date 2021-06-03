package ro.ase.cts.teste.mockuri;

import java.util.List;

import ro.ase.cts.clase.IStudent;
//mock cu valori hardcodate se numeste "stop"
//daca simulam valori este "fake"
public class StopStudent implements IStudent{

	@Override
	public String getNume() {
		return "Gigel";
	}

	@Override
	public void setNume(String nume) {
		
	}

	@Override
	public List<Integer> getNote() {
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		
	}

	@Override
	public float calculeazaMedie() {
		return 6.7f;
	}

	@Override
	public int getNota(int index) {
		return 5;
	}

	@Override
	public boolean areRestante() {
		return false;
	}

}
