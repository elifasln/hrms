package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CvLinkService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvLanguages;
import kodlamaiocamp.hrms.entities.concretes.CvLink;

@RestController
@RequestMapping("/api/cvLink")

public class CvLinkController {

	private CvLinkService cvLinkService;
	
	@PostMapping("/add")
	public Result add(@RequestBody CvLink cvLink) {
		return this.cvLinkService.add(cvLink);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.cvLinkService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvLink cvLink) {
		return this.cvLinkService.update(cvLink);
	}

	@GetMapping("/getAll")
	public DataResult<List<CvLink>> getAll() {
		return this.cvLinkService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<CvLink> getById(@RequestParam int id) {
		return this.cvLinkService.getById(id);
}
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<CvLink>> getAllByCandidatesId(@RequestParam int id) {
		return this.cvLinkService.getAllByCandidatesId(id);
	}
	

}
