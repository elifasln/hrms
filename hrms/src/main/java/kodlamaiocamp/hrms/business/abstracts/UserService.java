package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.User;

public interface UserService {
	
	Result add(User user);
	
	//Result delete(int id);
	
	//Result update(User user);
	
	DataResult<List<User>> getAll();
	
	//DataResult<User> getById(int id);
	
	DataResult<User> getByEmail(String email);
	
	Boolean existsByEmail(String email);

}