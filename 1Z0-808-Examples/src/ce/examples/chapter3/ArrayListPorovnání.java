package ce.examples.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPorovnání {

	public static void main(String[] args) {
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		//nemùžeme provonat objekty pomocí  ==
		if (one == two) 
		 System.out.println("A");
		//listy jsou si rovny pokud mají stejné prvky ve stejném poøadí
		else if (one.equals(two))
		 System.out.println("B");
		else 
		 System.out.println("C");

	}

}
