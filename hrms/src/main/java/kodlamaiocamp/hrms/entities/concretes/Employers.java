package kodlamaiocamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employers{
	
	@Column(name="id")
	private int id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_adress")
	private String web_adress;
	
	@Column(name="phone_number")
	private String phone_number;
	
	public Employers(int id, String company_name, String web_adress, String phone_number) {
		
		this.id = id;
		this.company_name = company_name;
		this.web_adress = web_adress;
		this.phone_number = phone_number;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getWeb_adress() {
		return web_adress;
	}
	public void setWeb_adress(String web_adress) {
		this.web_adress = web_adress;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	

}
