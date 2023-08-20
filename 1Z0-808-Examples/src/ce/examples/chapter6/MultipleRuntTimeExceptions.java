package ce.examples.chapter6;

//cv20
public class MultipleRuntTimeExceptions {

	public static void main(String[] args) {
		//ok vytiskne
		 System.out.print("a");
	 try {
		//ok vytiskne
		 System.out.print("b");
		 //vyhod� "um�le" IllegalArgumentException a jde do catch kde tiskne
		 throw new IllegalArgumentException();
	 } catch (IllegalArgumentException e) {
		//ok vytiskne
		 System.out.print("c");
		 //vyhod� RuntimeException, KTER� NEN� JINDE ODCHYCENA a jde do finally...jakto 
		 //�e se neukon�� a pojede finally???...moc nech�pu
		 throw new RuntimeException("1");
	 } catch (RuntimeException e) {
		 System.out.print("d");
		 throw new RuntimeException("2");
	 } finally {
		//ok vytiskne
		 System.out.print("e");
		//ok vytiskne 3
		 throw new RuntimeException("3");
	 }

	}

}
