package ce.examples.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ListChyt�k {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		//do List<String> nelze p�i�ad� ��slo!!! campile error ani nedovol� pustit
		list.add(7);
		for(String s : list) System.out.print(s);
	}

}
