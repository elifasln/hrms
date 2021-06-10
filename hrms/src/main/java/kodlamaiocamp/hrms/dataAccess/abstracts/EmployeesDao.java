package kodlamaiocamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaiocamp.hrms.entities.concretes.Employees;

public interface EmployeesDao extends JpaRepository<Employees, Integer>{
	
	Employees getById(int id);

}
