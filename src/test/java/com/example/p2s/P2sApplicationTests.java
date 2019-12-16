package com.example.p2s;

import com.example.modules.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class P2sApplicationTests {

	@Resource
	private UserService userService;

	@Test
	void contextLoads() {
		userService.createUser();

	}

}
