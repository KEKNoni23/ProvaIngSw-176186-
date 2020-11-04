package SW.EX;

import java.util.Collections;
import java.util.List;

public class MyListUtil {
	public List<Integer> ordineCrescente(List<Integer> L) {

		Collections.sort(L);

		return L;

	}

	public List<Integer> ordineDecrescente(List<Integer> L) {

		Collections.sort(L, Collections.reverseOrder());

		return L;

	}
}
