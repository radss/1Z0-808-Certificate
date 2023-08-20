package ce.examples.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNPE {

	public static void main(String[] args) {
		 List<Integer> ages = new ArrayList<>();
		 //autoboxing
		 ages.add(Integer.parseInt("5"));
		 //autoboxing		 
		 ages.add(Integer.valueOf("6"));
		 ages.add(7);
		 //lze incializovat null, kod se zkompiluje
		 ages.add(null);
		 
		 //ale pøi procházení vylítne unchecked NPE (NPE je subclassou RuntimeException)
		 //zde je problém!!!, kdyb bylo Integer age místo int age, tak je ok
		 for (int age : ages) System.out.print(age);



	}

}
