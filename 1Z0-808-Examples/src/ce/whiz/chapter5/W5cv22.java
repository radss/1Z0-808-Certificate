package ce.whiz.chapter5;

public class W5cv22 {
/*
 *  Rozsah promìnné je omezen na uzavøený blok {}.
 *  Takže v daném kódu je promìnná x definována na øádku 11 dostupná pouze pro blok try nikoliv pro catch.
 *  Takže pokus o pøístup k promìnné x v catch() vede chybì kompilace.
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
