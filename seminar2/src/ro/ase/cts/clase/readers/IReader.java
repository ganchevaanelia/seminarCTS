package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public interface IReader {

	public List<Aplicant> readAplicants(String file) throws FileNotFoundException, NumberFormatException;
}
