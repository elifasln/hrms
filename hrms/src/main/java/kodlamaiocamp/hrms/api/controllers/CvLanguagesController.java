package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CvLanguagesService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvLanguages;

@RestController
@RequestMapping("/api/cvLanguages")

public class CvLanguagesController {

	private CvLanguagesService cvLanguagesService;

	public CvLanguagesController(CvLanguagesService cvLanguagesService) {
		super();
		this.cvLanguagesService = cvLanguagesService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvLanguages cvLanguages) {
		return this.cvLanguagesService.add(cvLanguages);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.cvLanguagesService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvLanguages cvLanguages) {
		return this.cvLanguagesService.update(cvLanguages);
	}

	@GetMapping("/getAll")
	public DataResult<List<CvLanguages>> getAll() {
		return this.cvLanguagesService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<CvLanguages> getById(@RequestParam int id) {
		return this.cvLanguagesService.getById(id);
}
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<CvLanguages>> getAllByCandidatesId(@RequestParam int id) {
		return this.cvLanguagesService.getAllByCandidatesId(id);
	}
	

}
