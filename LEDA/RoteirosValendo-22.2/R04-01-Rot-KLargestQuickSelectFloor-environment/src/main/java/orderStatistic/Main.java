package orderStatistic;

import problems.FindBiggestBitonic;
import problems.FloorBinarySearchImpl;
import problems.KlargestBitonic;
import problems.PrimeiraUltimaOcorrencia;

public class Main {

	public static void main(String[] args) {

		int[] array = {1,3,13,13,14,16,18,20}; //1,2,3,13,14,16,20

		KLargestOrderStatisticsImpl<Integer> klargest = new KLargestOrderStatisticsImpl<>();
		FindBiggestBitonic biggestBitonic = new FindBiggestBitonic();
		PrimeiraUltimaOcorrencia primeiraUltimaOcorrencia = new PrimeiraUltimaOcorrencia();
		KlargestBitonic klargestBitonic = new KlargestBitonic();
		FloorBinarySearchImpl floorBinarySerach = new FloorBinarySearchImpl();
		
		//System.out.println(floorBinarySerach.floor(array, 21));
		//System.out.println(floorBinarySerach.ceil(array, -8));



		//System.out.println(klargestBitonic.klargestBitonic(array,3));

		System.out.println(primeiraUltimaOcorrencia.primeiraOcorrencia(array, 13, 0, array.length-1));
		System.out.println(primeiraUltimaOcorrencia.ultimaOcorrencia(array, 13, 0, array.length-1));
		
		int[] result = primeiraUltimaOcorrencia.startEndPosition(array, 13);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}


		
		
		//System.out.println(biggestBitonic.biggestBitonic(array, 0, 6));

		

//		Comparable [] numero = klargest.getKLargest(array, 4);
//		
//		for (int i = 0; i < numero.length; i++) {
//			if (i < numero.length - 1) {
//				System.out.print(numero[i] + ", ");
//
//			}else {
//				System.out.print(numero[i]);
//
//			}
//
//		}	}

	}
}
