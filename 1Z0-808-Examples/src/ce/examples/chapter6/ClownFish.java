package ce.examples.chapter6;

 interface Aquatic {
	 public default int getNumberOfGills(int input) { return 2; }
 }
 
 public class ClownFish implements Aquatic {
	 //vlastn� overloadnut� metoda, ��dn� probl�m
	 public String getNumberOfGills() { return "4"; }
	 //zde chce overridnout (stejn� po�et args i n�zev) ale jin� n�vratov� typ
	 public String getNumberOfGills(int input) { return "6"; }
	 
	 public static void main(String[] args) {
		 System.out.println(new ClownFish().getNumberOfGills(-1));
	 }
 }
