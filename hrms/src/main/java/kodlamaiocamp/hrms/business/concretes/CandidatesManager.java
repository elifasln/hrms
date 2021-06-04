package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.adapters.MerniceCandidatesCheckService;
import kodlamaiocamp.hrms.business.abstracts.CandidatesService;
import kodlamaiocamp.hrms.business.abstracts.UserService;
import kodlamaiocamp.hrms.core.utilities.mailCheck.MailValidationManager;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.ErrorResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaiocamp.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private UserService userService;
	private MerniceCandidatesCheckService merniceCandidatesCheckService;
	
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao,UserService userService,MerniceCandidatesCheckService merniceCandidatesCheckService) {
		super();
		this.candidatesDao = candidatesDao;
		this.userService=userService;
		this.merniceCandidatesCheckService=merniceCandidatesCheckService;
	
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>
		(this.candidatesDao.findAll(),"iş arayanlar listelendi");
	}

	@Override
	public Result add(Candidates candidates) {

		
		if(this.userService.existsByEmail(candidates.getEmail())!=true && this.existsByIdentityNumber(candidates.getIdentityNumber())!=true){
			
			this.candidatesDao.save(candidates); 
			MailValidationManager.sendMail(candidates.getEmail());

			return new SuccessResult("iş arayanlar eklendi");
		}
		if(userService.existsByEmail(candidates.getEmail())) {
			return new ErrorResult("email bilgilerinizi kontrol edin");
		}
		
		else if(this.existsByIdentityNumber(candidates.getIdentityNumber())) 
		{
		return new ErrorResult("tc kimlik numarası bilgilerinizi kontrol ediniz");
		
	}
		return null;
	}
	@Override
	public Boolean existsByIdentityNumber(String identityNumber) {
		if(this.candidatesDao.existsByIdentityNumber(identityNumber))
				{
			return true;
		}
		return false;
	}
	
}
