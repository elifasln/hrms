package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.Candidates;


public interface CandidatesDao extends JpaRepository<Candidates,Integer>{

}
