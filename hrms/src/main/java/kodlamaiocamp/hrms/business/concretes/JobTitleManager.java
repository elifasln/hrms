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
		(this.jobTitleDao.findAll(),"iş pozisyonları listelendi");
		//onun datası jobTitleDao=this
		//mesajı "data listelendi"
	}
	
	@Override
	public DataResult<JobTitle> getByTitle(String title) {
		return new SuccessDataResult<JobTitle>
		(this.jobTitleDao.findByTitle(title));

}
	
	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle); 
		// save metodu ile iş poziyonu ekleme ve güncelleme 
		return new SuccessResult("iş poziyonları eklendi");
	}
	@Override
	public Boolean existsByTitle(String title) {
		return this.jobTitleDao.existsByTitle(title);

		
	}
	
	
//	@Override
//	public Result delete(int id) {
//		
//		this.jobTitleDao.deleteById(id);
//	return new SuccessResult("iş poziyonları silindi");
//
//	}
//	@Override
//	public Result update(JobTitle jobTitle) {
//		this.jobTitleDao.save(jobTitle);
//		return new SuccessResult("iş arayanlar güncellendi");
//
//	}
//	@Override
//	public DataResult<JobTitle> getById(int id) {
//		return new SuccessDataResult<JobTitle>
//		(this.jobTitleDao.getById(id));	
//	}
	}
