package kodlamaiocamp.hrms.core.utilities.mailCheck;

import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;

public class MailValidationManager {
	public static Result sendMail(String email) {
		return new SuccessResult(email+" "+ "adresinize mail doğrulama linkiniz gönderilmiştir");
	}

}
