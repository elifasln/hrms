package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {
	
	Employers getById(int id);

}
