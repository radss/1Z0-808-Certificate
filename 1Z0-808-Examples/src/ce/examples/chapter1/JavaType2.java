package ce.examples.chapter1;

public class JavaType2 {
	
		 public void admission() {
			 //NELZE p�i�adit do int �lo by long amount1 = 9L d�ky autoboxingu
			 //int amount1 = 9L;
			 
			 //LZE do int a double p�i�adit hexa nebo binary hodnoty
			 int amount2 = 0b101; //binary
			 int amount3 = 0xE; //hexa
			 double amount4 = 0xE;
			 double amount5 = 0b101;
			 
			 //NELZE proto�e _ je p�ed decimal point
			 //double amount6 = 1_2_.0_0;
			 
			 //NELZE proto�e _ je posledn� znak
			 //double amount7 = 1_2_
		 
			 System.out.println(amount2);
		 }
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
