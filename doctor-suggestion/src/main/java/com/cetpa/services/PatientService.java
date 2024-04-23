package com.cetpa.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cetpa.models.Patient;
import com.cetpa.repositories.PatientRepo;

@Service
public class PatientService 
{
	@Autowired PatientRepo repo;
	public Patient savePatient(Patient p)
	{
		return repo.save(p);
	}
}
