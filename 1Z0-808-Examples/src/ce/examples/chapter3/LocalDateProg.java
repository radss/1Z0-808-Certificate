package ce.examples.chapter3;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateProg {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
		date.plusDays(2);
		date.plusYears(3);
		//vytiskne 2018 APRIL 30. 
		//NEP�IDAJ� SE dny proto�e LocalDate stejn� jako ostatn� datumy jsou immutable!!!
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());

	}

}
