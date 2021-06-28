package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CvSchoolsService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvSchoolsDao;
import kodlamaiocamp.hrms.entities.concretes.Candidates;
import kodlamaiocamp.hrms.entities.concretes.CvSchools;
import kodlamaiocamp.hrms.entities.concretes.JobAdverts;

@Service
public class CvSchoolsManager implements CvSchoolsService {

	private CvSchools cvSchools;
	private CvSchoolsDao cvSchoolsDao;
	
	@Autowired
	public CvSchoolsManager(CvSchoolsDao cvSchoolsDao) {
		super();
		this.cvSchoolsDao=cvSchoolsDao;
	}
	

	@Override
	public Result add(CvSchools cvSchools) {
		this.cvSchoolsDao.save(cvSchools); 
		return new SuccessResult("okullar eklendi");		
	}
	
	@Override
	public Result delete(int id) {
		this.cvSchoolsDao.deleteById(id); 
		return new SuccessResult("okullar silindi");		
	}
	

	@Override
	public Result update(CvSchools cvSchools) {
		this.cvSchoolsDao.save(cvSchools); 
		return new SuccessResult("okullar güncellendi");		
	}	

	@Override
	public DataResult<List<CvSchools>> getAll() {
		
		return new SuccessDataResult<List<CvSchools>>
		(this.cvSchoolsDao.findAll(),"okullar listelendi");
	}

	@Override
	public DataResult<List<CvSchools>> getAllByCandidatesIdOrderByFinishDateDesc(int id){
	
		return new SuccessDataResult<List<CvSchools>>
		(this.cvSchoolsDao.getAllByCandidatesIdOrderByFinishDateDesc(id));
	
	}
		@Override
	public DataResult<List<CvSchools>> getAllByCandidatesId(int id) {
			return new SuccessDataResult<List<CvSchools>>
			(this.cvSchoolsDao.getAllByCandidatesId(id));
		
	}

	@Override
	public DataResult<CvSchools> getById(int id) {
		return new SuccessDataResult<CvSchools>
		(this.cvSchoolsDao.getById(id));
	}


}
