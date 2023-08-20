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
		 //z finally se vytiskne je�t� C je�t� p�edt�m ne� spadne na NPE 
		 //v�sledek AEC a pak NPE
	 }
 }
