package ce.examples.chapter3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateChyt�k {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
				date.plusDays(2);
				//compile error - LocalDate nem��e pou��t hodiny (time)!!!
				date.plusHours(3);
				System.out.println(date.getYear() + " " + date.getMonth() + " "
				+ date.getDayOfMonth());

	}

}
