package ro.ase.clase;

public class PresedinteLazy {
//lazy amana apelarea const
	private String nume;
	private int varsta;
	private int mandat;
	
	private static PresedinteLazy instance=null;

	private PresedinteLazy(String nume, int varsta, int mandat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	private PresedinteLazy() {
		this.nume="Putin";
		this.varsta=68;
		this.mandat=10;
	}
	
	public static PresedinteLazy getInstance(String nume, int varsta, int mandat) {
		if(instance == null) {
			instance=new PresedinteLazy(nume, varsta, mandat);
		}
		return instance;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Presedinte [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", mandat=");
		builder.append(mandat);
		builder.append("]");
		return builder.toString();
	}


	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}


	public void setMandat(int mandat) {
		this.mandat = mandat;
	}
	
}