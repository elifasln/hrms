package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.JobTitleService;
import kodlamaiocamp.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitlesController {
	
	@Autowired
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobTitleService.getAll();
		
		
		
	}

}
