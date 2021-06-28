package kodlamaiocamp.hrms.core.utilities.imageUpload;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.entities.concretes.CvImages;
import kodlamaiocamp.hrms.entities.concretes.CvLanguages;

public interface ImageUploadService {
	

	DataResult<Map> uploadImageFile(MultipartFile imageFile);

	DataResult<List<CvImages>> getAll();

	Result update(CvImages cvImages);

	Result delete(int id);

	Result add(CvImages cvImages);

	DataResult<CvImages> getById(int id);

	DataResult<List<CvImages>> getAllByCandidatesId(int id);
}
