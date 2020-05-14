package com.javatechnie.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger= LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads()
	{
		logger.info("Test Case Executing");
		logger.info("Test Case Executing Second log statement");
		logger.info("Test Case Executing Third log statement");
		logger.info("Test Case Executing Fourth log statement");
		logger.info("Test Case Executing Fifth log statement");
		logger.info("Test Case Executing Sixth log statement");
		assertEquals(true,true);
	}

}
