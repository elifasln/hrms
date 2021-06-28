package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvLink;

public interface CvLinkService {

    Result add(CvLink cvLink);
	
	Result delete(int id);
	
	Result update(CvLink cvLink);
	
	DataResult<CvLink> getById(int id);
	
	DataResult<List<CvLink>> getAll();
	
	DataResult<List<CvLink>> getAllByCandidatesId(int id);

}
