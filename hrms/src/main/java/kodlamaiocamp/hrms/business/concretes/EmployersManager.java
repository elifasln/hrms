package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaiocamp.hrms.business.abstracts.EmployersService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaiocamp.hrms.entities.concretes.Employers;

public class EmployersManager implements EmployersService {
	private EmployersDao employersDao;
	
	@Autowired
	 public EmployersManager(EmployersDao employerDao) {
		super();
		this.employersDao=employerDao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.findAll(),"işveren bilgileri listelendi");		
		
		
	}

	@Override
	public Result add(Employers employers) {
		return null;
	}
	
	

}
