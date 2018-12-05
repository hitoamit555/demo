package com.example.demo;

import com.example.demo.controller.DemoController;
import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@InjectMocks
	DemoController demoController;

	@Test
	public void contextLoads() {
		System.out.println("Inside Junit contextLoads");
		Assert.assertEquals("Greetings from DemoController!",demoController.index());
	}

}
