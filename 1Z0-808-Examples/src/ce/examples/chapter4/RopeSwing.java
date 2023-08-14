package ce.examples.chapter4;

import static ce.examples.chapter4.rope.Rope2.*;

import ce.examples.chapter4.rope.Rope2;

public class RopeSwing {
	
	private static Rope2 rope1 = new Rope2();
	private static Rope2 rope2 = new Rope2();
	
	/* RopeSwing má instanèní incializátor, takže
		když dále v kodu není nìco jako new RopeSwing() tak tato instance nikdy nevznikne
		a tedy se nyvytiskne co je v instanèním inicializaèním bloku (tedy nevytiskne se 0!!)
	*/
	{
		System.out.println(rope1.length);
		//System.out.println("hello");
	}

	public static void main(String[] args) {
		/* length v classe Rope2 je static, 
		 * takže Zmìny z jednoho objektu aktualizují tuto spoleènou statickou promìnnou.
		*/
		 rope1.length = 2;
		 rope2.length = 8;
		 System.out.println(rope1.length);

	}

}
