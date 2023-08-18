package ce.examples.chapter5;
/*
 * K�d se nezkompiluje, proto�e parent t��da Mammal nedefinuje konstruktor bez argument�, 
 * tak�e prvn� ��dek konstruktoru Platypus by m�l b�t explicitn� vol�n� do super(int age). 
 * Pokud by takov� vol�n� prob�hlo, v�stup by byl MammalPlatypus, proto�e superkonstruktor
 * je spu�t�n p�ed pod��zen�m konstruktorem.
 */
class Mammal{
	//pokud by se v superclasse Mammal zadal bezparametrick� konsturtor, kod kompiluje.
	
	/*
	public Mammal() {
		
	}
	*/
	public Mammal(int age) {
		System.out.print("Mammal");
	}
}
public class Platypus extends Mammal {
	//konstruktor, kter� je v child classe mus� m�t obraz v parent classe!!!
	public Platypus() {
		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5);

	}

}
