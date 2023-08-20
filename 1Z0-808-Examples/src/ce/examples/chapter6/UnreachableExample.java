package ce.examples.chapter6;

//cv8
public class UnreachableExample {
	
	public static void main(String[] args) {
		/*
		 * Zde není zkoušeno return který je mimo metodu a tedy nelze.
		 * Zde je zkoušeno, že RuntimeException je více obecná než ArithmeticException
		 * a tím se stává ArithmeticException unreachable. 
		 * Nejvíce obecné exceptions musí být definované v catch až po více specifických
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
