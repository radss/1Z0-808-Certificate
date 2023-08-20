package ce.examples.chapter6;

import java.io.IOException;

//cv14
public class OhNo {
	 public void ohNo() throws IOException {
		 /*  Bez problémù, pokud má metoda throws IOException
		  *  mùže ALE NEMUSÍ být exception v tìle vyhozena pomocí throw new
		  *  
		  *  Naopak ale pokud nemá metodav deklaraci throws, tak nemùže být vyhozena exceptions
		  *  pomocí throw new !!!
		  */
		 System.out.println("it's ok");
		 /*
		  * OK - Jakákoliv z tìchto exceptions mùže být vyhozena a nebude compile fails
		  */
		 //throw new java.io.IOException();
		 //throw new IllegalArgumentException();		
		 //throw new RuntimeException();
		 
		 //NELZE - jedná se o širší/obecnìjší výjimku než throws IOException
		 //throw new Exception();
	 }
	public static void main(String[] args) {


	}

}
