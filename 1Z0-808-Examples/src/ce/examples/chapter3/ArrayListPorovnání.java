package ce.examples.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPorovn�n� {

	public static void main(String[] args) {
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		//nem��eme provonat objekty pomoc�  ==
		if (one == two) 
		 System.out.println("A");
		//listy jsou si rovny pokud maj� stejn� prvky ve stejn�m po�ad�
		else if (one.equals(two))
		 System.out.println("B");
		else 
		 System.out.println("C");

	}

}
