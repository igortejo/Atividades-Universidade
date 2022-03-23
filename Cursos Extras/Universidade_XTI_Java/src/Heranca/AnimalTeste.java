package Heranca;

public class AnimalTeste {
	
	
	public static void barulho(Animal animal) {    // metodo para fazer o polimorfismo
		animal.fazerBarulho();
		
	}

	public static void main(String[] args) {

		Animal carijo = new Galinha();
		Animal toto = new Cachorro();
		
		barulho(toto);   // usando o metod acima para polimorfismo
		barulho(carijo);  // usando o metod acima para polimorfismo
		
		

		carijo.dormir();
		toto.fazerBarulho();
		System.out.println(carijo.comida);
		System.out.println(toto.peso);

	}

}
