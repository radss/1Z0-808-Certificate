package ce.examples.chapter4;

/*
 * Kolik je compiler fails??
 * static fianl prom�nn� mus� b�t nastaveny p�esn� jednou a mus� to b�t v deklaraci
   ��dku nebo ve statick�m inicializa�n�m bloku.
   =>4 chyby.
 */
public class RopeSwing2 {
	private static final String leftRope;
	private static final String rightRope;
	private static final String bench; //nen� incializov�na v deklaraci a nem��e b�t incializov�na v main metod�
	private static final String name="name";
	
	static {
		leftRope = "left";
		rightRope = "right";
	}
	
	static {
		//chybn� pokus incializovat ob� prom�nn� podruh�
		name = "name";
		rightRope = "right";
	}
	
	public static void main(String[] args) {
		bench = "bench"; //static final prom�nnou lze incializovat jen v deklaraci nebo statick�m incializa�n�m bloku

	}

}
