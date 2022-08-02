package com.lti.WomenEmpowerment.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.WomenEmpowerment.model.hostel1;
import com.lti.WomenEmpowerment.repo.hostelRepo;
@RunWith(SpringRunner.class)
@SpringBootTest
class HostelControllerTest {
	@Autowired
	hostelRepo hrep;
	@Test
	@Transactional
	void testCreatehostel1() {
//		fail("Not yet implemented");
		hostel1 h = new hostel1();
		h.sethLocation("Bangalore");
		
		Optional<hostel1> h1 = hrep.findById((long) 33);
		hostel1 h2 = h1.get();
		
		assertEquals(h2.gethLocation(),h.gethLocation());
		
		
	}

}
