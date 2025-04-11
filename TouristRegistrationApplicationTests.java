package com.springboot.TRA;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.TRA.Entity.Tourist;
import com.springboot.TRA.Repository.Tourist_Repository;

@SpringBootTest
class TouristRegistrationApplicationTests {

	@Autowired
	private Tourist_Repository tourRepo;

	@Test
	public void savetouristtest() {
		
		Tourist tourist = new Tourist();
		tourist.setFirstName("max");
		tourist.setLastName("steve");
		tourist.setAge(23);
		tourist.setGender("female");
		tourist.setFromPlace("ind");
		tourist.setNumberOfDaysVisits(2);
		
		tourRepo.save(tourist);
		assertNotNull(tourRepo.findAll().get(0));
		
	}
	
	@Test
	public void  getdataalltest() {
		List<Tourist> listtour = tourRepo.findAll();
		assertThat(listtour).size().isGreaterThan(0);
	}
}
