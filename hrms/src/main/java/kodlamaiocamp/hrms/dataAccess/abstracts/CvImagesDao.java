package kodlamaiocamp.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.CvImages;

public interface CvImagesDao extends JpaRepository<CvImages, Integer> {

	CvImages getById(int id);
	
	CvImages getAllByCandidatesId(int id);

}
