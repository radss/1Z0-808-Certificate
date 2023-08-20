package ce.examples.chapter6;
//cv17

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}

interface Roar {
	void roar() throws HasSoreThroatException;
}

class Lion implements Roar {// INSERT CODE HERE
	/*
	 * Jakákoliv z tìchto možností mùže být implementována!!!
	 */
	
	//LZE - metoda nemusí vyvolat/deklarovat vùbec žádné exceptions aèkoliv má metoda v interfejsu deklarované
	//public void roar(){} 
	
	
	/*LZE - metoda samozøejmì mùže deklarovat exceptionu stejnou jako 
	 * dekrauje pro vyhození implementovaná interfejs metoda
	 */
	//public void roar() throws HasSoreThroatException{}
	
	
	/*
	 * LZE - implementovaná metoda mùže vyhodit unchecked exceptionu 
	 * lze asi kvùli tomu že v interfejsu deklaruje throws HasSoreThroatException která extenduje
	 * Exception takže se tam vleze i IllegalArgumentException 
	 * checked i unchecked jsou totiž odvozené od Exceptions!!! staèí se podívat na java exceptions diagram
	 * 
	 * 
	 */
	//public void roar() throws IllegalArgumentException{}
	
	
	/*LZE - zase asi vycházíme z java exceptions diagram
	   metoda v interfejsu deklaruje throws HasSoreThroatException (custom classa)
	   a tato custom classa extenduje Exceptions. Z Exceptions vychází checked i unchecked výjimky
	   a protože custom classa  TiredException extenduje RuntimeException tak se zde rovnìž vleze
	*/
	//public void roar() throws TiredException{}
	
	
	/*NELZE! - metoda v interfejsu throws HasSoreThroatException která je child obecné Exception
	 * takže nemùžeme implementovat metodu throws exception širší než je deklarace v interfejsu 
	 */
	//public void roar() throws Exception{}
}