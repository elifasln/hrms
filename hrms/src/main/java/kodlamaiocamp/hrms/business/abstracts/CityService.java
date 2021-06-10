package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Cities;

public interface CityService {
	
	DataResult<List<Cities>> getAll();
	
	//Result add(Cities cities);
	
	//Result delete(int id);
	
	//Result update(Cities cities);	
	
	DataResult<Cities> getById(int id);

}