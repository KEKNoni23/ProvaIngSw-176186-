package SW.EX;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		MyListUtil listUtil = new MyListUtil();
		List<Integer> L = Arrays.asList(101, 18, 67, 41, 99, 31, 1, 17, 3, 11);
		System.out.println("1 per ordine Crescente o 2 per Ordine Decrescente :");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();

		if (s == "1") {
			System.out.println(listUtil.ordineCrescente(L));
		} else if (s == "2") {
			System.out.println(listUtil.ordineDecrescente(L));
		}

	}

}
