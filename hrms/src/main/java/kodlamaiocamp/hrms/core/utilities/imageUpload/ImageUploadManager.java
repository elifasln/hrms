package kodlamaiocamp.hrms.core.utilities.imageUpload;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.ErrorDataResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.entities.concretes.CvImages;


@Service
public class ImageUploadManager implements ImageUploadService {
	
	private Cloudinary cloudinary;
	

	public ImageUploadManager() {
		this.cloudinary=new Cloudinary(ObjectUtils.asMap
				("cloud_name","dayx2sam5","api_key","699443261618643",
						"api_secret","LaC_8aO4_p-vseLXfpOJGuC-sjI"));


	}


	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		
		try {
			
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
			
			
			
		
		
		return new ErrorDataResult<Map>();
	}


	@Override
	public DataResult<List<CvImages>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result update(CvImages cvImages) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Result add(CvImages cvImages) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<CvImages> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public DataResult<List<CvImages>> getAllByCandidatesId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
