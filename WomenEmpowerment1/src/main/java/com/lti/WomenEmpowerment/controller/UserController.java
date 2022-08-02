package com.lti.WomenEmpowerment.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.WomenEmpowerment.model.User;
import com.lti.WomenEmpowerment.repo.UserRepository;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserRepository userrepository;
	
	@PostMapping("/womenempowerment/signup")
	public String addUser(@RequestBody User user) {
		List<User> ls = userrepository.findAll();
		
		Iterator<User> it = ls.iterator();
		for(User s:ls) {
				if(s.getEmail().equals(user.getEmail())){
				return "{\"status\" : \"Email already exists!\"}";
				}
				//Still pending
				System.out.println(s.getMobile());
				System.out.println(user.getMobile());
				if(s.getMobile().equals(user.getMobile())) {
				return "{\"status\" : \"Mobile number already exists!\"}";
				}
				if(user.getUsername().equals(s.getUsername())) {
				return "{\"status\" : \"The Username is already taken!\"}";
				}
			}
		userrepository.save(user);
		return "{\"status\" : \"User Record  Added Successfully!\"}";
	}
	@GetMapping("/womenempowerment/users")
	public List<User> listUsers(){
		List<User> ls = userrepository.findAll();
		return ls;
	}
	@GetMapping("/womenempowerment/user/{id}")
	public User getUser(@PathVariable Long id){
		Optional<User> ls = userrepository.findById(id);
		User u = ls.get();
		return u;
	}
	@PostMapping("/womenempowerment/login")
	public User login(@RequestBody User login) {
		List<User> ls = userrepository.findAll();
		Iterator<User> it = ls.iterator();
		for(User u:ls) {
			System.out.println(u.getUsername());
			System.out.println(u.getPassword());
			if(u.getUsername().equals(login.getUsername()) && u.getPassword().equals(login.getPassword())) {
				System.out.println("Inside if");
				return u;
			}
		}
		return null;
	}
	@PutMapping("/womenempowerment/forgotpassword")
	public User forgotPass(@RequestBody User user) {
		List<User> ls = userrepository.findAll();
//		Iterator<User> it = ls.iterator();
		
		for(User u:ls) {
			System.out.println(u.getUsername());
			System.out.println(u.getPassword());
			if(u.getUsername().equals(user.getUsername())) {
				u.setPassword(user.getPassword());
				u.setConfirmpassword(user.getConfirmpassword());
				userrepository.save(u);
				return u;
			}
		}
		return null;
	}
}


//Training
//Application - Validation -> Hostels,Training,Sukanya Yojna,NGO Grant,NGO Training
//Admin  get Request. ->Status
//clob
//NGO,Trainee = status getRequest =>Application


// Training - laveen,tanmay

