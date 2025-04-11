package com.springboot.TRA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springboot.TRA.Entity.Tourist;
import com.springboot.TRA.Services.Tourist_Service;

@RestController
@RequestMapping("/tourist")
public class TouristController {
	
	@Autowired
	private Tourist_Service tourservice;
	
	@PostMapping("/addtourist")
	public Tourist addtourist(@RequestBody Tourist tourist) {
	
		/*tourist.setFirstname("yashu");
		tourist.setAge(23);
		tourist.setFromPlace("akp");
		tourist.setGender("male");
		tourist.setLastname("malla");
		tourist.setNumberOfDaysVisits(2);*/
		return tourservice.savetourist(tourist);
	}
	
       /*public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newcitizen ) {
		
		Citizen citizen =repo.save(newcitizen);
		return new ResponseEntity<>(citizen,HttpStatus.OK);
	}*/
	@PostMapping("/adtourists")
	public ResponseEntity<Tourist> addtourists(@RequestBody Tourist newtourist){
		Tourist tourist = tourservice.savetourist(newtourist);
		return new ResponseEntity<>(tourist,HttpStatus.OK);
	}
	
	@PostMapping("/addtouristss")
	public List<Tourist> addtourists(@RequestBody List<Tourist> tourist){
		return tourservice.savetourists(tourist);
	}
	
	@GetMapping("/gettourist")
	public List<Tourist> findalltourits() {
		return tourservice.gettourists();
	}
	
	@GetMapping("/id/{id}")
	public Tourist findtouristByid(@PathVariable int id) {
		return tourservice.touristgetById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletetourist(@PathVariable int id) {
		return tourservice.deletetourist(id);
	}
	@PutMapping("/updatetourist")
	public Tourist updatetourist(@RequestBody Tourist tourist) {
		return tourservice.updatetourist(tourist);
	}

}
