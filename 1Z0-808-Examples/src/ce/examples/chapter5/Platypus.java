package ce.examples.chapter5;
/*
 * Kód se nezkompiluje, protože parent tøída Mammal nedefinuje konstruktor bez argumentù, 
 * takže první øádek konstruktoru Platypus by mìl být explicitní volání do super(int age). 
 * Pokud by takové volání probìhlo, výstup by byl MammalPlatypus, protože superkonstruktor
 * je spuštìn pøed podøízeným konstruktorem.
 */
class Mammal{
	//pokud by se v superclasse Mammal zadal bezparametrický konsturtor, kod kompiluje.
	
	/*
	public Mammal() {
		
	}
	*/
	public Mammal(int age) {
		System.out.print("Mammal");
	}
}
public class Platypus extends Mammal {
	/*konstruktor, který je v child classe musí mít obraz v parent classe!!!
	 * Taky ale není úplnì pravda. Pokud v Child definuju bezprametrický a parametrický
	 * a v parent classe vùbec nic zkompiluje se!!! (takže nepotøebuje obraz konstruktorù v parent classe)
	 * Pokud má ale tøeba child bezparametrický a parametrický a v parent classe je jen parametrický
	 * tak musíme doplnit bezparametrický konstruktor i do parent classy!!
	 */
	public Platypus() {
		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5);

	}

}
