package ce.examples.chapter3;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateChyt�k2 {

	public static void main(String[] args) {
		/*
		 * nebude compile error ale vyl�tne runtime DateTimeException proto�e duben nem� 40 dn�!!!
		 */
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());

	}

}
