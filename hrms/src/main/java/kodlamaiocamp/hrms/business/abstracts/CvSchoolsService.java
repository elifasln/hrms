package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvSchools;

public interface CvSchoolsService {

	Result add(CvSchools cvSchools);
	
	Result delete(int id);
	
	Result update(CvSchools cvSchools);
	
	DataResult<CvSchools> getById(int id);
	
	DataResult<List<CvSchools>> getAll();
		
	DataResult<List<CvSchools>> getAllByCandidatesId(int id);

	DataResult<List<CvSchools>> getAllByCandidatesIdOrderByFinishDateDesc(int id);



}
