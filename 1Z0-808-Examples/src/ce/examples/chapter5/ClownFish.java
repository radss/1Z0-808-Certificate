package ce.examples.chapter5;

 interface Aquatic {
	 public default int getNumberOfGills(int input) { return 2; }
 }
 
 public class ClownFish implements Aquatic {
	 //vlastní metoda ClownFish (nikoliv overloadnutá metoda z Aquatic!), žádný problém
	 public String getNumberOfGills() { return "4"; }
	 //zde chce overridnout (stejný poèet args i název) ale jiný návratový typ
	 //public String getNumberOfGills(int input) { return "6"; }
	 
	 public static void main(String[] args) {
		 System.out.println(new ClownFish().getNumberOfGills(-1));
	 }
 }
