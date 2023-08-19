package ce.examples.chapter1;

public class JavaType2 {
	
		 public void admission() {
			 //NELZE pøiøadit do int šlo by long amount1 = 9L díky autoboxingu
			 //int amount1 = 9L;
			 
			 //LZE do int a double pøiøadit hexa nebo binary hodnoty
			 int amount2 = 0b101; //binary
			 int amount3 = 0xE; //hexa
			 double amount4 = 0xE;
			 double amount5 = 0b101;
			 
			 //NELZE protože _ je pøed decimal point
			 //double amount6 = 1_2_.0_0;
			 
			 //NELZE protože _ je poslední znak
			 //double amount7 = 1_2_
		 
			 System.out.println(amount2);
		 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
