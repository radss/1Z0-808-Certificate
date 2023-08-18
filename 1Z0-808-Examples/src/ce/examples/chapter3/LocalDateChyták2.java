package ce.examples.chapter3;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateChyták2 {

	public static void main(String[] args) {
		/*
		 * nebude compile error ale vylítne runtime DateTimeException protože duben nemá 40 dní!!!
		 */
		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
		System.out.println(date.getYear() + " " + date.getMonth() + " "
		+ date.getDayOfMonth());

	}

}
