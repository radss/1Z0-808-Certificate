package ce.examples.chapter3;

public class Purr {

	public static void main(String[] args) {
	  String s = "purr";
	  /* String je immutable!!! Jednotlivé zmìny se nepropisují/ignorují!!!
	   * to by se muselo udìlat s = s.toUpperCase()...
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
