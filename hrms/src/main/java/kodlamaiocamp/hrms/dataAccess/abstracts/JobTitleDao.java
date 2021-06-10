package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
	
	Boolean existsByTitle(String title);
	
	JobTitle findByTitle(String title);
	
	JobTitle getById(int id);
}
