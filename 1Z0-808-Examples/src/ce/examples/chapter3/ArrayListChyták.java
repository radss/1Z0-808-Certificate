package ce.examples.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListChyt�k {

	public static void main(String[] args) {
		 String [] names = {"Tom", "Dick", "Harry"};
		 //NELZE pou��t asList() zp�sobem n�e ALE lze pou��t jako Arrays.asList(names)
		 List<String> list = names.asList();
		 list.set(0, "Sue");
		 System.out.println(names[0]);

	}

}
