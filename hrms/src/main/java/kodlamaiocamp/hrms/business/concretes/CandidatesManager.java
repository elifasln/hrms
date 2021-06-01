package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CandidatesService;
import kodlamaiocamp.hrms.business.abstracts.UserService;
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
	
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao,UserService userService) {
		super();
		this.candidatesDao = candidatesDao;
		this.userService=userService;
	
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>
		(this.candidatesDao.findAll(),"iş arayanlar listelendi");
	}

	@Override
	public Result add(Candidates candidates) {

		
		if(this.userService.existsByEmail(candidates.getEmail())!=true) {
			
			this.candidatesDao.save(candidates); 
			return new SuccessResult("iş arayanlar eklendi");
		}
		return new ErrorResult("bilgilerinizi kontrol ediniz");
		
	}

	@Override
	public Boolean existsByIdentityNumber(String identityNumber) {
		return this.candidatesDao.existsByIdentityNumber(identityNumber);

	}

}
