package sem5.ro.ase.cts.clase;

public class FactoryInfirmier implements IFactory{

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Infirmier(nume);
	}
}
