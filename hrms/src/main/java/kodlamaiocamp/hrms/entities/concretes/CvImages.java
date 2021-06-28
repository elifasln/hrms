package kodlamaiocamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cv_images")
@EqualsAndHashCode(callSuper = false)

public class CvImages extends User{
	
	@Column(name="url")
	private String url;
	
	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name="candidates_id")
	private Candidates candidates;

}
