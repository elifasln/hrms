package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvCoverLetters;

public interface CvCoverLettersService {
	
    Result add(CvCoverLetters cvCoverLetters);
	
	Result delete(int id);
	
	Result update(CvCoverLetters cvCoverLetters);
	
	DataResult<CvCoverLetters> getById(int id);
	
	DataResult<List<CvCoverLetters>> getAll();



}
