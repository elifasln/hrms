package kodlamaiocamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiocamp.hrms.adapters.MerniceCandidatesCheckService;
import kodlamaiocamp.hrms.business.abstracts.CandidatesService;
import kodlamaiocamp.hrms.business.abstracts.CvCoverLettersService;
import kodlamaiocamp.hrms.business.abstracts.CvExperiencesService;
import kodlamaiocamp.hrms.business.abstracts.CvImagesService;
import kodlamaiocamp.hrms.business.abstracts.CvLanguagesService;
import kodlamaiocamp.hrms.business.abstracts.CvLinkService;
import kodlamaiocamp.hrms.business.abstracts.CvSchoolsService;
import kodlamaiocamp.hrms.business.abstracts.CvSkillsService;
import kodlamaiocamp.hrms.business.abstracts.UserService;
import kodlamaiocamp.hrms.core.utilities.mailCheck.MailValidationManager;
import kodlamaiocamp.hrms.core.utilities.results.DataResult;
import kodlamaiocamp.hrms.core.utilities.results.ErrorResult;
import kodlamaiocamp.hrms.core.utilities.results.Result;
import kodlamaiocamp.hrms.core.utilities.results.SuccessDataResult;
import kodlamaiocamp.hrms.core.utilities.results.SuccessResult;
import kodlamaiocamp.hrms.dataAccess.abstracts.CandidatesDao;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvCoverLettersDao;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvExperiencesDao;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvImagesDao;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvLanguagesDao;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvLinkDao;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvSchoolsDao;
import kodlamaiocamp.hrms.dataAccess.abstracts.CvSkillsDao;
import kodlamaiocamp.hrms.entities.concretes.Candidates;
import kodlamaiocamp.hrms.entities.dtos.CandidatesCvDto;

@Service
public class CandidatesManager implements CandidatesService {

	private CandidatesDao candidatesDao;
	private UserService userService;
	private MerniceCandidatesCheckService merniceCandidatesCheckService;	
	
	private CvCoverLettersService cvCoverLettersService;
	private CvExperiencesService cvExperiencesService;
	private CvImagesService cvImagesService;
	private CvLanguagesService cvLanguagesService;
	private CvLinkService cvLinkService;
	private CvSchoolsService cvSchoolsService;
	private CvSkillsService cvSkillsService;
	
	
	
	@Autowired
	public CandidatesManager(CandidatesDao candidatesDao,UserService userService,MerniceCandidatesCheckService merniceCandidatesCheckService,
			CvCoverLettersService cvCoverLettersService,CvExperiencesService cvExperiencesService, CvImagesService cvImagesService,
			CvLanguagesService cvLanguagesService,CvLinkService cvLinkService,CvSchoolsService cvSchoolsService,
			CvSkillsService cvSkillsService){
		super();
		this.candidatesDao = candidatesDao;
		this.userService=userService;
		this.merniceCandidatesCheckService=merniceCandidatesCheckService;	
		this.cvCoverLettersService=cvCoverLettersService;
		this.cvExperiencesService=cvExperiencesService;
		this.cvImagesService=cvImagesService;
		this.cvLanguagesService=cvLanguagesService;
		this.cvLinkService=cvLinkService;
		this.cvSchoolsService=cvSchoolsService;
		this.cvSkillsService=cvSkillsService;
		
	
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>
		(this.candidatesDao.findAll(),"iş arayanlar listelendi");
	}

	@Override
	public Result add(Candidates candidates) {
		this.candidatesDao.save(candidates); 
		return new SuccessResult("iş arayanlar eklendi");		
	}
	
	@Override
	public Boolean existsByIdentityNumber(String identityNumber) {
		if(this.candidatesDao.existsByIdentityNumber(identityNumber)) {
			return true;
		}
		return false;
	}

	@Override
	public DataResult<Candidates> getById(int id) {
		return new SuccessDataResult<Candidates>
		(this.candidatesDao.getById(id));
	}

	@Override
	public Result delete(int id) {
		this.candidatesDao.deleteById(id);
		return new SuccessResult("iş arayanlar silindi");
	}

	@Override
	public Result update(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("iş arayanlar güncellendi");		
	}

	@Override
	public DataResult<Candidates> getByIdentityNumber(String identityNumber) {
		return new SuccessDataResult<Candidates>
		(this.candidatesDao.findByIdentityNumber(identityNumber));
	}

	@Override
	public DataResult<CandidatesCvDto> getCandidatesCvById(int id) {
		Candidates candidates=this.candidatesDao.getById(id);
		CandidatesCvDto candidatesCvDto=new CandidatesCvDto();
		candidatesCvDto.contents=candidates.getContents();
		candidatesCvDto.experiences=candidates.getExperiences();
		candidatesCvDto.images=candidates.getImages();
		candidatesCvDto.languages=candidates.getLanguages();
		candidatesCvDto.links=candidates.getLinks();
		candidatesCvDto.schools=candidates.getSchools();
		candidatesCvDto.skills=candidates.getSkills();
		
		return new SuccessDataResult<CandidatesCvDto>(candidatesCvDto);

	}
	
	
}