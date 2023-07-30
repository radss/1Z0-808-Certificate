package ce.examples.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

 public abstract class Bird {
	 //hidden metoda...m��e b�t skryto, nikoliv overriden!!
	 private void fly() { 
		 	System.out.println("Bird is flying"); 
	 }
	 
	 /*
	  * 	//zm�na na protected...nem��e b�t public proto�e v childu Pelican je protected!!
	  * 	protected void fly() { 
		 		System.out.println("Bird is flying"); 
	 		}
	 		
	 		..
	 		
	 		Bird bird = new Pelican(); //vytisklo by se "Pelican is flying"...
	  */
	 
	 public static void main(String[] args) {
		 /*v bird je new Pelican() (nikoliv instance abstract classy Bird...stejn� jako u interfejsu...
		 	kdy lze interfejsu d�t instanci classy kter� jej implementuje
		 */
		 Bird bird = new Pelican();
		 bird.fly(); //vytiskne "Bird is flying" proto�e se odkazuje v r�mci Bird classy
		 
		 /*
		  * Pelican bird = new Pelican(); //vytisklo by se "Pelican is flying"
		  */
	 }
 }
 
	class Pelican extends Bird {
			protected void fly() {
					System.out.println("Pelican is flying");
			}
	}
