package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.controller.HelloWorldController;

public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		HelloWorldController controller = new HelloWorldController();
		String sayHello = controller.sayHello();
		assertEquals(sayHello, "Hi there !!");
	}

}
