package ce.examples.chapter4;

import ce.examples.chapter4.rope.*;
import static ce.examples.chapter4.rope.Rope.*; //import static díky kterému mùžeme pøistupovat k samotné konstantì LENGTH

public class Chimp {
	 public static void main(String[] args) {
		 //standardní pøístup ke statické metodì a vytiskne "swing"
		 Rope.swing();
		 Rope rope = new Rope();

		 //java povoluje pøístup ke statické metodì skrze instanci
		 new Rope().swing();
		 
		 //toto by také bylo v poøádku
		 //rope.swing();
		 
		 //deklarace konstanty byla 5 ale ve static bloku se zmìnila na 10 a to se i vytiskne
		 System.out.println(LENGTH);
	 } 
 }
