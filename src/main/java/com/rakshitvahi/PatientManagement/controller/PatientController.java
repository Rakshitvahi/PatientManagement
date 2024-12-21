package com.rakshitvahi.PatientManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakshitvahi.PatientManagement.model.Patient;
import com.rakshitvahi.PatientManagement.service.PatientService;

@RestController
//@RequestMapping("/")
public class PatientController {

	@Autowired
	PatientService patientService;

	@GetMapping("/patient/all")
	private List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}

	@GetMapping("/patient/{id}")
	private Patient getPatient(@PathVariable("id") Long id) {
		return patientService.getPatientById(id);
	}

	@GetMapping("/patient/count")
	private Long getCount() {
		return patientService.getCount();
	}

	@DeleteMapping("/patient/{id}")
	private void deletePatient(@PathVariable("id") Long id) {
		patientService.delete(id);
	}

	@PostMapping("/patient")
	private Long saveBook(@RequestBody Patient patient) {
		patientService.saveOrUpdate(patient);
		return patient.getPatientId();
	}

	@PutMapping("/patient")
	private Patient update(@RequestBody Patient patient) {
		patientService.saveOrUpdate(patient);
		return patient;
	}

}
