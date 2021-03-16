package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatiReader extends IReader {

	public AngajatiReader(String filePath) {
		super(filePath);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
		Scanner inputFisier = new Scanner(new File(super.filePath));
		inputFisier.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (inputFisier.hasNext()) {
			Angajat angajat = new Angajat();
			super.citireAplicant(inputFisier, angajat);

			int salariu = inputFisier.nextInt();
			String ocupatie = inputFisier.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		inputFisier.close();
		return angajati;
	}
}
