package com.cetpa.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cetpa.models.Patient;
import com.cetpa.services.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController 
{
	@Autowired PatientService service;
	@PostMapping("/create")
	public ResponseEntity<Object> createResource(  @RequestBody Patient p)
	{
		Patient pp=service.savePatient(p);
	    return ResponseEntity.status(HttpStatus.CREATED).body(pp);
	}
}
