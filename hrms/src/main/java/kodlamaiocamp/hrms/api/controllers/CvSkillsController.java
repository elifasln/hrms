package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CvSkillsService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvSkills;

@RestController
@RequestMapping("/api/cvSkills")

public class CvSkillsController {

	private CvSkillsService cvSkillsService;

	public CvSkillsController(CvSkillsService cvSkillsService) {
		super();
		this.cvSkillsService = cvSkillsService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvSkills cvSkills) {
		return this.cvSkillsService.add(cvSkills);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.cvSkillsService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvSkills cvSkills) {
		return this.cvSkillsService.update(cvSkills);
	}

	@GetMapping("/getAll")
	public DataResult<List<CvSkills>> getAll() {
		return this.cvSkillsService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<CvSkills> getById(@RequestParam int id) {
		return this.cvSkillsService.getById(id);
}
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<CvSkills>> getAllByCandidatesId(@RequestParam int id) {
		return this.cvSkillsService.getAllByCandidatesId(id);
	}
}
