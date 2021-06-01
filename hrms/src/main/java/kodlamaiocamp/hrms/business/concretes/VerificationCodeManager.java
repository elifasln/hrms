package kodlamaiocamp.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.VerificationCodesService;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.VerificationCodesDao;
import kodlamaiocamp.hrms.entities.concretes.VerificationCodes;
@Service
public class VerificationCodeManager implements VerificationCodesService {

	private VerificationCodesDao verificationCodesDao;
	
	
	
	@Autowired
	public VerificationCodeManager(VerificationCodesDao verificationCodesDao) {
		this.verificationCodesDao=verificationCodesDao;
	}
	@Override
	public Result add(VerificationCodes verificationCodes) {
		this.verificationCodesDao.save(verificationCodes);
		return new SuccessResult("mail gönderildi");
	}

}
