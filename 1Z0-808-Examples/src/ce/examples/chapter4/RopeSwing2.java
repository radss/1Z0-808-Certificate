package ce.examples.chapter4;

/*
 * Kolik je compiler fails??
 * static fianl promìnné musí být nastaveny pøesnì jednou a musí to být v deklaraci
   øádku nebo ve statickém inicializaèním bloku.
   =>4 chyby.
 */
public class RopeSwing2 {
	private static final String leftRope;
	private static final String rightRope;
	private static final String bench; //není incializována v deklaraci a nemùže být incializována v main metodì
	private static final String name="name";
	
	static {
		leftRope = "left";
		rightRope = "right";
	}
	
	static {
		//chybný pokus incializovat obì promìnné podruhé
		name = "name";
		rightRope = "right";
	}
	
	public static void main(String[] args) {
		bench = "bench"; //static final promìnnou lze incializovat jen v deklaraci nebo statickém incializaèním bloku

	}

}
