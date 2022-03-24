package com.lti.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.app.dao.AdminDAO;
import com.lti.app.pojo.Flight;
import com.lti.app.pojo.Passenger;
import com.lti.app.service.AdminService;

@SpringBootTest
class AirlineRestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	AdminService vService;
	
	@Test
	void testAddFlight()
	{
//		Admin p1=new Flight("1", "Vistara","mumbai", "chennai", "2022-03-26", "2022-03-26", "5000", "35000", 120, "15");
////			Fligth p1=new Flight(null, null, null, null, null, null, null, null, 0, null)
//		boolean res=vService.
//		assertEquals(true, res);
		com.lti.app.pojo.Admin a1  = new com.lti.app.pojo.Admin("1001", "Vistara","mumbai", "chennai", "2022-03-26", "2022-03-26", "5000", "35000", "120", "15");
				boolean res=vService.addFlight(a1);
				assertEquals(true, res);
	}
	
	@Test
	void testSearchFlight()
	{
		
//		Flight f1=new Flight("1", "Vistara","mumbai", "chennai", "2022-03-26", "2022-03-26", "5000", "35000", 120, "15");
//		Flight obj=vService.findFlight(null);
		com.lti.app.pojo.Admin obj = vService.findFlight("1");
		assertEquals("Vistara", obj.getFlightName());
	}
	
	

}
