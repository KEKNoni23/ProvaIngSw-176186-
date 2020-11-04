package SW.EX;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	private static MyListUtil listUtil;
	DateTime dt = new DateTime();

	@BeforeClass
	public static void prepare() {
		listUtil = new MyListUtil();
	}

	@Test
	public void ordineDecrescenteWorks() {
		System.out.println(dt);
		List<Integer> L = Arrays.asList(11, 13, 17, 23, 31, 41, 53, 67, 83, 101);
		listUtil.ordineDecrescente(L);
		System.out.println(dt);
	}

	@Test
	public void ordineCrescenteWorks() {
		System.out.println(dt);
		List<Integer> L = Arrays.asList(101, 2, 67, 53, 41, 31, 23, 17, 13, 11);
		listUtil.ordineDecrescente(L);
		System.out.println(dt);
	}
}
