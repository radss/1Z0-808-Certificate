package ce.examples.chapter4;

import static ce.examples.chapter4.rope.Rope2.*;

import ce.examples.chapter4.rope.Rope2;

public class RopeSwing {
	
	private static Rope2 rope1 = new Rope2();
	private static Rope2 rope2 = new Rope2();
	
	/* RopeSwing m� instan�n� incializ�tor, tak�e
		kdy� d�le v kodu nen� n�co jako new RopeSwing() tak tato instance nikdy nevznikne
		a tedy se nyvytiskne co je v instan�n�m inicializa�n�m bloku (tedy nevytiskne se 0!!)
	*/
	{
		System.out.println(rope1.length);
		//System.out.println("hello");
	}

	public static void main(String[] args) {
		/* length v classe Rope2 je static, 
		 * tak�e Zm�ny z jednoho objektu aktualizuj� tuto spole�nou statickou prom�nnou.
		*/
		 rope1.length = 2;
		 rope2.length = 8;
		 System.out.println(rope1.length);

	}

}
