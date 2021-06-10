package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.business.abstracts.UserService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.UserDao;
import kodlamaiocamp.hrms.entities.concretes.User;
@Service
public class UserManager implements UserService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>
		(this.userDao.findAll(),"kullanıcılar listelendi");
	}
	
	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessDataResult<User>("işlem başarılı");
	}

	@Override
	public Boolean existsByEmail(String email) {
		return this.userDao.existsByEmail(email);
	}

//	@Override
//	public DataResult<User> getById(int id) {
//		return new SuccessDataResult<User>
//		(this.userDao.getById(id));
//	}

	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>
		(this.userDao.findByEmail(email));
	}

//	@Override
//	public Result delete(int id) {
//		this.userDao.deleteById(id);
//		return new SuccessDataResult<User>("kullanıcı silindi");
//	}
//
//	@Override
//	public Result update(User user) {
//		this.userDao.save(user);
//		return new SuccessDataResult<User>("kullanıcı güncellendi");
//	}

	
}
