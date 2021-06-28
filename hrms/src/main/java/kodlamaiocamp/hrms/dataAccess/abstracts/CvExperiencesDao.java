package kodlamaiocamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.CvExperiences;

public interface CvExperiencesDao extends JpaRepository<CvExperiences, Integer> {
	
	CvExperiences getById(int id);
	
	List<CvExperiences> getAllByCandidatesIdOrderByFinishDateDesc(int id);
	
	List<CvExperiences> getAllByCandidatesId(int id);


}
