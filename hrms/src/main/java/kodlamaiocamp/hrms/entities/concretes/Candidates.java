package kodlamaiocamp.hrms.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidates")
@EqualsAndHashCode(callSuper = false)
public class Candidates extends User{
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_year")
	private LocalDate birthYear;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CvSchools> schools;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CvLink> links;

	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CvSkills> skills;

	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CvLanguages> languages;

	
	@JsonIgnore
	@OneToOne(mappedBy = "candidates", optional = false, fetch = FetchType.LAZY)
	private CvImages images;

	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CvExperiences> experiences;

	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CvCoverLetters> contents;

	
	


}