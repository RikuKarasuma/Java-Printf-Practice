package xyz.softwareeureka.practice.printf;

// Bind stdout as static import for easy reference. 
import static java.lang.System.out;

public class Printf
{

	public static void main(String[] args)
	{
		/**
		 * Basic example of a formatted String. This is using a inserted String 
		 * and float parameter. 
		 */
		
		// Our population float to be inserted.
		final float country_population = 66.44f;
		
		final String
			// Our country string to be inserted.
			country = "United Kingdom",
			// Our formatted string with 
			formatted_string = "This country(%s) contains %.2f million people.%n";
		
		// Now we use printf to format our String and send to standard out.
		out.printf(formatted_string, country, country_population);
		
		
		/**
		 * Here we can pre format a String without using printf, instead we use
		 * the String function to format our String text and variables to insert.
		 */
		final String preformatted_string = String.format(formatted_string, country, country_population);
		
		// Send out our preformatted string to standard out.
		out.print(preformatted_string);
	}
}