package kodlamaiocamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.google.common.net.MediaType;

import kodlamaiocamp.hrms.business.abstracts.CandidatesService;
import kodlamaiocamp.hrms.business.abstracts.CvLanguagesService;
import kodlamaiocamp.hrms.core.utilities.imageUpload.ImageUploadService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.Candidates;
import kodlamaiocamp.hrms.entities.concretes.CvImages;
import kodlamaiocamp.hrms.entities.concretes.CvLanguages;

@RestController
@RequestMapping("/api/cvImages")

public class CvImagesController {
	
	private ImageUploadService imageUploadService;
	private CandidatesService candidatesService;

	@Autowired
	public CvImagesController(ImageUploadService imageUploadService,CandidatesService candidatesService) {
		super();
		this.imageUploadService=imageUploadService;
		this.candidatesService=candidatesService;
	}
	@PostMapping(value="/add")
	public Result add(@RequestParam(value="id") int id,
			@RequestParam(value="imageFile") MultipartFile imageFile) {
		Candidates candidates=this.candidatesService.getById(id).getData();
		CvImages cvImages=new CvImages();
		cvImages.setCandidates(candidates);
		return this.imageUploadService.add(cvImages);
	}
	@PostMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.imageUploadService.delete(id);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CvImages cvImages) {
		return this.imageUploadService.update(cvImages);
	}

	@GetMapping("/getAll")
	public DataResult<List<CvImages>> getAll() {
		return this.imageUploadService.getAll();
	}

	@GetMapping("/getbyid")
	public DataResult<CvImages> getById(@RequestParam int id) {
		return this.imageUploadService.getById(id);
}
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<CvImages>> getAllByCandidatesId(@RequestParam int id) {
		return this.imageUploadService.getAllByCandidatesId(id);
	}
	
}
