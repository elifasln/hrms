package kodlamaiocamp.hrms.business.abstracts;

import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.VerificationCodes;

public interface VerificationCodesService {
	Result add(VerificationCodes verificationCodes);

}
