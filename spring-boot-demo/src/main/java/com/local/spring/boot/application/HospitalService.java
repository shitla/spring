package com.local.spring.boot.application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
	/*
	 * private List<Hospital> hospitalList = new ArrayList<>( Arrays.asList(new
	 * Hospital(1001, "Apollo Hospital", "Chennai", 3.8), new Hospital(1002,
	 * "Global Hospital", "Chennai", 3.5), new Hospital(1003, "VCare Hospital",
	 * "Bangalore", 3)));
	 */
	@Autowired
	HospitalRepository hospitalRepository;

	public List<Hospital> getAllHospitals() {

		return StreamSupport.stream(hospitalRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public Hospital getHospital(int id) {

		return hospitalRepository.findById(id).get(0);
	}

	public void addHospitals(Hospital hospital) {
		// hospitalRepository.save(new Hospital(hospital.getName(),
		// hospital.getCity(), hospital.getRating()));
		hospitalRepository.save(hospital);
	}

	public void updateHospitals(Hospital hospital) {
		// hospitalRepository.save(new
		// Hospital(hospital.getId(),hospital.getName(), hospital.getCity(),
		// hospital.getRating()));
		hospitalRepository.save(hospital);
	}

	public void deleteHospitals(Hospital hospital) {
		hospitalRepository.delete(hospital.getId());
	}
}
