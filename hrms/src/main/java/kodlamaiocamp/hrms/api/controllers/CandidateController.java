package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiocamp.hrms.business.abstracts.CandidatesService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Candidates;
import kodlamaiocamp.hrms.entities.dtos.CandidatesCvDto;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {
	
	@Autowired
	private CandidatesService candidatesService;

	@Autowired
	public CandidateController(CandidatesService candidatesService) {
		super();
		this.candidatesService = candidatesService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Candidates>> getAll(){
		return this.candidatesService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidates candidates) {
		return this.candidatesService.add(candidates);
		
	}
	@GetMapping("/getCandidatesCvById")
	public DataResult<CandidatesCvDto> getCandidatesCvById(@RequestParam int id){
		return this.candidatesService.getCandidatesCvById(id);
	}
}
