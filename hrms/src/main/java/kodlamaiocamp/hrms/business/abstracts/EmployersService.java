package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Employers;

public interface EmployersService {
	
	DataResult<List<Employers>> getAll();
	
	Result add(Employers employers);
	
//	Result delete(int id);
	
//	Result update(Employers employers);
	
//DataResult<Employers> getById(int id); 

}