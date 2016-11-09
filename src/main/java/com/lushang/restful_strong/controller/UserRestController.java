package com.lushang.restful_strong.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lushang.restful_strong.model.User;
import com.lushang.restful_strong.service.UserService;
import com.lushang.restful_strong.service.UserServiceImpl;

@RestController
public class UserRestController {
	
	// @Autowired
	// UserService userService;
	// 沒辦法中的沒辦法，還不懂得 Autowired
    UserService userService = new UserServiceImpl();
	
	// 處理所有 hello/名稱，秀頁面打招呼
    @RequestMapping(value = "/hello/{name}")
	public void hello (@PathVariable("name") String name) {
		System.out.println("Hello " + name);
	}
	
	// 取得所有 user
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<User>> listAllUsers () {
		List<User> users = userService.findAllUsers();
		if (users.isEmpty()) {
			return new ResponseEntity<List<User>>(users, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}