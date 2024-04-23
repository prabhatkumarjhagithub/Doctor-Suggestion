package com.cetpa.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.models.Doctor;
import com.cetpa.services.DoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController 
{
	@Autowired private DoctorService service;
	
	@PostMapping("/create")
	public ResponseEntity<Doctor> createResource(  @RequestBody Doctor d)
	{
		System.out.println("Create resource method called...");
		Doctor dd=service.saveDoctor(d);
	    return ResponseEntity.status(HttpStatus.CREATED).body(dd);
	}
	@GetMapping("details/{did}")
	public ResponseEntity<Doctor> getDoctor(@PathVariable int did)
	{
		Doctor d=service.getDoctor(did);
		return ResponseEntity.ok(d);
	}
	@DeleteMapping("delete/{did}")
	public ResponseEntity<Doctor> deleteDoctor(@PathVariable int did)
	{
		Doctor d=service.getDoctor(did);
		service.deleteDoctor(did);
		return ResponseEntity.ok(d);
	}
}
