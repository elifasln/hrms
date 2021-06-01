package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.JobTitle;

public interface JobTitleService {
DataResult<List<JobTitle>> getAll();
Result add(JobTitle jobTitle);
Boolean existsByTitle(String title);


}
