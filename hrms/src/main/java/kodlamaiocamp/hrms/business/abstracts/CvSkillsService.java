package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvSkills;

public interface CvSkillsService {

	    Result add(CvSkills cvSkills);
		
		Result delete(int id);
		
		Result update(CvSkills cvSkills);
		
		DataResult<CvSkills> getById(int id);
		
		DataResult<List<CvSkills>> getAll();
		
		DataResult<List<CvSkills>> getAllByCandidatesId(int id);

}
