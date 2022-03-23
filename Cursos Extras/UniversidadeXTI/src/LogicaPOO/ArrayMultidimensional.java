package LogicaPOO;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		String[] faces = {"As","2","3","4","5","6","7","8","9","10","Valete","Dama", "Rei"};
		String[] nipes = {"Espada", "Paus", "Ouros", "Copas"};
		
		Random r = new Random();
		int face = r.nextInt(faces.length);
		int nipe = r.nextInt(nipes.length);
		
		System.out.println("A carta gerada aleatoriamente foi: " + faces[face] + " " + nipes[nipe]);

	}

}
