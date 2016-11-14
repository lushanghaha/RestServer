package com.lushang.rest.server.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.lushang.rest.server.model.User;

// @Service("userService")
// @Transactional
// 這支範例程式使用了 @Service 跟 @Transactional，但我還不了解，先不用
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
		// 每個物件都要經過 new 這道手續，才會真正的存在，才能真正 call 該物件的 method
		// 後面會用到 user.isEmpty()
		List<User> users = new ArrayList<User>();
		
		// 因為這支範例程式沒連資料庫，所以寫了 hard-coded 的資料
        users.add(new User(counter.incrementAndGet(), "Sam", 30, 70000));
        users.add(new User(counter.incrementAndGet(), "Tom", 40, 50000));
        users.add(new User(counter.incrementAndGet(), "Jerome", 45, 30000));
        users.add(new User(counter.incrementAndGet(), "Silvia", 50, 40000));
        
        return users;
	}
}