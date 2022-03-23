package LogicaPOO;

public class Switch {

	public static void main(String[] args) {

		char sexo = 'F';

		switch (sexo) {

		case 'M':
			System.out.println("Masculino");
			break;   //coloca o break pois ele entra em um e em todos abaixo do que entrou, o break quebra essa entrada nos de baixo
		case 'F':
			System.out.println("Feminino");
			break;
		default:
			System.out.println("Outro");
			break;

		}

	}

}
