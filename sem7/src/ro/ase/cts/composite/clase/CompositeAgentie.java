package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeAgentie implements ISediu{
	private List<ISediu> listaSedii;
	
	

	public CompositeAgentie() {
		///super();
		this.listaSedii = new ArrayList<>();
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("este o agentie");
		for(ISediu sediu : listaSedii) {
			sediu.afiseazaDescriere();
		}
		
	}

	@Override
	public void addNod(ISediu sediu) {
		listaSedii.add(sediu);
		
	}

	@Override
	public void removeNod(ISediu sediu) {
		listaSedii.remove(sediu);
		
	}

	@Override
	public ISediu getNod(int pozitie) {
		return listaSedii.get(pozitie);
	}

}
