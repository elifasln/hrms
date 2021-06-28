package kodlamaiocamp.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import javax.swing.plaf.multi.MultiInternalFrameUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.Url;


import kodlamaiocamp.hrms.business.abstracts.CvImagesService;
import kodlamaiocamp.hrms.core.utilities.imageUpload.ImageUploadService;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvImagesDao;
import kodlamaiocamp.hrms.entities.concretes.CvImages;

import kodlamaiocamp.hrms.entities.concretes.Candidates;;

@Service
public class CvImagesManager implements CvImagesService {
	
	private CvImagesDao cvImagesDao;
	private ImageUploadService imageUploadService;

	@Autowired
	public CvImagesManager(CvImagesDao cvImagesDao, ImageUploadService imageUploadService) {
		super();
		this.cvImagesDao = cvImagesDao;
		this.imageUploadService=imageUploadService;
	}

	@Override
	public Result add(CvImages cvImages, MultipartFile imageFile) {
		Map<String, String> uploadImage=this.imageUploadService.uploadImageFile(imageFile).getData();
		cvImages.setUrl(uploadImage.get("url"));
		this.cvImagesDao.save(cvImages); 
		return new SuccessResult("fotoğraf eklendi");
	}

	@Override
	public Result delete(int id) {
		this.cvImagesDao.deleteById(id);
		return new SuccessResult("fotoğraf silindi");
	}

	@Override
	public Result update(CvImages cvImages) {
		this.cvImagesDao.save(cvImages); 
		return new SuccessResult("fotoğraf güncellendi");
	}

	@Override
	public DataResult<CvImages> getById(int id) {
		return new SuccessDataResult<CvImages>
		(this.cvImagesDao.getById(id));
	}

	@Override
	public DataResult<List<CvImages>> getAll() {
		return new SuccessDataResult<List<CvImages>>
		(this.cvImagesDao.findAll(),"fotoğraflar listelendi");
		
	}

	@Override
	public DataResult<CvImages> getAllByCandidatesId(int id) {
		return new SuccessDataResult<CvImages>
		(this.cvImagesDao.getAllByCandidatesId(id));
	}

	

}
