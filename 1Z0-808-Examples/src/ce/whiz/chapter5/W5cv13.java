package ce.whiz.chapter5;
/*
 * Scopes - rozsahy viditelnosti
 */
public class W5cv13 {
	//instance variables kter� jsou vid�t v�ude v classe i v metod�ch
	int x = 5;
	int y = 5;
	
	public static void main(String[] args) {
			new W5cv13().print(2);

	}
	
	/*kdy� d�me stejn� n�zev prom�nn� x (jako m� instant�n� promm�nn�) za argument metody potom
	 * hodnota instan�n� prom�nn� x je shadowed (p�ekryta), tak�e nebude  System.out.println(5+5);
	 * ale System.out.println(5+2); Provede se sou�et, ��sla nemus� b�t v z�vorce proto�e nen�
	 * v sysoutu ��dn� dal�� string.
	 */
	public void print(int x) {
		System.out.println(x+y);
		
		//zde jsme sice shadowed/p�ekryli hodnotu instan�n� prom�nn� ale a� po sysoutu
		int y=4;
		//System.out.println(y);
	}

}
