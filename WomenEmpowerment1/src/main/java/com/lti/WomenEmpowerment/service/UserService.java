package com.lti.WomenEmpowerment.service;
import java.util.*;

import com.lti.WomenEmpowerment.model.User;

public interface UserService {
	public void add(User user);

	public User fetch(int id);

	public User verifyUser(User login);

//	public ResponseDTO confirmLogin(User login);

	public List<User> fetchEach();
}
