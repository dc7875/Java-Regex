package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserValidEmail {
	public boolean regexCheck(String validEmail) {

		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";

		//  Pattern object
		Pattern r = Pattern.compile(regex);
		
		//matcher object
		Matcher m = r.matcher(validEmail);

		if (m.matches()) {
			return true;
		}
		return false;
	}

// Main Method
	public static void main(String[] args) {
		UserValidEmail checkEmail = new UserValidEmail();
		System.out.println(checkEmail.regexCheck("xyz@abc.com"));
		System.out.println(checkEmail.regexCheck("abc-111@yahoo.7875com"));
	}

}
