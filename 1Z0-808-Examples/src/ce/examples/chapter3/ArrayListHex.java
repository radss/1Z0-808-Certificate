package ce.examples.chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListHex {
/*
 * Po se�azen� hex obsahuje [30, 3A, 8, FF]. Pamatujte, �e ��sla t��d� d��ve
	ne� p�smena a �et�zce se�ad� podle abecedy. T�m je 30 p�ed 8. Bin�rn� vyhled�v�n�
	spr�vn� najde 8 na indexu 2 a 3A na indexu 1. Nem��e naj�t 4F, ale v�imne si, �e by m�lo
	b�t na indexu 2. Pokud polo�ka nen� nalezena, pravidlo je negovat tento index a ode��st 1.
	Dostaneme tedy �2�1, co� je �3. Test
 */
	public static void main(String[] args) {
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		//t��d� d��ve ��sla ne� p�smena???? a �et�zce t��d� abecedn�
		Collections.sort(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(x + " " + y + " " + z);
	}

}
