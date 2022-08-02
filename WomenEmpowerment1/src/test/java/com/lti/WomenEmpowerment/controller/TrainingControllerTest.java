package com.lti.WomenEmpowerment.controller;

import static org.junit.Assert.*;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.WomenEmpowerment.model.Training;
import com.lti.WomenEmpowerment.repo.TrainingRepo;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrainingControllerTest {
	@Autowired
	TrainingRepo trainRepo;
	@Test
	@Transactional
	public void testCreateTraining() {
		Training t = new Training();
		t.setTitle("Agriculture");
		
		Optional<Training> t1 = trainRepo.findById((long) 3);
		Training t2 = t1.get();
		
		assertEquals(t2.getTitle(),t.getTitle());	
		}

//	@Test
//	public void testFetchAll() {
//		fail("Not yet implemented");
//	}

}