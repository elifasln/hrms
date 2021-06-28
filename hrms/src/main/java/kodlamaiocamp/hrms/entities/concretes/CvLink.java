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
@Table(name="cv_links")
@EqualsAndHashCode(callSuper = false)

public class CvLink extends User {
	
	@Column(name="link_name")
	private String linkName;
	
	@Column(name="url")
	private String url;
	

	
	@ManyToOne()
	@JoinColumn(name="candidates_id")
	private Candidates candidates;

}
