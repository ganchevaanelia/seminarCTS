package sem8.decorator.clase;

public class NotaDePlata implements INota{
	private int sumaDePlata;

	public NotaDePlata(int sumaDePlata) {
		this.sumaDePlata = sumaDePlata;
	}
	
	@Override
	public void printeaza() {
		System.out.println(String.format("S-a printat nota de plata in valoare de %d.", this.sumaDePlata));
	}
	

}
