package Heranca;

public abstract class Animal {
	
	double peso;
	String comida;
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
		
	}
	
	void dormir() {
		System.out.println("Dormiu");
	}
	
	
	/**
	 * como esse metodo nao vai ser utilizado, pois vai ser sobre escrito na outras classes,
	 * ele pode ser abstrato. (nao tem corpo).
	 * Como essa classe tem um metodo abstrato, ela tem que ser abstrata.
	 * Temos que adicionar todos os metods abstratos nas subclasses.
	 */
	abstract void fazerBarulho();

}
