package kodlamaiocamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employees")
@EqualsAndHashCode(callSuper = false)
public class Employees extends User{
		
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;	
	
}