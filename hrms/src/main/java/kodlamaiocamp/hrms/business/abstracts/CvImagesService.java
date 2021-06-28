package kodlamaiocamp.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvImages;

public interface CvImagesService {
	
    Result add(CvImages cvImages, MultipartFile imageFile);
	
	Result delete(int id);
	
	Result update(CvImages cvImages);
	
	DataResult<CvImages> getById(int id);
	
	DataResult<List<CvImages>> getAll();
	
	DataResult<CvImages> getAllByCandidatesId(int id);


}
