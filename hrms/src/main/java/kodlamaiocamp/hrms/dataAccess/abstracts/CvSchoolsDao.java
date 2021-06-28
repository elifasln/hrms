package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.domain.Sort;


import kodlamaiocamp.hrms.entities.concretes.CvSchools;

public interface CvSchoolsDao extends JpaRepository<CvSchools, Integer> {

	CvSchools getById(int id);
	
	List<CvSchools> getAllByCandidatesIdOrderByFinishDateDesc(int id);
	
	List<CvSchools> getAllByCandidatesId(int id);

}
