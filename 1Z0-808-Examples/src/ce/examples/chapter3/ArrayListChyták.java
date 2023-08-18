package ce.examples.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListChyták {

	public static void main(String[] args) {
		 String [] names = {"Tom", "Dick", "Harry"};
		 //NELZE použít asList() zpùsobem níže ALE lze použít jako Arrays.asList(names)
		 List<String> list = names.asList();
		 list.set(0, "Sue");
		 System.out.println(names[0]);

	}

}
