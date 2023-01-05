package com.sid.TestApp;

import com.sid.TestApp.Controller.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestAppApplicationTests {

	@Test
	void contextLoads() {
		Users users = new Users();
		users.setFirst_Name("Chadi");
		Assertions.assertEquals("Chadi", users.getFirst_Name());
	}

}
