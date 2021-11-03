package atv2;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Gato cat = new Gato();
		
		dog.setNome("Bidu");
		dog.setRaca("Salsicha");
		cat.setNome("Mel");
		cat.setRaca("Siames");
		dog.caminha();
		dog.late();
		System.out.println(dog.toString());
		System.out.println("================");
		System.out.println(cat.toString());

	}

}
