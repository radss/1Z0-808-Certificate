package ce.examples.chapter4;

public class Order2 {
	String value="t";
	{value+="a";}
	{value+="c";}
	
	public Order2() {
		value+="b";
	}
	
	public Order2(String s) {
		value+=s;
	}	

	public static void main(String[] args) {
		/*vytvo�� instanci objedn�vky. Nejprve se spust� deklarace "t" a k tomuto stringu se
		  p�id�vaj� stringy z instan�n�ch incializ�tor� a� pak se p�id� string z konstruktoru - v�sledek je "tacf"
		* */
		Order2 order = new Order2("f");
		/*zde ale na stejnou referenci order incializuje nov� new Order() kter� do value prop� "tacb"
		 * t�m se string "tacf" st�v� nedostupn�m a v�sledek tedy je "tacb" ulo�en� v prom�nn� value 
		 */
		order = new Order2();
		System.out.println(order.value); //tacb
		
		/*
		 * VELMI PODSTATN� je, �e prom�nn� String value NEN� static a tak se s ka�ou instanc�
		 * new Order() incializuje znovu!! (nep�id�vaj� se do n� stringy), kdybychom zm�nili
		 * na static String value="t" tak se vytiskne tacf acb ("t" se nep�id� znovu proto�e p�id�me pouze znaky
		 * z instan�n�ch incializ�tor� a konstruktoru
		 */

	}

}
