package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.Candidates;

public interface CandidatesDao extends JpaRepository<Candidates,Integer>{
	
	Boolean existsByIdentityNumber(String identityNumber);
	
	Candidates findByIdentityNumber(String identityNumber);
	
	Candidates getById(int id);

}
