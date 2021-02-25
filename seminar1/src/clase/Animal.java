package clase;

public abstract class Animal {
	private String nume;
//daca e abstracta nu poate fi instantiata, poate sa mosteneasca si poate fi mostenita
	public Animal(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	

}
