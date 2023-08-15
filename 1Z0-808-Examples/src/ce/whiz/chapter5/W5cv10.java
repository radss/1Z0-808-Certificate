package ce.whiz.chapter5;

public class W5cv10 {

	public static void main(String[] args) {

	}
	
	void go() {
		System.out.println("A "); //A
		try {
			run(0);
			System.out.println("B ");
		}catch(Exception e) {
			/*vyl�tla obecn� Exception d�ky int x=5/i v run(..) proto�e neodchytila NumberFormatException
			(pat�� pod mysl�m ArithmeticException) => nevytisklo se G*/
			System.out.println("C "); //A E H C
		}finally {
			//provede se blok ve finally pat��c� pod go(). Plat� �e metoda m��e m�t pouze jednoun finally()
			//ale zde jsou dv� metody a ka�d� m� jednu finally co� je ok
			System.out.println("D "); //A E H C D
		}
	}
	
	void run(int i) {
		try {
			System.out.println("E "); //A E
			int x= 5/i;
			System.out.println("F ");
		}catch(NumberFormatException e) {
			System.out.println("G ");
		}finally {
			//provede se finally ve volan� metod�
			System.out.println("H "); //A E H
		}
		
	}

}
