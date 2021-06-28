package kodlamaiocamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.CvSkills;

public interface CvSkillsDao extends JpaRepository<CvSkills, Integer>{

	CvSkills getById(int id);
	
	List<CvSkills> getAllByCandidatesId(int id);
}
