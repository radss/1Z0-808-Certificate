package ce.examples.chapter5;

/**
 * K�d se zkompiluje a spust� bez probl�m�.
   Metoda printName() je v Spideru overloaded, nikoli overriden, tak�e mohou ob� metody
   b�t zavol�ny. Vol�n� na ��dku 8 odkazuje na verzi, kter� m� jako definovan� vstup int
   ve t��d� Spider a vol�n� na ��dku 9 odkazuje na verzi ve t��d� Arthropod
   Proto je v�stup SpiderArthropod podle po�ad� vol�n� metod.
 *
 */

/* zde jde o ovloading (argumenty double vs int) nikoliv overriding a proto nejde o P�EKRYT� metody v parent
   classe jako p�i overridingu.
   Pokud by se metoda v parent Arthpood zm�nila na int, tak se vytiskne SpiderSpider.
   
   Pokud by se ale ve Spider zm�nil arg na float input a v classe Arthpood na int input a z�stalo by stejn� vol�n�
   Spider spider = new Spider();spider.printName(4);spider.printName(9); (tedy s int argumentem) k p�ekryt� nedojde
   poslechne se vol�n� metody dle argumentu a vytiskne se ArthropodArthropod proto�e se vleze do metody v Arthpood
   a�koliv 	Spider spider = new Spider() proto�e Spider extends Arthpood
*/  
class Arthpood{
	public void printName(int input) { System.out.print("Arthropod"); }
}
/*
 * Spider d�d� a proto vol� oba typy metody.
 * a)parent metodu printName(int input)
 * b)vlastn� overloadnutou metodu printName(float input)
 */
public class Spider extends Arthpood {
	public void printName(float input) { System.out.print("Spider"); }
	public static void main(String[] args) {
		Spider spider = new Spider();		
		spider.printName(4.0f);
		spider.printName(9);
	}

}
