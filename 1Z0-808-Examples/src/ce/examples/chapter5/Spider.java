package ce.examples.chapter5;

/**
 * Kód se zkompiluje a spustí bez problémù.
   Metoda printName() je v Spideru overloaded, nikoli overriden, takže mohou obì metody
   být zavolány. Volání na øádku 8 odkazuje na verzi, která má jako definovaný vstup int
   ve tøídì Spider a volání na øádku 9 odkazuje na verzi ve tøídì Arthropod
   Proto je výstup SpiderArthropod podle poøadí volání metod.
 *
 */

/* zde jde o ovloading (argumenty double vs int) nikoliv overriding a proto nejde o PØEKRYTÍ metody v parent
   classe jako pøi overridingu.
   Pokud by se metoda v parent Arthpood zmìnila na int, tak se vytiskne SpiderSpider.
   
   Pokud by se ale ve Spider zmìnil arg na float input a v classe Arthpood na int input a zùstalo by stejné volání
   Spider spider = new Spider();spider.printName(4);spider.printName(9); (tedy s int argumentem) k pøekrytí nedojde
   poslechne se volání metody dle argumentu a vytiskne se ArthropodArthropod protože se vleze do metody v Arthpood
   aèkoliv 	Spider spider = new Spider() protože Spider extends Arthpood
*/  
class Arthpood{
	public void printName(int input) { System.out.print("Arthropod"); }
}
/*
 * Spider dìdí a proto volá oba typy metody.
 * a)parent metodu printName(int input)
 * b)vlastní overloadnutou metodu printName(float input)
 */
public class Spider extends Arthpood {
	public void printName(float input) { System.out.print("Spider"); }
	public static void main(String[] args) {
		Spider spider = new Spider();		
		spider.printName(4.0f);
		spider.printName(9);
	}

}
