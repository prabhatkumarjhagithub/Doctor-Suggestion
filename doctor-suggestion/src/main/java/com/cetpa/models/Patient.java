package com.cetpa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Patient 
{
	@Id
	@GeneratedValue
	private int pid;
	@NotNull(message = "Name is required")
	@Size(min = 3,max=15,message = "Name length should be between 3 and 15")
	private String name;
	@NotNull(message = "City is required")
	@Size(max=20,message = "City should not be more than 20 characters long")
	private String city;
	@NotNull(message = "Email is required")
	@Email(message = "Email is invalid")
	private String email;
	@NotNull(message = "Phone is required")
	@Size(min=10,max=10,message ="Phone number must have 10 digits")
	@Pattern(regexp = "[0-9]*",message ="Phone number must have 10 digits")
	private String phone;
	@NotNull(message = "Symptom is required")
	@Pattern(regexp = "Arthritis|Backpain|Tissue injuries|Dysmenorrhea|Skin infection|Skin burn|Ear pain",message = "Not a valid symptom")
	private String symptom;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSymptom() {
		return symptom;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	
}
