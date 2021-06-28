package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CvLinkService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvLinkDao;
import kodlamaiocamp.hrms.entities.concretes.CvLink;

@Service

public class CvLinkManager implements CvLinkService {
	
	private CvLinkDao cvLinkDao;

	public CvLinkManager(CvLinkDao cvLinkDao) {
		super();
		this.cvLinkDao = cvLinkDao;
	}

	@Override
	public Result add(CvLink cvLink) {
		this.cvLinkDao.save(cvLink); 
		return new SuccessResult("link  eklendi");
	}

	@Override
	public Result delete(int id) {
		this.cvLinkDao.deleteById(id); 
		return new SuccessResult("link  silindi");
		
	}

	@Override
	public Result update(CvLink cvLink) {
		// TODO Auto-generated method stub
		this.cvLinkDao.save(cvLink); 
		return new SuccessResult("link  güncellendi");
	}

	@Override
	public DataResult<CvLink> getById(int id) {
		return new SuccessDataResult<CvLink>
		(this.cvLinkDao.getById(id));
	}

	@Override
	public DataResult<List<CvLink>> getAll() {
		return new SuccessDataResult<List<CvLink>>
		(this.cvLinkDao.findAll(),"linkler listelendi");
	}

	@Override
	public DataResult<List<CvLink>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<CvLink>>
		(this.cvLinkDao.getAllByCandidatesId(id));
	}
	

}
