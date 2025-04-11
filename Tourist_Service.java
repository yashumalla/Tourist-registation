package com.springboot.TRA.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.springboot.TRA.Entity.Tourist;
import com.springboot.TRA.Repository.Tourist_Repository;


@Service
public class Tourist_Service {
	
	@Autowired
	private Tourist_Repository  tourRepo;
	
	// posting single data
	public Tourist savetourist(Tourist tourist) {
		return tourRepo.save(tourist);
	}
	
    //posting multiple data
	public List<Tourist> savetourists(List<Tourist> tourist){
		return tourRepo.saveAll(tourist);
	}
	
	
	//get all data
	public List<Tourist> gettourists(){
		return tourRepo.findAll(Sort.by(Sort.Direction.DESC,"firstName"));
		
	}//Sort.by(Sort.Direction.ASC,"marks")
	
	//get data by id
	public Tourist touristgetById(int id) {
		return tourRepo.findById(id).orElse(null);
	}
	
	//deleting data by id
	public String deletetourist(int id) {
		tourRepo.deleteById(id);
		return "student removed"+id;
	}
	//updating data
	public Tourist updatetourist(Tourist tourist) {
		Tourist existingtourist=tourRepo.findById(tourist.getId()).orElse(null);
		existingtourist.setFirstName(tourist.getFirstName());
		existingtourist.setLastName(tourist.getLastName());
		existingtourist.setFromPlace(tourist.getFromPlace());
		existingtourist.setGender(tourist.getGender());
		return tourRepo.save(tourist);
	}

}
