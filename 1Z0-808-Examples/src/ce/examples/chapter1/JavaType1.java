package ce.examples.chapter1;

/*
 * Ke cvi�n� 12 - java p�i�azuje defaultn� prom�nn� pouze instan�n�m prom�nn�m, NIKOLIV LOK�LN�M
 * (t�eba v metod�ch), zde mus�me nastavit hodnotu jinak compile fails
 * Pokud nep�i�ad�me v instan�n�m bloku, tak runtimeerror p�i pokusu o tisk v sysout
 */
public class JavaType1 {
	
	/*{
		short t;
		System.out.println(t);
	}
	*/
	short numPets = 5;
	//NELZE p�i�adit double/float do int jsou to v�t�� datov� typy
	int numGrains = 5.6;
	String name = "Scruffy";
	public static void main(String[] args) {
		JavaType1 type = new JavaType1();
		//NELZE proto�e primitive typy nemaj� metody!!!
		type.numPets.length();
		type.numGrains.length();	
		type.name.length();

	}

}
