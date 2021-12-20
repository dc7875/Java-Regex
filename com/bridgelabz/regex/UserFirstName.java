package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.Pattern;

public class UserFirstName {

	
		public boolean regex() {

			String firstName = "Durgesh";
			String pattern = "^[A-Z][a-z]{3,}$";

	// Pattern object
			Pattern regex = Pattern.compile(pattern);

	//  matcher object
			Matcher m = regex.matcher(firstName);

			if (m.matches()) {
				return true;
			}
			return false;
		}

	//Main method
		public static void main(String[] args) {
			UserFirstName fName = new UserFirstName();
			System.out.println(fName.regex());
		

	}

}
