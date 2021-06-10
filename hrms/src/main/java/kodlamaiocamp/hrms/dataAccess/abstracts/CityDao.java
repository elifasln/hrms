package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.Cities;

public interface CityDao extends JpaRepository<Cities, Integer>{
	
	Cities getById(int id);

}