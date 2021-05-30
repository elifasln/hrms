package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.EmployersService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Employers;
@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	
		
		@Autowired
		private EmployersService employersService;

		@Autowired
		public EmployersController(EmployersService employersService) {
			super();
			this.employersService = employersService;
		}
		
		@GetMapping("/getall")
		public DataResult<List<Employers>> getAll(){
			return this.employersService.getAll();
			
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody Employers employers) {
			return this.employersService.add(employers);
			
		}
	}



