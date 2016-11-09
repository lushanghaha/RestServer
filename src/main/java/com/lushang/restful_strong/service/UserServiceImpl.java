package com.lushang.restful_strong.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

// import org.springframework.stereotype.Service;

import com.lushang.restful_strong.model.User;

// @Service("userService")
// @Transactional
public class UserServiceImpl implements UserService{

	private static final AtomicLong counter = new AtomicLong();
	private static List<User> users;
	
	static {
        users = populateDummyUsers();
    }
	
	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAllUsers() {
		return users;
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUserExist(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private static List<User> populateDummyUsers() {
		// 這樣物件才真的被新增出來，才有 isEmpty() 的能力
		List<User> users = new ArrayList<User>();
		
        users.add(new User(counter.incrementAndGet(), "Sam", 30, 70000));
        users.add(new User(counter.incrementAndGet(), "Tom", 40, 50000));
        users.add(new User(counter.incrementAndGet(), "Jerome", 45, 30000));
        users.add(new User(counter.incrementAndGet(), "Silvia", 50, 40000));
        
        return users;
	}
}