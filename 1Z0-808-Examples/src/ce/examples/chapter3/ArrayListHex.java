package ce.examples.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListHex {
/*
 * Po seøazení hex obsahuje [30, 3A, 8, FF]. Pamatujte, že èísla tøídí døíve
	než písmena a øetìzce seøadí podle abecedy. Tím je 30 pøed 8. Binární vyhledávání
	správnì najde 8 na indexu 2 a 3A na indexu 1. Nemùže najít 4F, ale všimne si, že by mìlo
	být na indexu 2. Pokud položka není nalezena, pravidlo je negovat tento index a odeèíst 1.
	Dostaneme tedy –2–1, což je –3. Test
 */
	public static void main(String[] args) {
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		//tøídí døíve èísla než písmena???? a øetìzce tøídí abecednì
		Collections.sort(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(x + " " + y + " " + z);
	}

}
