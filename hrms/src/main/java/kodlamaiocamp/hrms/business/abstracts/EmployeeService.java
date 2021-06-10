package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Employees;

public interface EmployeeService {
	
	DataResult<List<Employees>> getAll();
	
	//Result add(Employees employees);
	
	//Result delete(int id);
	
	//Result update(Employees employees);

	//DataResult<Employees> getById(int id);

}