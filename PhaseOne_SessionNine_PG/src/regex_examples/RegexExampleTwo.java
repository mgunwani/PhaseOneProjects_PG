package regex_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExampleTwo {
	
	public static void main(String[] args) {
		
		List<String> emp_emails = new ArrayList<String>();
		
		emp_emails.add("king@gmail.com");
		emp_emails.add("kochhar@gmail.com");
		emp_emails.add("gautam@gmail.com");
		emp_emails.add("shreya@gmail.com");
		emp_emails.add("bhawna#gmail.com");
		
		String regex = "^(.+)@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		
		for (String email : emp_emails) {
			Matcher match = pattern.matcher(email);
			System.out.println(email + " : " + match.matches());
		}
		
	}

}
