package ce.examples.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

 public abstract class Bird {
	 //hidden metoda...mùže být skryto, nikoliv overriden!!
	 private void fly() { 
		 	System.out.println("Bird is flying"); 
	 }
	 
	 /*
	  * 	//zmìna na protected...nemùže být public protože v childu Pelican je protected!!
	  * 	protected void fly() { 
		 		System.out.println("Bird is flying"); 
	 		}
	 		
	 		..
	 		
	 		Bird bird = new Pelican(); //vytisklo by se "Pelican is flying"...
	  */
	 
	 public static void main(String[] args) {
		 /*v bird je new Pelican() (nikoliv instance abstract classy Bird...stejné jako u interfejsu...
		 	kdy lze interfejsu dát instanci classy která jej implementuje
		 */
		 Bird bird = new Pelican();
		 bird.fly(); //vytiskne "Bird is flying" protože se odkazuje v rámci Bird classy
		 
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
