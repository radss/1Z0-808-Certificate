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
		/*vytvoøí instanci objednávky. Nejprve se spustí deklarace "t" a k tomuto stringu se
		  pøidávají stringy z instanèních incializátorù až pak se pøidá string z konstruktoru - výsledek je "tacf"
		* */
		Order2 order = new Order2("f");
		/*zde ale na stejnou referenci order incializuje nový new Order() který do value propíš "tacb"
		 * tím se string "tacf" stává nedostupným a výsledek tedy je "tacb" uložený v promìnné value 
		 */
		order = new Order2();
		System.out.println(order.value); //tacb
		
		/*
		 * VELMI PODSTATNÉ je, že promìnná String value NENÍ static a tak se s kažou instancí
		 * new Order() incializuje znovu!! (nepøidávají se do ní stringy), kdybychom zmìnili
		 * na static String value="t" tak se vytiskne tacf acb ("t" se nepøidá znovu protože pøidáme pouze znaky
		 * z instanèních incializátorù a konstruktoru
		 */

	}

}
