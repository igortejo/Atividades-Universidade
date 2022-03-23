package LogicaPOO;

public class ArgumentosVariaveis {
	
	public double soma (double ... numeros) {
		
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}

}
