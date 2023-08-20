package ce.examples.chapter6;

//cv7
public class DoSomething {
	public void go() {
		 //ok vytiskne
		System.out.print("A");
		try {
			stop();
		} catch (ArithmeticException e) {
			System.out.print("B");
		} finally {
			System.out.print("C");
		}
		System.out.print("D");
	}
	 public void stop() {
		 //ok vytiskne
		 System.out.print("E");
		 Object x = null;
		 //spadne na NPE
		 x.toString();
		 System.out.print("F");
	 }
	 public static void main(String[] args) {
		 new DoSomething().go();
		 //z finally se vytiskne ještì C ještì pøedtím než spadne na NPE 
		 //výsledek AEC a pak NPE
	 }
 }
