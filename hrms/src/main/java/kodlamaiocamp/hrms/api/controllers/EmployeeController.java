package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.EmployeeService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.entities.concretes.Employees;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employees>> getAll(){
		return this.employeeService.getAll();
		
	}
	
//	@PostMapping("/add")
	//public Result add(@RequestBody Employees employees) {
		//return this.employeeService.add(employees);
		
	}




