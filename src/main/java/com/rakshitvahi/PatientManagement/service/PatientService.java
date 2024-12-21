package com.rakshitvahi.PatientManagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakshitvahi.PatientManagement.model.Patient;
import com.rakshitvahi.PatientManagement.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	PatientRepository patientRepository;

	public List<Patient> getAllPatients() {
		List<Patient> patients = new ArrayList<>();
		patientRepository.findAll().forEach(patient -> patients.add(patient));
		return patients;
	}

	public Patient getPatientById(Long id) {
		return patientRepository.findById(id).get();
	}

	public void saveOrUpdate(Patient patient) {
		patientRepository.save(patient);
	}

	public void delete(Long id) {
		patientRepository.deleteById(id);
	}

	public void update(Patient patient, int patientId) {
		patientRepository.save(patient);
	}

	public Long getCount() {
		return patientRepository.count();
	}
}
