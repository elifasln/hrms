package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CvExperiencesService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvExperiencesDao;
import kodlamaiocamp.hrms.entities.concretes.CvCoverLetters;
import kodlamaiocamp.hrms.entities.concretes.CvExperiences;
import kodlamaiocamp.hrms.entities.concretes.CvSchools;


@Service
public class CvExperiencesManager implements CvExperiencesService {

	
	private CvExperiencesDao cvExperiencesDao;
	
	public CvExperiencesManager(CvExperiencesDao cvExperiencesDao) {
		super();
		this.cvExperiencesDao = cvExperiencesDao;
	}

	@Override
	public Result add(CvExperiences cvExperiences) {
		this.cvExperiencesDao.save(cvExperiences); 
		return new SuccessResult("deneyim eklendi");	
	}

	@Override
	public Result delete(int id) {
		this.cvExperiencesDao.deleteById(id);
		return new SuccessResult("deneyim silindi");	
	}

	@Override
	public Result update(CvExperiences cvExperiences) {
		this.cvExperiencesDao.save(cvExperiences); 
		return new SuccessResult("deneyim güncellendi");	
	
	}

	@Override
	public DataResult<CvExperiences> getById(int id) {
		return new SuccessDataResult<CvExperiences>
		(this.cvExperiencesDao.getById(id));
	}

	@Override
	public DataResult<List<CvExperiences>> getAll() {
		return new SuccessDataResult<List<CvExperiences>>
		(this.cvExperiencesDao.findAll(),"deneyimler listelendi");
	}

	@Override
	public DataResult<List<CvExperiences>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<CvExperiences>>
		(this.cvExperiencesDao.getAllByCandidatesId(id));
	
	}

	@Override
	public DataResult<List<CvExperiences>> getAllByCandidatesIdOrderByFinishDateDesc(int id) {
		return new SuccessDataResult<List<CvExperiences>>
		(this.cvExperiencesDao.getAllByCandidatesIdOrderByFinishDateDesc(id));
	}

}
