package com.info;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.info.dao.UserRepository;
import com.info.model.User;
import com.info.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopOnlineApplicationTests {

//	@Test
//	public void contextLoads() {
//	}
	@Autowired
	private UserService service;
	
	@MockBean
	private UserRepository repository;
	@Test
	public void userListTest()
	{
	   when(repository.findAll()).thenReturn(Stream.of(new User(1,"sathish","kumar","sathi@123.com","sathi123","USER"),new User(1,"raju","kumar","raju@123.com","raju123","USER")).collect(Collectors.toList()));
	   assertEquals(2,service.findAllUser().size());
	}
//	@Test
//	public void findByEmailTest()
//	{
//		//User user=new User(1,"raju","kumar","vamshi@gmail.com","raju123","USER");
//		String email="vamshi@gmail.com";
//		when(repository.findByEmail(email)).thenReturn(Stream.of(new User(1,"sathish","kumar","sathi@123.com","sathi123","USER")).collect(Collectors.toList()));
//		   assertEquals(1,service.findByEmail(email).size());
//	}
//	@Test
//	public void addUserTest()
//	{
//		User user=new User(1,"raju","kumar","raju@123.com","raju123","USER");
//		when(repository.save(user)).thenReturn(user);
//		assertEquals(user,service.save(user));
//	}
//	@Test
//	public void deleteUserTest() {
//		User user =new User(1,"raju","kumar","raju@123.com","raju123","USER");
//		service.deleteUser(1);
//		verify(repository,times(1)).delete(user);
//	}
	

}
