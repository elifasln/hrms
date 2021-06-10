package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.EmployersService;
import kodlamaiocamp.hrms.business.abstracts.UserService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.ErrorResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.EmployersDao;

import kodlamaiocamp.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService {
	private EmployersDao employersDao;
	private UserService userService;

	
	@Autowired
	 public EmployersManager(EmployersDao employerDao,UserService userService) {
		super();
		this.employersDao=employerDao;
		this.userService=userService;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>
		(this.employersDao.findAll(),"işveren bilgileri listelendi");		
		
	}

	@Override
	public Result add(Employers employers) {
if(this.userService.existsByEmail(employers.getEmail())!=true) {
			
			this.employersDao.save(employers); 
			return new SuccessResult("iş arayanlar eklendi");
		}
else {
		return new ErrorResult("mail bilgilerinizi kontrol ediniz");
}
	}

//	@Override
//	public Result delete(int id) {
//		this.employersDao.deleteById(id);
//			return new SuccessResult("iş arayanlar silindi");
//
//	}
//
//	@Override
//	public Result update(Employers employers) {
//		this.employersDao.save(employers);
//		return new SuccessResult("iş arayanlar güncellendi");
//
//	}
//
//	@Override
//	public DataResult<Employers> getById(int id) {
//		return new SuccessDataResult<Employers>
//		(this.employersDao.getById(id));	
//	}
//	

}
