package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvLanguages;

public interface CvLanguagesService {
	
    Result add(CvLanguages cvLanguages);
	
	Result delete(int id);
	
	Result update(CvLanguages cvLanguages);
	
	DataResult<CvLanguages> getById(int id);
	
	DataResult<List<CvLanguages>> getAll();
	
	DataResult<List<CvLanguages>> getAllByCandidatesId(int id);


}
