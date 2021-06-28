package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CvSkillsService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvSkillsDao;
import kodlamaiocamp.hrms.entities.concretes.CvLink;
import kodlamaiocamp.hrms.entities.concretes.CvSkills;

@Service
public class CvSkillsManager implements CvSkillsService {
	
	private CvSkillsDao cvSkillsDao;

	public CvSkillsManager(CvSkillsDao cvSkillsDao) {
		super();
		this.cvSkillsDao = cvSkillsDao;
	}

	@Override
	public Result add(CvSkills cvSkills) {
		this.cvSkillsDao.save(cvSkills); 
		return new SuccessResult("beceri  eklendi");
	}

	@Override
	public Result delete(int id) {
		this.cvSkillsDao.deleteById(id);
		return new SuccessResult("beceri  silindi");
		
	}

	@Override
	public Result update(CvSkills cvSkills) {
		this.cvSkillsDao.save(cvSkills); 
		return new SuccessResult("beceri  güncellendi");
	}

	@Override
	public DataResult<CvSkills> getById(int id) {
		return new SuccessDataResult<CvSkills>
		(this.cvSkillsDao.getById(id));
	}

	@Override
	public DataResult<List<CvSkills>> getAll() {
		return new SuccessDataResult<List<CvSkills>>
		(this.cvSkillsDao.findAll(),"linkler listelendi");
	}

	@Override
	public DataResult<List<CvSkills>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<CvSkills>>
		(this.cvSkillsDao.getAllByCandidatesId(id));
	}

	
}
