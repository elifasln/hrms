package kodlamaiocamp.hrms.entities.dtos;

import java.util.List;

import kodlamaiocamp.hrms.entities.concretes.Candidates;
import kodlamaiocamp.hrms.entities.concretes.CvCoverLetters;
import kodlamaiocamp.hrms.entities.concretes.CvExperiences;
import kodlamaiocamp.hrms.entities.concretes.CvImages;
import kodlamaiocamp.hrms.entities.concretes.CvLanguages;
import kodlamaiocamp.hrms.entities.concretes.CvLink;
import kodlamaiocamp.hrms.entities.concretes.CvSchools;
import kodlamaiocamp.hrms.entities.concretes.CvSkills;


public class CandidatesCvDto {
	
	private Candidates candidates;
	
	public List<CvSchools> schools;
	public List<CvSkills> skills;
	public List<CvLink> links;
	public List<CvLanguages> languages;
	public List<CvExperiences> experiences;
	public List<CvCoverLetters> contents;
	public CvImages images;



	

}
