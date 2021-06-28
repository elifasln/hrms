package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.CvCoverLetters;

public interface CvCoverLettersDao extends JpaRepository<CvCoverLetters,Integer> {
	
	CvCoverLetters getById(int id);


}
