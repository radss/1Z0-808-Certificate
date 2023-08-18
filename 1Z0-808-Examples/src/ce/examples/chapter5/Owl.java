package ce.examples.chapter5;

interface Nocturnal {
	default boolean isBlind() { return true; }
}


public class Owl implements Nocturnal {
	public boolean isBlind() { return false; }

	public static void main(String[] args) {
		/*vytiskne false proto�e do intance interfejsu nocturnal d�v�m referenci (objekt) new Owl()
		 * tak�e se vytiskne implementace metody isBlind(), kter� je definovan� v class Owl (metoda v Owl overridne
		 * defualt metodu interfejsu) 
		 *Ani by se nemuselo castovat/p�etypovat pomoc� (Nocturnal)new Owl() sta�ilo by Nocturnal nocturnal = new Owl();
		*/
		Nocturnal nocturnal = (Nocturnal)new Owl();
		System.out.println(nocturnal.isBlind());

	}

}
