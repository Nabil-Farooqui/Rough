import java.util.*;
import java.time.*;
import java.text.*;


public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//displayDateUsingNumbers();
		displayingUsingSimpleDateFormat();

	}

/*	private static void displayDateUsingNumbers()
	{
		int yr= MyConsole.getNumber("Enter the year of birth");
		int month=MyConsole.getNumber("Enter the month of birth");
		int day=MyConsole.getNumber("Enter the day of birth");
		
		LocalDate dt=LocalDate.of(yr, month, day);
		System.out.println("The date is:  " +dt);
	}*/
	
	private static void displayingUsingSimpleDateFormat() 
	{
		//Java provides a class called SimpleDateFormat that allows U to format and parse dates as per UR system requirements. 
		Date dt = new Date();
		String format = "dd/MM/yyyy";
		SimpleDateFormat fm = new SimpleDateFormat(format);
		System.out.println(fm.format(dt));
	}
}
