package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
	
	Result add(JobTitle jobTitle);
	
//	Result delete(int id);
	
//	Result update(JobTitle jobTitle);
	
	DataResult<List<JobTitle>> getAll();  
	
	DataResult<JobTitle> getByTitle(String title);
	
//	DataResult<JobTitle> getById(int id); 
	
	Boolean existsByTitle(String title);

}