package ce.examples.chapter6;

public class ExceptionsTeorie {
	/**
	 * cv5 - A,B,D ok
	 * Kter� exceptions jsou vyhozeny JVM - ArrayIndexOutOfBoundsException, ExceptionInInitializerError,
	 *  java.io.IOException, NullPointerException nebo NumberFormatException?
	 *  
	 *  =>ArrayIndexOutOfBoundsException, ExceptionInInitializerError, NullPointerException jsou vyhozeny JVM
	 *  
	 *  java.io.IOException je vyvol�na mnoha metodami v bal��ku java.io,
	     ale v�dy se to vyhod� programov� (o�et�il program�tor).
	     Tot� plat� pro NumberFormatException; je vyvol�n programov� obalov�mi t��dami java.lang.
	 */

}
