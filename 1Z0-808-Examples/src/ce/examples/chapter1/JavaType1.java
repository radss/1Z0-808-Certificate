package ce.examples.chapter1;

/*
 * Ke cvièní 12 - java pøiøazuje defaultní promìnné pouze instanèním promìnným, NIKOLIV LOKÁLNÍM
 * (tøeba v metodách), zde musíme nastavit hodnotu jinak compile fails
 * Pokud nepøiøadíme v instanèním bloku, tak runtimeerror pøi pokusu o tisk v sysout
 */
public class JavaType1 {
	
	/*{
		short t;
		System.out.println(t);
	}
	*/
	short numPets = 5;
	//NELZE pøiøadit double/float do int jsou to vìtší datové typy
	int numGrains = 5.6;
	String name = "Scruffy";
	public static void main(String[] args) {
		JavaType1 type = new JavaType1();
		//NELZE protože primitive typy nemají metody!!!
		type.numPets.length();
		type.numGrains.length();	
		type.name.length();

	}

}
