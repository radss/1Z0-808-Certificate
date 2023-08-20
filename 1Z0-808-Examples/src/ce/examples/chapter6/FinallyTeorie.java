package ce.examples.chapter6;

public class FinallyTeorie {
	/**
	 * cv3 - možnost C ok
	 * Kdy je vyžadováno použít finally blok?
	 * =>když se použije try{} bez catch bloku
	 * 
	 * Je vyžadováno aby mìl try{} bud catch nebo finally
	 * 
	 * Pokud se ale vyhodí exception, není odcyhceno do catch tak i když je finally blok který se provede
	 * stejnì program spadne, protože exceptiona prostì není odchycena a program neví co dìlat.
	 * 
	 */

}
