package kodlamaiocamp.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_adverts")
public class JobAdverts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	//@Column(name="employer_id")
	//private int employerId;
	
	//@Column(name="job_title_id")
	//private int jobTitleId;
	
	//@Column(name="city_id")
	//private int cityId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="open_position_count")
	private int openPositionCount;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="deadline")
	private LocalDate deadline;
	
	@Column(name="created_at")
	private LocalDate createdAt;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employers employers;	
	
	@ManyToOne
	@JoinColumn(name="jobTitle_id")
	private JobTitle jobTitle;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private Cities cities;

}