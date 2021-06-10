package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	Boolean existsByEmail(String email);
	
	User getById(int id);
	
	User findByEmail(String email);

}