package ce.examples.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListNetradièníInicializace {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(10, 4, -1, 5);
		 Collections.sort(list);
		 
		 //zde zadává velikosti pole!!! pøi jeho incializaci - netradiènì
		 /*
		  * klasika je Integer array[] = new Integer[4]; 
		  * array2 = (Integer[]) list.toArray();
		  */
		 Integer array[] = list.toArray(new Integer[4]);
		
		 System.out.println(array[0]);

	}

}
