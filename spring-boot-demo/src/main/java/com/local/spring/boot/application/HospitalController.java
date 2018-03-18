package com.local.spring.boot.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class HospitalController {
	@Autowired
	private HospitalService hospitalService;

	@RequestMapping(value = "hospitals/{id}", method = RequestMethod.GET)
	public @ResponseBody Hospital getHospital(@PathVariable("id") int id)  {		 
		return this.hospitalService.getHospital(id);
	}

	@RequestMapping(value="hospitals/", method = RequestMethod.GET)
	public @ResponseBody List<Hospital> getAllHospitals() {
		return this.hospitalService.getAllHospitals();
	}

	@RequestMapping(value="hospitals/",method = RequestMethod.POST)
	public ResponseEntity<String>  addHospitals(@RequestBody Hospital hospital) {
		this.hospitalService.addHospitals(hospital);
		return ResponseEntity.ok().body("Hospital Added Successfuly");
	}

	@RequestMapping(value="hospitals/",method = RequestMethod.PUT)
	public ResponseEntity<String>  updateHospitals(@RequestBody Hospital hospital) {
		this.hospitalService.updateHospitals(hospital);
		return ResponseEntity.ok().body("Hospital Updated Successfuly");
	}

	@RequestMapping(value="hospitals/",method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteHospitals(@RequestBody Hospital hospital){
		this.hospitalService.deleteHospitals(hospital);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
