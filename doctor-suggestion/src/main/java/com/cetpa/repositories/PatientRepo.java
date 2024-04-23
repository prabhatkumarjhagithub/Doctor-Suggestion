package com.cetpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.models.Patient;

public interface PatientRepo extends JpaRepository<Patient,Integer>
{
}
