package sem5.ro.ase.cts.clase.prototype;

public class Reteta implements PrototipAbstract{
private String denumireSolutie;
private int cantitate;

public Reteta(String denumireSolutie, int cantitate) {
	//validari
	this.denumireSolutie = denumireSolutie;
	this.cantitate = cantitate;
}



public Reteta() {
	this.denumireSolutie = "Solutie";
	this.cantitate = 0;
}



@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Reteta [denumireSolutie=");
	builder.append(denumireSolutie);
	builder.append(", cantitate=");
	builder.append(cantitate);
	builder.append("]");
	return builder.toString();
}

public PrototipAbstract copiaza() {
	Reteta copie = new Reteta();
	copie.cantitate = this.cantitate;
	copie.denumireSolutie = this.denumireSolutie;
	return copie;
}
}
