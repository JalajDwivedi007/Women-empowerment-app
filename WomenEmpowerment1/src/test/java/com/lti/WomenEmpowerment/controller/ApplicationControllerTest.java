package com.lti.WomenEmpowerment.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.WomenEmpowerment.model.Application;
import com.lti.WomenEmpowerment.repo.ApplicationRepo;
@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationControllerTest {
	@Autowired
	ApplicationRepo appRepo;
	@Test
	@Transactional
	void testCreateApplication() {
//		fail("Not yet implemented");
		Application a1 = new Application();
		a1.setApplicationtype("hostel");
		
		Optional<Application> a = appRepo.findById((long)34);
		Application a2 = a.get();
		
		assertEquals(a2.getApplicationtype(),a1.getApplicationtype());
		
	}

	@Test
	void testChangeStatus() {
//		fail("Not yet implemented");
		Application a = new Application();
		a.setStatus("pending");
		Optional<Application> a1 = appRepo.findById((long)34);
		Application a2 = a1.get();
		a2.setStatus("pending");
		
		assertEquals(a.getStatus(),a2.getStatus());
	}

}
