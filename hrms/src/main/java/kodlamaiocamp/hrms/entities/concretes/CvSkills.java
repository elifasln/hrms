package kodlamaiocamp.hrms.entities.concretes;

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
@Table(name="cv_skills")
@EqualsAndHashCode(callSuper = false)
public class CvSkills extends User {
	
	
	@Column(name="skill_name")
	private String skillName;
	
	
	
	@ManyToOne()
	@JoinColumn(name="candidates_id")
	private Candidates candidates;


}
