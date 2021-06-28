package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CvExperiencesService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvExperiences;
import kodlamaiocamp.hrms.entities.concretes.CvSchools;

@RestController
@RequestMapping("/api/cvExperiences")

public class CvExperincesController {
	
	private CvExperiencesService cvExperiencesService;

	public CvExperincesController(CvExperiencesService cvExperiencesService) {
		super();
		this.cvExperiencesService = cvExperiencesService;
	}
	

	@PostMapping("/add")
	public Result add(@RequestBody CvExperiences cvExperiences) {
		return this.cvExperiencesService.add(cvExperiences);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.cvExperiencesService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvExperiences cvExperiences) {
		return this.cvExperiencesService.update(cvExperiences);
	}

	@GetMapping("/getAll")
	public DataResult<List<CvExperiences>> getAll() {
		return this.cvExperiencesService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<CvExperiences> getById(@RequestParam int id) {
		return this.cvExperiencesService.getById(id);

	}


	@GetMapping("/getAllByCandidatesIdOrderByFinishDateDesc")
	public DataResult<List<CvExperiences>> getAllByCandidatesIdOrderByFinishDateDesc(@RequestParam int id) {
		return this.cvExperiencesService.getAllByCandidatesIdOrderByFinishDateDesc(id);
	}

	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<CvExperiences>> getAllByCandidatesId(@RequestParam int id) {
		return this.cvExperiencesService.getAllByCandidatesId(id);
	}
	


}
