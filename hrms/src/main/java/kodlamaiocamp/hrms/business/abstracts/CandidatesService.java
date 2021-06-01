package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Candidates;

public interface CandidatesService {
	DataResult<List<Candidates>> getAll();
	Result add(Candidates canididates);
	Boolean existsByIdentityNumber(String identityNumber);



}
