package ce.examples.chapter5;

interface Nocturnal {
	default boolean isBlind() { return true; }
}


public class Owl implements Nocturnal {
	public boolean isBlind() { return false; }

	public static void main(String[] args) {
		/*vytiskne false protože do intance interfejsu nocturnal dávám referenci (objekt) new Owl()
		 * takže se vytiskne implementace metody isBlind(), která je definovaná v class Owl (metoda v Owl overridne
		 * defualt metodu interfejsu) 
		 *Ani by se nemuselo castovat/pøetypovat pomocí (Nocturnal)new Owl() staèilo by Nocturnal nocturnal = new Owl();
		*/
		Nocturnal nocturnal = (Nocturnal)new Owl();
		System.out.println(nocturnal.isBlind());

	}

}
