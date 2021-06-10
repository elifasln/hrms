package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.CityService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CityDao;
import kodlamaiocamp.hrms.entities.concretes.Cities;

@Service
public class CityManager implements CityService {
	
	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao=cityDao;
		
	}


//	@Override
//	public Result add(Cities cities) {
//		this.cityDao.save(cities);
//		return new SuccessResult("şehirler eklendi");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.cityDao.deleteById(id);
//		return new SuccessResult("şehirler silindi");
//	}
//
//	@Override
//	public Result update(Cities cities) {
//		this.cityDao.save(cities)
//		return new SuccessResult("şehirler güncellendi");
//}

	@Override
	public DataResult<Cities> getById(int id) {
		return new SuccessDataResult<Cities>
		(this.cityDao.getById(id));
	}

	@Override
	public DataResult<List<Cities>> getAll() {
		return new SuccessDataResult<List<Cities>>
		(this.cityDao.findAll(),"şehirler listelendi");
	}	

}
