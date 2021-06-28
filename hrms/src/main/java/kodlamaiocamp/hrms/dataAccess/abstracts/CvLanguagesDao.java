package kodlamaiocamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.CvLanguages;

public interface CvLanguagesDao extends JpaRepository<CvLanguages, Integer> {
	
	CvLanguages getById(int id);
		
	List<CvLanguages> getAllByCandidatesId(int id);


}
