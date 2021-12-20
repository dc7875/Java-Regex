package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLastName {
	public boolean regex() {

		String lastName = "Chavan";
		String pattern = "^[A-Z][a-z]{3,}$";

// Pattern object
		Pattern regex = Pattern.compile(pattern);

//  matcher object
		Matcher m = regex.matcher(lastName);

		if (m.matches()) {
			return true;
		}
		return false;
	}

//Main method
	public static void main(String[] args) {
		UserFirstName lastName = new UserFirstName();
		System.out.println(lastName.regex());
	

}

}
