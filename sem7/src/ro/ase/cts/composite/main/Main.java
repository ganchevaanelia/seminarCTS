package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.CompositeAgentie;
import ro.ase.cts.composite.clase.LeafFiliala;

public class Main {

	public static void main(String[] args) {
		CompositeAgentie agentie1 = new CompositeAgentie();
		CompositeAgentie agentie2 = new CompositeAgentie();
		CompositeAgentie agentie3 = new CompositeAgentie();

		LeafFiliala filiala1 = new LeafFiliala("filiala1");
		LeafFiliala filiala2 = new LeafFiliala("filiala2");
		LeafFiliala filiala3 = new LeafFiliala("filiala3");
		LeafFiliala filiala4 = new LeafFiliala("filiala4");
		
		agentie1.addNod(filiala1);
		agentie1.addNod(filiala2);
		agentie1.addNod(agentie3);
		
		agentie2.addNod(filiala3);
		
		agentie3.addNod(filiala4);
		
		agentie1.afiseazaDescriere();
		agentie2.afiseazaDescriere();
		
		agentie3.removeNod(filiala4);
		agentie1.addNod(filiala4);
		
		agentie1.removeNod(agentie3);
	}

}
