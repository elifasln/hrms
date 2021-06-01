package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.EmployeeService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaiocamp.hrms.entities.concretes.Employees;

@Service
public class EmployeeManager implements EmployeeService {
private EmployeesDao employeesDao;
	@Autowired
	 public EmployeeManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao=employeesDao;
		
		
	}
	
	
	@Override
	public DataResult<List<Employees>> getAll() {
		return new SuccessDataResult<List<Employees>>
		(this.employeesDao.findAll(),"sistem personeli listelendi");
	}

	@Override
	public Result add(Employees employees) {
		return null;
	}

}
