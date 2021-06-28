package kodlamaiocamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.CvLink;

public interface CvLinkDao extends JpaRepository<CvLink, Integer> {

	CvLink getById(int id);
	
	List<CvLink> getAllByCandidatesId(int id);

}
