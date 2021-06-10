package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.JobAdverts;

public interface JobAdvertsService {
	
	Result add(JobAdverts jobAdverts);
	
	Result delete(int id);
	
	Result update(JobAdverts jobAdverts);
	
	Result changeOpenToClose(int id);
	
	DataResult<List<JobAdverts>> getAll();

	DataResult<List<JobAdverts>> getAllOpenJobAdvertsList();
	
	DataResult<List<JobAdverts>>findAllSortedByIsActive();
	
	DataResult<List<JobAdverts>> getAllOpenJobAdvertsByEmployer(int id);

	DataResult<JobAdverts> getById(int id);

}