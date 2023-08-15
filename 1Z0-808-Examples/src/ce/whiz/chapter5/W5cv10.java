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
			/*vylítla obecná Exception díky int x=5/i v run(..) protože neodchytila NumberFormatException
			(patøí pod myslím ArithmeticException) => nevytisklo se G*/
			System.out.println("C "); //A E H C
		}finally {
			//provede se blok ve finally patøící pod go(). Platí že metoda mùže mít pouze jednoun finally()
			//ale zde jsou dvì metody a každá má jednu finally což je ok
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
			//provede se finally ve volané metodì
			System.out.println("H "); //A E H
		}
		
	}

}
