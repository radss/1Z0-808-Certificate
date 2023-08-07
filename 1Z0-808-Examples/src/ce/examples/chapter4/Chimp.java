package ce.examples.chapter4;

import ce.examples.chapter4.rope.*;
import static ce.examples.chapter4.rope.Rope.*; //import static d�ky kter�mu m��eme p�istupovat k samotn� konstant� LENGTH

public class Chimp {
	 public static void main(String[] args) {
		 //standardn� p��stup ke statick� metod� a vytiskne "swing"
		 Rope.swing();
		 Rope rope = new Rope();

		 //java povoluje p��stup ke statick� metod� skrze instanci
		 new Rope().swing();
		 
		 //toto by tak� bylo v po��dku
		 //rope.swing();
		 
		 //deklarace konstanty byla 5 ale ve static bloku se zm�nila na 10 a to se i vytiskne
		 System.out.println(LENGTH);
	 } 
 }
