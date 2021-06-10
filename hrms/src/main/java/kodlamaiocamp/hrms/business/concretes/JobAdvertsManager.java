package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.JobAdvertsService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.ErrorResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.JobAdvertsDao;
import kodlamaiocamp.hrms.entities.concretes.JobAdverts;

@Service
public class JobAdvertsManager implements JobAdvertsService {
	private JobAdvertsDao jobAdvertsDao;

	public JobAdvertsManager(JobAdvertsDao jobAdvertsDao) {
		super();
		this.jobAdvertsDao=jobAdvertsDao;
	}
	@Override
	public DataResult<List<JobAdverts>> getAll() {
		return new SuccessDataResult<List<JobAdverts>>
		(this.jobAdvertsDao.findAll(),"iş ilanları listelendi");	
		}

	@Override
	public Result add(JobAdverts jobAdverts) {
          this.jobAdvertsDao.save(jobAdverts);
          return new SuccessDataResult<JobAdverts>("iş ilanı eklendi");

	}

	@Override
	public Result delete(int id) {
		this.jobAdvertsDao.deleteById(id);
        return new SuccessDataResult<JobAdverts>("iş ilanı silindi");
	}

	@Override
	public Result update(JobAdverts jobAdverts) {
		this.jobAdvertsDao.save(jobAdverts);
        return new SuccessDataResult<JobAdverts>("iş ilanı güncellendi");
	}
	
	@Override
	public DataResult<List<JobAdverts>> getAllOpenJobAdvertsList() {
		return new SuccessDataResult<List<JobAdverts>>
		(this.jobAdvertsDao.findAll());	

	}

	@Override
	public DataResult<List<JobAdverts>> getAllOpenJobAdvertsByEmployer(int id) {
		return new SuccessDataResult<List<JobAdverts>>
		(this.jobAdvertsDao.getAllByEmployerId(id));
	}
	@Override
	public DataResult<JobAdverts> getById(int id) {
		return new SuccessDataResult<JobAdverts>
		(this.jobAdvertsDao.getById(id));
	}
	@Override
	public Result changeOpenToClose(int id) {
		if(getById(id)==null) {
			return new ErrorResult("Böyle bir iş ilanı yok");
		}
		if(getById(id).getData().isActive()==false) {
			return new ErrorResult("iş ilanı kapalı");
		}
		
			JobAdverts jobAdverts=getById(id).getData();
			jobAdverts.setActive(false);
			update(jobAdverts);
			return new SuccessDataResult<JobAdverts>("iş ilanı başarıyla kapatıldı");
			
		}
	
	@Override
	public DataResult<List<JobAdverts>> findAllSortedByIsActive() {
		
		Sort sort = Sort.by(Sort.Direction.DESC,"createdAt");
		return new SuccessDataResult<List<JobAdverts>>(this.jobAdvertsDao.findAllSortedByIsActive(sort,true));
	}
}