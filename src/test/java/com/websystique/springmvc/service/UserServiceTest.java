package com.websystique.springmvc.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class UserServiceTest {
	@Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work
	
	@Test
	public void testFindAllUsers() {
		Assert.assertNotNull(userService.findAllUsers());
	}
	
	@Test
	public void testFindById() {
		Assert.assertNotNull(userService.findById(1));
	}
}
