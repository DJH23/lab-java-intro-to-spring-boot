package com.example.demo.Repositories;

import com.example.demo.Classes.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
