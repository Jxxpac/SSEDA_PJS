package com.sseda.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;
import com.sseda.dto.Board;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration( locations= { "file:src/main/webapp/WEB-INF/spring/root-context.xml", 
									"file:src/main/webapp/WEB-INF/spring/appServlet/admin-context.xml"})
public class LoginTest {

	private static final Logger log = LoggerFactory.getLogger("LoginTest.class");
	
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc; 
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	
	
	@Test
	public void test() {
		
		
		
		try {
			String asdf = mockMvc.perform(MockMvcRequestBuilders.post("/login")
							.param("id", "asd").param("pw", "123123")).andReturn().getModelAndView().getViewName();
			log.info(asdf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
