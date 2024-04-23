package com.cetpa.models;



//import org.springframework.lang

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Doctor 
{
	@Id
	//@GeneratedValue(generator = GenerationType.SEQUENCE)
	//@SequenceGenerator(name = "doc_seq",initialValue = 1111,allocationSize = 1)
	private int docid;
	@NotNull(message = "Name is required")
    //@Size
	private String name;
	@NotNull(message = "City is required")
     @Pattern(regexp = "Delhi|Noida|Faridabad",message = "City should be either Noida or Delhi or Faridabad")
	private String city;
	@NotNull(message = "Email is required")
	//@Email
	private String email;
	@NotNull(message = "Phoneis required")

	@Size(min = 10,message = "Phone number must have atleast 10 characters")
	private String phone;
	public Doctor(int docid, String name,
			@Pattern(regexp = "Delhi|Noida|Faridabad", message = "City should be either Noida or Delhi or Faridabad") String city,
			String email, @Size(min = 10, message = "Phone number must have atleast 10 characters") String phone,
			@Pattern(regexp = "Orthopedic|Gynecology|Dermatology|ENT", message = "Speciality can have 4 values i.e. Orthopedic, Gynecology, Dermatology, ENT") String speciality) {
		//super();
		this.docid = docid;
		this.name = name;
		this.city = city;
		this.email = email;
		this.phone = phone;
		this.speciality = speciality;
	}
	@NotNull(message = "Symptom is required")
     @Pattern(regexp = "Orthopedic|Gynecology|Dermatology|ENT",message = "Speciality can have 4 values i.e. Orthopedic, Gynecology, Dermatology, ENT")
	private String speciality;
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
}
