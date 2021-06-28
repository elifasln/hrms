package kodlamaiocamp.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaiocamp.hrms.entities.concretes.JobAdverts;

public interface JobAdvertsDao extends JpaRepository<JobAdverts, Integer> {
	
	@Query("From JobAdverts j where j.isActive='true'")
	List<JobAdverts> findAll();
	//sistemdeki tüm iş ilanlarını listeleme


	List<JobAdverts> findAllSortedByIsActive(Sort sort, Boolean isActive);	
	//Sistemdeki tüm aktif iş ilanlarını tarihe göre listeleme
	
	@Query("From JobAdverts j where j.isActive='true' AND employer_id=:id")
	List<JobAdverts> getAllByEmployerId(int id);
	//Sistemdeki firmaya ait tüm aktif iş ilanlarını listeleme
	
	JobAdverts getById(int id);	

}