package clase;

import java.util.List;
import java.util.ArrayList;

public class Zoo implements ZooInterface {
private Zookeeper zookeeper;
private List<Animal> animalList;


public Zoo() {
	animalList = new ArrayList();
	zookeeper= new Zookeeper("Ion");
}

public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
	super();
	this.zookeeper = zookeeper;
	this.animalList = animalList;
}

public void AdaugaAnimal(Animal animal)
{
	animalList.add(animal);
}

public void feedAllAnimals() {
	for (Animal animal:animalList) {
		zookeeper.feed(animal);
	}
}

}
