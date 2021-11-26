package com.qa.main.app;

import java.util.Collections;

import javax.swing.Spring;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.qa.main.app.actual.service.StudentActualService;
import com.qa.main.app.model.Student;

@RunWith(Spring.Runner.class)
@WebMvcTest
@SpringBootTest
class CaptainPenniesApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	Student saveStudent;
	
	@Test
	void contextLoads() throws Exception { 
		
		Mockito.when(StudentActualService.findAll()).thenReturn(
				Collections.emptyList()
				);
		
	MvcResult mvcResult =	mockMvc.perform(
				MockMvcRequestBuilders.get("/getAllStudents")
				.accept(MediaType.APPLICATION_JSON)
				).andReturn();
	System.out.println(mvcResult.getResponse());
	
	
	
	Mockito.verify(studentActualService).findAll();
	}
	}


