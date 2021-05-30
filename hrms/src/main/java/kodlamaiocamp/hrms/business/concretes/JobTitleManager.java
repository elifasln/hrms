package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.JobTitleService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaiocamp.hrms.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService {

	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}
	@Override
	public DataResult<List<JobTitle>> getAll()
 {
		
		return new SuccessDataResult<List<JobTitle>>
		//ben bir SuccesDataResult döndüreceğim
		(this.jobTitleDao.findAll(),"data listelendi");
		//onun datası jobTitleDao=this
		//mesajı "data listelendi"
	}
	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle); 
		// save metodu ile iş poziyonu ekleme ve güncelleme 
		return new SuccessResult("ürün eklendi");
	}

}
