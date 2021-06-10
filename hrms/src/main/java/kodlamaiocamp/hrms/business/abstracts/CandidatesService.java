package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Candidates;

public interface CandidatesService {

	Result add(Candidates candidates);
	
	Result delete(int id);
	
	Result update(Candidates candidates);

	DataResult<List<Candidates>> getAll();
	
	DataResult<Candidates> getByIdentityNumber(String identityNumber);
	
	DataResult<Candidates> getById(int id);
	
	Boolean existsByIdentityNumber(String identityNumber);

}