package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CvLanguagesService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvLanguagesDao;
import kodlamaiocamp.hrms.entities.concretes.CvLanguages;


@Service
public class CvLanguagesManager implements CvLanguagesService {
	
	private CvLanguagesDao cvLanguagesDao;

	public CvLanguagesManager(CvLanguagesDao cvLanguagesDao) {
		super();
		this.cvLanguagesDao = cvLanguagesDao;
	}

	@Override
	public Result add(CvLanguages cvLanguages) {
		this.cvLanguagesDao.save(cvLanguages); 
		return new SuccessResult("yabancı dil eklendi");
	}

	@Override
	public Result delete(int id) {
		this.cvLanguagesDao.deleteById(id);
		return new SuccessResult("yabancı dil silindi");
	}

	@Override
	public Result update(CvLanguages cvLanguages) {
		this.cvLanguagesDao.save(cvLanguages); 
		return new SuccessResult("yabancı dil güncellendi");
	}

	@Override
	public DataResult<CvLanguages> getById(int id) {

		return new SuccessDataResult<CvLanguages>
		(this.cvLanguagesDao.getById(id));
	}

	@Override
	public DataResult<List<CvLanguages>> getAll() {
		return new SuccessDataResult<List<CvLanguages>>
		(this.cvLanguagesDao.findAll(),"yabancı diller listelendi");
		
	}

	@Override
	public DataResult<List<CvLanguages>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<CvLanguages>>
		(this.cvLanguagesDao.getAllByCandidatesId(id));
	}

}
