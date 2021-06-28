package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvExperiences;

public interface CvExperiencesService {

    Result add(CvExperiences cvExperiences);
	
	Result delete(int id);
	
	Result update(CvExperiences cvExperiences);
	
	DataResult<CvExperiences> getById(int id);
	
	DataResult<List<CvExperiences>> getAll();
		
	DataResult<List<CvExperiences>> getAllByCandidatesId(int id);

	DataResult<List<CvExperiences>> getAllByCandidatesIdOrderByFinishDateDesc(int id);


}
