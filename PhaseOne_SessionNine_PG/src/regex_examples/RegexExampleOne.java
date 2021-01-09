package regex_examples;

import java.util.regex.*;

/**
 * 
 * @author BhawnaGunwani
 *
 * Pattern Class
 * Matcher Class
 * PatternSyntaxException Class
 * 
 *
 */

public class RegexExampleOne {
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Alex|John");
		Matcher matcher = pattern.matcher("Hello, I am Alex and here to meet Mr. John.");
		
		while(matcher.find()) {
			System.out.print("Starting Index : " + matcher.start());
			System.out.print("Ending Index : " + matcher.end());
			System.out.println(" - " + matcher.group());	
		}
		
	}

}
