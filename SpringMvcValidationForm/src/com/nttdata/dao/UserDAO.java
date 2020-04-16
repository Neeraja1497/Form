package com.nttdata.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.nttdata.model.User;

@Repository
public class UserDAO {
private static List<User> list = null;
	static{
		list = new ArrayList<User>();
		list.add(new User("Neeraja", 11, "neeru@gmail.com","neeru1365"));
	
	}
	public List<User> getUserList() {
		return list;
	}
	public void addUser(User user) {
		list.add(user);
	}
}
