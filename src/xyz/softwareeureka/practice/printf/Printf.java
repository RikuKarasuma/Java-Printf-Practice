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
		
		// Population float to be inserted.
		final float country_population = 66.44f;
		
		final String
			// Country string to be inserted.
			country = "United Kingdom",
			// Formatted string with % variable definitions inserted. 
			formatted_string = "This country(%s) contains %.2f million people.%n";
		
		// Now we use printf to format our String and send to standard out.
		out.printf(formatted_string, country, country_population);
		
		
		/**
		 * Here we can pre-format a String without using printf, instead we use
		 * the String function to format our String text and variables to insert.
		 */
		final String preformatted_string = String.format(formatted_string, country, country_population);
		
		// Send out our pre-formatted string to standard out.
		out.print(preformatted_string);
		
		
		/**
		 * Summary of printf format specifiers.
		 * 
		 * %c - Character
		 * %d - Decimal number.
		 * %e - Exponential floating-point number.
		 * %f - Floating-point number.
		 * %i - Integer.
		 * %o - Octal number.
		 * %s - String of characters.
		 * %u - Unsigned decimal number.
		 * %x - Number in hexadecimal (Base 16).
		 * %% - Print a percentage sign.
		 * \% - Print a percentage sign.
		 * 
		 */
		
		/**
		 * Controlling integer width(Right justified).
		 */
		out.printf("Right justfied decimal with Three spaces:%3d%n", 0);
		
		/**
		 * Controlling integer width(Left justified). 
		 */
		out.printf("Left justfied decimal with Three spaces:%-3dtext%n", 0);
		
		/**
		 * Zero filling integer.
		 */
		out.printf("Zero filled integer:%04d%n", 5);
	}
}