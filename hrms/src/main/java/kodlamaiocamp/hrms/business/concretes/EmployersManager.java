package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import kodlamaiocamp.hrms.business.abstracts.EmployersService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaiocamp.hrms.entities.concretes.Employers;

public class EmployersManager implements EmployersService {
	private EmployersDao employersDao;

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.findAll(),"işveren bilgileri listelendi");		
		
		
	}

	@Override
	public Result add(Employers employers) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
