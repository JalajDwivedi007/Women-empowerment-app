package com.lti.WomenEmpowerment.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.WomenEmpowerment.model.User;
import com.lti.WomenEmpowerment.repo.UserRepository;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

class UserControllerTest {
	@Autowired
	UserRepository userRepo;
	@Test
	@Transactional
	void testGetUser() {
//		fail("Not yet implemented");
		User u = new User();
		u.setUsername("jalaj007432");
		
		Long  id=(long) 74;
		
		Optional<User> user = userRepo.findById(id);
		User u1 = user.get();
		
		assertEquals(u.getUsername(),u1.getUsername());
	}

	@Test
	@Transactional
	void testLogin() {
//		fail("Not yet implemented");
		User u = new User();
		u.setUsername("jalaj007");
		u.setPassword("Jalaj@123");
		
		List<User> ls = userRepo.findAll();
		for(User user:ls) {
			if(user.getUsername().equals(u.getUsername())) {
				assertEquals(user.getPassword(),u.getPassword());
			}
		}
	}

	@Test
	@Transactional
	void testForgotPass() {
//		fail("Not yet implemented");
		User u = new User();
		u.setUsername("jalaj007");
		u.setPassword("Jalaj@12345");
		
		List<User> ls = userRepo.findAll();
		for(User user:ls) {
			if(user.getUsername().equals(u.getUsername())) {
				user.setPassword(u.getPassword());
				user.setConfirmpassword(u.getPassword());
				userRepo.save(user);
			}
		}
		
		for(User user:ls) {
			if(user.getUsername().equals(u.getUsername())) {
				assertEquals(user.getPassword(),u.getPassword());
			}
		}
		
		
	}
//	@Test
//	@Transactional
//	void testAddUser() {
////		fail("Not yet implemented");
//		User u = new User();
//		u.setUsername("jalajD007");
//		u.setPassword("Jalaj@12345");
//		u.setConfirmpassword("Jalaj@12345");
//		u.setDob("2001-05-05");
//		u.setEmail("aj@gmail.com");
//		u.setUser_type("trainee");
//		Long mobile = (long) 678766543;
//		u.setMobile(mobile);
////		u.setId((long) 123);
//		
//		userRepo.save(u);
//		
//		Long id = (long)123;
//		
//		Optional<User> u2 = userRepo.findById(id);
//		User u3 = u2.get();
//		
//		assertEquals(u3.getUsername(),u.getUsername());
//		
//		
//	}

}
