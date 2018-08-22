package com.first.attempt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.first.attempt.domain.First;
import com.first.attempt.service.FirstService;

public class SpingFirstAttemptApplicationTests {
	@Autowired
	FirstService firstService;

	public void contextLoads() {
		 First first = new First();
			first.setName("ha");
			first.setValue(1);
			firstService.insertByUser(first);
			
	}

}
