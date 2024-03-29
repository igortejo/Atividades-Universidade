package sorting.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sorting.AbstractSorting;
import sorting.linearSorting.CountingSort;
import sorting.linearSorting.ExtendedCountingSort;

public class StudentSortingTest {

	private Integer[] vetorTamPar;
	private Integer[] vetorTamImpar;
	private Integer[] vetorVazio = {};
	private Integer[] vetorValoresRepetidos;
	private Integer[] vetorValoresIguais;
	private Integer[] vetorValoresNegativos;


	public AbstractSorting<Integer> implementation;

	@Before
	public void setUp() {
		populaVetorTamanhoPar(new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23,
				31 });
		populaVetorTamanhoImpar(new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49,
				11, 18, 36 });
		populaVetorRepetido(new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 });
		populaVetorIgual(new Integer[] { 6, 6, 6, 6, 6, 6 });
<<<<<<< HEAD
		populaVetorValoresNegativos(new Integer[] { 6, -4, 3, -8, 7});
=======
		populaVetorValoresNegativos(new Integer[] { -6, 5, 3, -9, 0});
>>>>>>> 484a8ee9138bc7a7554e4cff2567ef26379c750b


		getImplementation();
	}

	// // MÉTODOS AUXILIARES DA INICIALIZAÇÃO
	/**
	 * Método que inicializa a implementação a ser testada com a implementação
	 * do aluno
	 */
	private void getImplementation() {
		// TODO O aluno deve instanciar sua implementação abaixo ao invés de
		// null
		this.implementation = new ExtendedCountingSort();
		//Assert.fail("Implementation not provided");
	}

	public void populaVetorTamanhoPar(Integer[] arrayPadrao) {
		this.vetorTamPar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorTamanhoImpar(Integer[] arrayPadrao) {
		this.vetorTamImpar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorRepetido(Integer[] arrayPadrao) {
		this.vetorValoresRepetidos = Arrays.copyOf(arrayPadrao,
				arrayPadrao.length);
	}

	public void populaVetorIgual(Integer[] arrayPadrao) {
		this.vetorValoresIguais = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}
	
	public void populaVetorValoresNegativos(Integer[] arrayPadrao) {
		this.vetorValoresNegativos = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}

	// FIM DOS METODOS AUXILIARES DA INICIALIZAÇÃO

	// MÉTODOS DE TESTE

	public void genericTest(Integer[] array) {
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		implementation.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	@Test
	public void testSort01() {
		genericTest(vetorTamPar);
	}

	@Test
	public void testSort02() {
		genericTest(vetorTamImpar);
	}

	@Test
	public void testSort03() {
		genericTest(vetorVazio);
	}

	@Test
	public void testSort04() {
		genericTest(vetorValoresIguais);
	}

	@Test
	public void testSort05() {
		genericTest(vetorValoresRepetidos);
	}
<<<<<<< HEAD
	@Test
	public void testSort20() {
=======
	
	@Test
	public void testSort06() {
>>>>>>> 484a8ee9138bc7a7554e4cff2567ef26379c750b
		genericTest(vetorValoresNegativos);
	}

	// MÉTODOS QUE OS ALUNOS PODEM CRIAR
	/**
	 * O ALUNO PODE IMPLEMENTAR METODOS DE ORDENAÇÃO TESTANDO O SORT COM TRES
	 * ARGUMENTOS PARA TESTAR A ORDENACAO EM UM PEDAÇO DO ARRAY. DICA: PROCUREM
	 * SEGUIR A ESTRUTURA DOS MÉTODOS DE TESTE ACIMA DESCRITOS, ORDENANDO APENAS
	 * UMA PARTE DO ARRAY.
	 */
	
	
	public void genericTest02 (Integer[] array, int leftIndex, int rightIndex) {
		
		Integer[] arrayTemp = {};
		if (array.length > 0) {
			arrayTemp = Arrays.copyOfRange(array, leftIndex, rightIndex);
		}
		implementation.sort(arrayTemp);
		
		Arrays.sort(array, leftIndex, rightIndex);
		
		Integer[] arrayTemp02 = Arrays.copyOfRange(array, leftIndex, rightIndex);
		
		assertArrayEquals(arrayTemp, arrayTemp02);		
	}
	
	@Test
	public void testSort07() {
		genericTest02(vetorTamPar, 2, 5);
	}

	@Test
	public void testSort08() {
		genericTest02(vetorTamImpar, 3, 7);
	}

	@Test
	public void testSort09() {
		genericTest02(vetorVazio, 0, 0);
	}

	@Test
	public void testSort10() {
		genericTest02(vetorValoresIguais, 0, 4);
	}

	@Test
	public void testSort11() {
		genericTest02(vetorValoresRepetidos, 4, 8);
	}

	
}