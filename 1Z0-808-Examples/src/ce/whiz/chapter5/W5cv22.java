package ce.whiz.chapter5;

public class W5cv22 {
/*
 *  Rozsah prom�nn� je omezen na uzav�en� blok {}.
 *  Tak�e v dan�m k�du je prom�nn� x definov�na na ��dku 11 dostupn� pouze pro blok try nikoliv pro catch.
 *  Tak�e pokus o p��stup k prom�nn� x v catch() vede chyb� kompilace.
 */

	public static void main(String[] args) {
		int y=10;
		try {
			int x=0;
			int z = y/x;
		}catch(ArithmeticException e) {
			//int y=x; take nelze
			System.out.println("Arithmetic: divided by "+ x);
		}catch(NumberFormatException nex) {
			System.out.println("Number format");
		}
	}

}
