package com.cetpa.services;
import org.springframework.transaction.annotation.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.exception.RecordNotFoundException;
import com.cetpa.models.Doctor;
import com.cetpa.repositories.DoctorRepository;

@Service
public class DoctorService 
{
	@Autowired private DoctorRepository repo;
	@Transactional
	public Doctor saveDoctor(Doctor d) 
	{
		return repo.save(d);
	}
	public Doctor getDoctor(int did) 
	{
		return repo.findById(did).orElseThrow(()->new RecordNotFoundException("Doctor with id "+did+" not found"));
	}
	public void deleteDoctor(int did) 
	{
		repo.deleteById(did);
	}
}
