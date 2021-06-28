package kodlamaiocamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cv_experiences")
@EqualsAndHashCode(callSuper = false)


public class CvExperiences extends User {
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="title")
	private String title;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="finish_date")
	private LocalDate finishDate;
	
	@ManyToOne()
	@JoinColumn(name="candidates_id")
	private Candidates candidates;
	

}
