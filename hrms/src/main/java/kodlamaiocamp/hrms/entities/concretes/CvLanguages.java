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
@Table(name="cv_languages")
@EqualsAndHashCode(callSuper = false)

public class CvLanguages extends User {
	
	@Column(name="language_name")
	private String languageName;
	
	
	@Column(name="language_level")
	private int languageLevel;

	
	@ManyToOne()
	@JoinColumn(name="candidates_id")
	private Candidates candidates;
}
