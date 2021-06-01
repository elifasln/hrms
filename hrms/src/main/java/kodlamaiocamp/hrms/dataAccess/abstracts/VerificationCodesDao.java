package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.VerificationCodes;

public interface VerificationCodesDao extends JpaRepository<VerificationCodes, Integer> {

}
