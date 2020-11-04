package SW.EX;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	private static MyListUtil listUtil;
	DateTime dt = new DateTime();

	@BeforeClass
	public static void prepare() {
		listUtil = new MyListUtil();
	}

	@Before
	public void printStartTime() {
		System.out.println("Inizio il test " + DateTime.now());
	}

	@After
	public void printFinishTime() {
		System.out.println("Finisco il test " + DateTime.now() + "\n");
	}

	@Test
	public void ordineCrescenteWorks() {

		List<Integer> L = Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1);
		assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), listUtil.ordineCrescente(L));

	}

	@Test
	public void ordineDecrescenteWorks() {

		List<Integer> L = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		assertEquals(Arrays.asList(8, 7, 6, 5, 4, 3, 2, 1), listUtil.ordineDecrescente(L));

	}
}
