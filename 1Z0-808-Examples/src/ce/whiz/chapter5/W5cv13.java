package ce.whiz.chapter5;
/*
 * Scopes - rozsahy viditelnosti
 */
public class W5cv13 {
	//instance variables které jsou vidìt všude v classe i v metodách
	int x = 5;
	int y = 5;
	
	public static void main(String[] args) {
			new W5cv13().print(2);

	}
	
	/*když dáme stejný název promìnné x (jako má instantèní prommìnná) za argument metody potom
	 * hodnota instanèní promìnné x je shadowed (pøekryta), takže nebude  System.out.println(5+5);
	 * ale System.out.println(5+2); Provede se souèet, èísla nemusí být v závorce protože není
	 * v sysoutu žádný další string.
	 */
	public void print(int x) {
		System.out.println(x+y);
		
		//zde jsme sice shadowed/pøekryli hodnotu instanèní promìnné ale až po sysoutu
		int y=4;
		//System.out.println(y);
	}

}
