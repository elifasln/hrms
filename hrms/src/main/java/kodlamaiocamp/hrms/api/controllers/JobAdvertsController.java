package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.JobAdvertsService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.JobAdverts;

@RestController
@RequestMapping("/api/jobAdverts")

public class JobAdvertsController {

	private JobAdvertsService jobAdvertsService;

	public JobAdvertsController(JobAdvertsService jobAdvertsService) {
		super();
		this.jobAdvertsService = jobAdvertsService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAdverts jobAdverts) {
		return this.jobAdvertsService.add(jobAdverts);
	}

	@GetMapping("/getAll")
	public DataResult<List<JobAdverts>> getAll() {
		return this.jobAdvertsService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<JobAdverts> getById(@RequestParam int id) {
		return this.jobAdvertsService.getById(id);

	}

	@PostMapping("/changeOpenToClose")
	public Result changeOpenToClose(@RequestParam int id) {
		return this.jobAdvertsService.changeOpenToClose(id);
	}

	@GetMapping("/getAllOpenJobAdvertsList")
	public DataResult<List<JobAdverts>> getAllOpenJobAdvertsList() {
		return this.jobAdvertsService.getAllOpenJobAdvertsList();
	}

	@GetMapping("/findAllSortedByIsActive")
	public DataResult<List<JobAdverts>> findAllSortedByIsActive() {
		return this.jobAdvertsService.findAllSortedByIsActive();
	}

	@GetMapping("/getAllOpenJobAdvertsByEmployer")
	public DataResult<List<JobAdverts>> getAllOpenJobAdvertsByEmployer(@RequestParam int id) {
		return this.jobAdvertsService.getAllOpenJobAdvertsByEmployer(id);
	}
	
}
