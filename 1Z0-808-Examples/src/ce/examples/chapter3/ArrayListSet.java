package ce.examples.chapter3;

import java.util.ArrayList;

public class ArrayListSet {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		//set(..) nahrazuje!! místo znaku na indexu 1 vlože 6-ku!!!
		values.set(1, 6);
		values.remove(0);
		//6
		 for (Integer v : values) System.out.print(v);

	}

}
