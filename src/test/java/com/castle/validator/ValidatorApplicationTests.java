package com.castle.validator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidatorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void exampleFailure() {
		assertEquals(1, 2);
	}

	@Test
	void exampleSuccess() {
		assertEquals(1, 1);
	}
}
