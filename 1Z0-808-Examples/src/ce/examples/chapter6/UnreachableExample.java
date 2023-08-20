package ce.examples.chapter6;

//cv8
public class UnreachableExample {
	
	public static void main(String[] args) {
		/*
		 * Zde nen� zkou�eno return kter� je mimo metodu a tedy nelze.
		 * Zde je zkou�eno, �e RuntimeException je v�ce obecn� ne� ArithmeticException
		 * a t�m se st�v� ArithmeticException unreachable. 
		 * Nejv�ce obecn� exceptions mus� b�t definovan� v catch a� po v�ce specifick�ch
		 * exceptions.
		 */
		try{
			 	return a / b;
		}catch (RuntimeException e) {
			 return -1;
		}catch (ArithmeticException e) {
			 return 0;
		}finally {
			 System.out.print("done");
		} 

	}

}
