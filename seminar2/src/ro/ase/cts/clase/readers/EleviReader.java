package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class EleviReader extends IReader {

	public EleviReader(String filePath) {
		super(filePath);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
		Scanner inputFisier = new Scanner(new File(super.filePath));
		inputFisier.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<>();

		while (inputFisier.hasNext()) {
			Elev elev = new Elev();
			super.citireAplicant(inputFisier, elev);

			int clasa = inputFisier.nextInt();
			String tutore = inputFisier.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		inputFisier.close();
		return elevi;
	}
}
