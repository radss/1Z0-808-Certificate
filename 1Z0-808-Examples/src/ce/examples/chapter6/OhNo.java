package ce.examples.chapter6;

import java.io.IOException;

//cv14
public class OhNo {
	 public void ohNo() throws IOException {
		 /*  Bez probl�m�, pokud m� metoda throws IOException
		  *  m��e ALE NEMUS� b�t exception v t�le vyhozena pomoc� throw new
		  *  
		  *  Naopak ale pokud nem� metodav deklaraci throws, tak nem��e b�t vyhozena exceptions
		  *  pomoc� throw new !!!
		  */
		 System.out.println("it's ok");
		 /*
		  * OK - Jak�koliv z t�chto exceptions m��e b�t vyhozena a nebude compile fails
		  */
		 //throw new java.io.IOException();
		 //throw new IllegalArgumentException();		
		 //throw new RuntimeException();
		 
		 //NELZE - jedn� se o �ir��/obecn�j�� v�jimku ne� throws IOException
		 //throw new Exception();
	 }
	public static void main(String[] args) {


	}

}
