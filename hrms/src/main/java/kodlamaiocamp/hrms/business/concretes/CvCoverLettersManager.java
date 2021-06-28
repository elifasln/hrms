package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CvCoverLettersService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvCoverLettersDao;
import kodlamaiocamp.hrms.entities.concretes.CvCoverLetters;

@Service

public class CvCoverLettersManager implements CvCoverLettersService {

	private CvCoverLettersDao cvCoverLettersDao;
	
	public CvCoverLettersManager(CvCoverLettersDao cvCoverLettersDao) {
		super();
		this.cvCoverLettersDao = cvCoverLettersDao;
	}

	@Override
	public Result add(CvCoverLetters cvCoverLetters) {
		this.cvCoverLettersDao.save(cvCoverLetters); 
		return new SuccessResult("ön yazı eklendi");		
	
	}

	@Override
	public Result delete(int id) {
		this.cvCoverLettersDao.deleteById(id); 
		return new SuccessResult("ön yazı silindi");	
	}

	@Override
	public Result update(CvCoverLetters cvCoverLetters) {
		this.cvCoverLettersDao.save(cvCoverLetters); 
		return new SuccessResult("ön yazı güncellendi");		
	}

	@Override
	public DataResult<CvCoverLetters> getById(int id) {

		return new SuccessDataResult<CvCoverLetters>
		(this.cvCoverLettersDao.getById(id));
	}

	@Override
	public DataResult<List<CvCoverLetters>> getAll() {		

		return new SuccessDataResult<List<CvCoverLetters>>
		(this.cvCoverLettersDao.findAll(),"ön yazılar listelendi");
		
	}

}
