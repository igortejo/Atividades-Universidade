package teste;

import static org.junit.Assert.*;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardResizeToggleHandler;

import org.junit.Before;
import org.junit.Test;

import orderStatistic.KLargest;
import orderStatistic.KLargestOrderStatisticsImpl;

public class KLargestOrderStatisticsImplTest {

	KLargestOrderStatisticsImpl<Integer> arrayTemp;

	@Before
	public void setUp() throws Exception {

		this.arrayTemp = new KLargestOrderStatisticsImpl<>();
	}

	public <T> void verificaOrderStatisticsTest(Integer[] array, int k, Integer retornoEsperado) {

		assertEquals(retornoEsperado, arrayTemp.orderStatistics(array, k));
	}

	public <T> void verificaGetKLargest(Integer[] array, int k, String retornoEsperado) {

		Comparable<Integer>[] kLargest = this.arrayTemp.getKLargest(array, k);

		assertEquals(retornoEsperado, Arrays.toString(kLargest));
	}

	@Test
	public void testOrderStatisticsArrayVazio() {

		verificaOrderStatisticsTest(new Integer[] {}, 2, null);
		verificaOrderStatisticsTest(new Integer[0], 1, null);

	}

	@Test
	public void testOrderStatisticsEstatisticaMaiorQueOArray() {
		Integer[] array = new Integer[] { 5, 4, 3, 2, 1 };

		verificaOrderStatisticsTest(array, 6, null);
		verificaOrderStatisticsTest(array, 7, null);
		verificaOrderStatisticsTest(array, 8, null);

	}

	@Test
	public void testOrderStatisticsEstatisticaMenorQueOArray() {
		Integer[] array = new Integer[] { 5, 4, 3, 2, 1 };

		verificaOrderStatisticsTest(array, -3, null);
		verificaOrderStatisticsTest(array, -4, null);
		verificaOrderStatisticsTest(array, 0, null);

	}

	@Test
	public void testOrderStatistics01() {
		Integer[] array = new Integer[] { 5, 4, 3, 2, 1 };

		verificaOrderStatisticsTest(array, 1, 1);
		verificaOrderStatisticsTest(array, 2, 2);
		verificaOrderStatisticsTest(array, 3, 3);
		verificaOrderStatisticsTest(array, 4, 4);
		verificaOrderStatisticsTest(array, 5, 5);

	}

	@Test
	public void testOrderStatistics02() {
		Integer[] array = new Integer[] { -5, 8, -1, 11, -15 };

		verificaOrderStatisticsTest(array, 1, -15);
		verificaOrderStatisticsTest(array, 2, -5);
		verificaOrderStatisticsTest(array, 3, -1);
		verificaOrderStatisticsTest(array, 4, 8);
		verificaOrderStatisticsTest(array, 5, 11);

	}
	
	@Test
	public void testGetKLargestVetorVazio() {
		Integer[] array = new Integer[]{};
		Integer[] array1 = new Integer[0];


		verificaGetKLargest(array, 2, "[]");
		verificaGetKLargest(array1, 2, "[]");

	}
	
	@Test
	public void testGetKLargestTamanoMaiorQueOArray() {
		Integer[] array = new Integer[] { 2, 3, 5, 8, 11, 15 };

		verificaGetKLargest(array, 8, "[]");
		



	}

	@Test
	public void testGetKLargest01() {
		Integer[] array = new Integer[] { 2, 3, 5, 8, 11, 15 };

		verificaGetKLargest(array, 2, "[11, 15]");
		verificaGetKLargest(array, 3, "[8, 11, 15]");
		verificaGetKLargest(array, 4, "[5, 8, 11, 15]");
		verificaGetKLargest(array, 5, "[3, 5, 8, 11, 15]");

	}
	@Test
	public void testGetKLargest02() {
		Integer[] array = new Integer[] { 2, -3, 5, 11, 11, -15 };

		verificaGetKLargest(array, 2, "[11, 11]");
		verificaGetKLargest(array, 3, "[5, 11, 11]");
		verificaGetKLargest(array, 4, "[2, 5, 11, 11]");
		verificaGetKLargest(array, 5, "[-3, 2, 5, 11, 11]");



	}

}
