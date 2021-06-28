package kodlamaiocamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="cv_cover_letters")
@EqualsAndHashCode(callSuper = false)
public class CvCoverLetters extends User {
	
	@Column(name="content")
	private String content;
	
	

	@ManyToOne()
	@JoinColumn(name="candidates_id")
	@JsonIgnore
	private Candidates candidates;

}
