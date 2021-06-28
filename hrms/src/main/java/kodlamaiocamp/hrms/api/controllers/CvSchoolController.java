package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CvSchoolsService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvSchools;

@RestController
@RequestMapping("/api/cvSchools")

public class CvSchoolController {
	private CvSchoolsService cvSchoolsService;

	
	public CvSchoolController(CvSchoolsService cvSchoolsService) {
		super();
		this.cvSchoolsService = cvSchoolsService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody CvSchools cvSchools) {
		return this.cvSchoolsService.add(cvSchools);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.cvSchoolsService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvSchools cvSchools) {
		return this.cvSchoolsService.update(cvSchools);
	}

	@GetMapping("/getAll")
	public DataResult<List<CvSchools>> getAll() {
		return this.cvSchoolsService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<CvSchools> getById(@RequestParam int id) {
		return this.cvSchoolsService.getById(id);

	}


	@GetMapping("/getAllByCandidatesIdOrderByFinishDateDesc")
	public DataResult<List<CvSchools>> getAllByCandidatesIdOrderByFinishDateDesc(@RequestParam int id) {
		return this.cvSchoolsService.getAllByCandidatesIdOrderByFinishDateDesc(id);
	}

	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<CvSchools>> getAllByCandidatesId(@RequestParam int id) {
		return this.cvSchoolsService.getAllByCandidatesId(id);
	}
	

}
