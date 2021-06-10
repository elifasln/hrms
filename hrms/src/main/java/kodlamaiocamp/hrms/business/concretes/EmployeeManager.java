package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.EmployeeService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
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

//@Override
//	public Result add(Employees employees) {
//		this.employeesDao.save(employees);
//		save metodu ile iş poziyonu ekleme ve güncelleme 
//	return new SuccessResult(" sistem personeli eklendi");
//	
//	}
//
//
//	@Override
//	public Result delete(int id) {
//		this.employeesDao.deleteById(id);
//				return new SuccessResult("şehirler silindi");
//	}
//
//
//	@Override
//	public Result update(Employees employees) {
//		this.employeesDao.save(employees);
//			return new SuccessResult("şehirler güncellendi");
//	}
//
//
//	@Override
//	public DataResult<Employees> getById(int id) {
//		return new SuccessDataResult<Employees>
//		(this.employeesDao.getById(id));		
//	}
}
