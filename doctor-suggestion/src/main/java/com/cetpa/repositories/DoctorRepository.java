package com.cetpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cetpa.models.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> 
{
}
