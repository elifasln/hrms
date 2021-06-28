package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CvCoverLettersService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvCoverLetters;

@RestController
@RequestMapping("/api/cvCoverLetters")

public class CvCoverLettersController {
	
	private CvCoverLettersService cvCoverLettersService;

	public CvCoverLettersController(CvCoverLettersService cvCoverLettersService) {
		super();
		this.cvCoverLettersService = cvCoverLettersService;
	}


	@PostMapping("/add")
	public Result add(@RequestBody CvCoverLetters cvCoverLetters) {
		return this.cvCoverLettersService.add(cvCoverLetters);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.cvCoverLettersService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvCoverLetters cvCoverLetters) {
		return this.cvCoverLettersService.update(cvCoverLetters);
	}

	@GetMapping("/getAll")
	public DataResult<List<CvCoverLetters>> getAll() {
		return this.cvCoverLettersService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<CvCoverLetters> getById(@RequestParam int id) {
		return this.cvCoverLettersService.getById(id);
}
}