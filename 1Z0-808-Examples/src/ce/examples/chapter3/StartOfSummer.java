package ce.examples.chapter3;

import java.time.LocalDate;

public class StartOfSummer {
	//�kolem je vytvo�it June 21, 2014?
	public static void main(String[] args) {
	
		  //NELZE LocalDate nem� public konstruktor!!
		 //LocalDate date = new LocalDate(2014, 5, 21);
		
		//nen� dob�e m�s�c za��n� netypicky indexem 1	
		//LocalDate date = LocalDate.of(2014, 5, 21);
		
		//NELZE po��t Calendar 
		//LocalDate date  = LocalDate.of(2014, Calendar.JUNE, 21);
		
		//tyto ob� mo�nosti ok
		//LocalDate date  = LocalDate.of(2014, 6, 21);
		LocalDate date  = LocalDate.of(2014, 6, 21);
		System.out.println(date);


	}

}
