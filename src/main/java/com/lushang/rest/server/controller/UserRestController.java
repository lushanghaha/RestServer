package com.lushang.rest.server.controller;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lushang.rest.server.model.User;
import com.lushang.rest.server.service.UserService;
import com.lushang.rest.server.service.UserServiceImpl;

@RestController
public class UserRestController {

	// @Autowired
	// UserService userService;
	// 這支範例程式使用了 Autowired，但我還不了解，先不用
    UserService userService = new UserServiceImpl();

	// 處理所有 hello/[名稱]，產生 Hello [名稱] 的頁面
    @RequestMapping(value = "/hello/{name}")
	public void hello (@PathVariable("name") String name) {
		System.out.println("Hello " + name);
	}

	// 取得所有 user
	@RequestMapping(value = "/users", method = RequestMethod.GET, headers = "Accept=application/json")
	// 決定 ResponseEntity 裡面是放什麼檔案類型，在此是放一個 User 的 List
	public ResponseEntity<List<User>> listAllUsers () {
		List<User> users = userService.findAllUsers();
		if (users.isEmpty()) {
			// 在 new 一個 ResponseEntity 時可以指定 HttpStatus，此範例為 204 NO CONTENT，因為 user 是空的
			return new ResponseEntity<List<User>>(users, HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

}