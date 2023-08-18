package ce.examples.chapter3;

import java.time.LocalDate;

public class StartOfSummer {
	//úkolem je vytvoøit June 21, 2014?
	public static void main(String[] args) {
	
		  //NELZE LocalDate nemá public konstruktor!!
		 //LocalDate date = new LocalDate(2014, 5, 21);
		
		//není dobøe mìsíc zaèíná netypicky indexem 1	
		//LocalDate date = LocalDate.of(2014, 5, 21);
		
		//NELZE požít Calendar 
		//LocalDate date  = LocalDate.of(2014, Calendar.JUNE, 21);
		
		//tyto obì možnosti ok
		//LocalDate date  = LocalDate.of(2014, 6, 21);
		LocalDate date  = LocalDate.of(2014, 6, 21);
		System.out.println(date);


	}

}
