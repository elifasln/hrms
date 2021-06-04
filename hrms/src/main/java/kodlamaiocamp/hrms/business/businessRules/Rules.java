package kodlamaiocamp.hrms.business.businessRules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rules {

	
	public static boolean checkFirstName(String firstName) {

	if(firstName.length()<2) {
		return false;
	}
	else {
		return  true;
	}
}
	public static boolean checkLastName(String lastName) {
	
	if(lastName.length()<2) {
		return false;
	}
	else {
		return  true;
	}
	
	}
	public static boolean checkMail(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		
		if(matcher.matches()) {
			return true;
			
		}
		
		else {
			return false;
		}
		
	}
	
	public static boolean checkPhone(String phoneNumber) {
		
		if(phoneNumber.length()<7) {
			return false;
		}
	
	else
	{
		return true;
	}
	
}
	public static boolean checkPassword(String password) {
		
	if(password.length()<6) {
		return false;
	}
	else {
		return false;
	}
		
	}

	public static boolean checkCompanyName(String companyName) {
		
		if(companyName.length()<2) {
			return false;
		}
		else {
			return true;
		}
	}
		
public static boolean checkWebAddress(String webAddress) {
		
		if(webAddress.length()<5) {
			return false;
		}
		else {
			return true;
		}
	}
public static boolean checkBirthYear(String birthYear) {
	
	if(birthYear==null) {
		return false;
	}
	else {
		return true;
	}
	
}

public static boolean checkJobTitle(String title) {
	
	if(title.length()<2) {
		return false;
	}
	else {
		return true;
	}
}
	
}
	
	
	
	


