package com.rakshitvahi.PatientManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.rakshitvahi.PatientManagement.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
