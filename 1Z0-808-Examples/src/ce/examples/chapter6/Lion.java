package ce.examples.chapter6;
//cv17

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}

interface Roar {
	void roar() throws HasSoreThroatException;
}

class Lion implements Roar {// INSERT CODE HERE
	/*
	 * Jak�koliv z t�chto mo�nost� m��e b�t implementov�na!!!
	 */
	
	//LZE - metoda nemus� vyvolat/deklarovat v�bec ��dn� exceptions a�koliv m� metoda v interfejsu deklarovan�
	//public void roar(){} 
	
	
	/*LZE - metoda samoz�ejm� m��e deklarovat exceptionu stejnou jako 
	 * dekrauje pro vyhozen� implementovan� interfejs metoda
	 */
	//public void roar() throws HasSoreThroatException{}
	
	
	/*
	 * LZE - implementovan� metoda m��e vyhodit unchecked exceptionu 
	 * lze asi kv�li tomu �e v interfejsu deklaruje throws HasSoreThroatException kter� extenduje
	 * Exception tak�e se tam vleze i IllegalArgumentException 
	 * checked i unchecked jsou toti� odvozen� od Exceptions!!! sta�� se pod�vat na java exceptions diagram
	 * 
	 * 
	 */
	//public void roar() throws IllegalArgumentException{}
	
	
	/*LZE - zase asi vych�z�me z java exceptions diagram
	   metoda v interfejsu deklaruje throws HasSoreThroatException (custom classa)
	   a tato custom classa extenduje Exceptions. Z Exceptions vych�z� checked i unchecked v�jimky
	   a proto�e custom classa  TiredException extenduje RuntimeException tak se zde rovn� vleze
	*/
	//public void roar() throws TiredException{}
	
	
	/*NELZE! - metoda v interfejsu throws HasSoreThroatException kter� je child obecn� Exception
	 * tak�e nem��eme implementovat metodu throws exception �ir�� ne� je deklarace v interfejsu 
	 */
	//public void roar() throws Exception{}
}