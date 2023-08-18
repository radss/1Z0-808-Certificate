package ce.examples.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ListChyták {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		//do List<String> nelze pøiøadí èíslo!!! campile error ani nedovolí pustit
		list.add(7);
		for(String s : list) System.out.print(s);
	}

}
