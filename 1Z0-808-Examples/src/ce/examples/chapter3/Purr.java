package ce.examples.chapter3;

public class Purr {

	public static void main(String[] args) {
	  String s = "purr";
	  /* String je immutable!!! Jednotliv� zm�ny se nepropisuj�/ignoruj�!!!
	   * to by se muselo ud�lat s = s.toUpperCase()...
	  */
	  s.toUpperCase();
	  s.trim();
	  s.substring(1, 3);
	  s+=" two";
	  //purr two
	  System.out.println(s);
	  System.out.println(s.length());

	}

}
