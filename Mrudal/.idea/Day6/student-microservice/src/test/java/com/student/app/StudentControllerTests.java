package com.student.app;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest({StudentController.class})
@ActiveProfiles(value = "test")
public class StudentControllerTests {
	@Autowired
	private MockMvc mockMvc;
	@Value("${student.get.url}")
	String geturl;

	@Value("${student.get.all.url}")
	String getallurl;

	@Value("${student.post.url}")
	String posturl;

	@Value("${student.put.url}")
	String puturl;

	@Value("${student.delete.url}")
	String deleteurl;

	@Test
	public void testStudentGet() throws Exception {
		ResultActions responseEntity  = mockMvc.perform(get(geturl).param("name","stud1"));
		responseEntity.andExpect(status().isOk());
		String result = responseEntity.andReturn().getResponse().getContentAsString();
		assertEquals("", result);
	}

	@Test
	public void testStudentWithValueGet() throws Exception {
		Student student=new Student("roll1","name1","std2");
		mockMvc.perform(post(posturl).contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));

		ResultActions responseEntity  = mockMvc.perform(get(geturl).param("name","name1"));
		responseEntity.andExpect(status().isOk());
		String result = responseEntity.andReturn().getResponse().getContentAsString();
		assertNotNull(result);
	}
	@Test
	public void testAllStudentGet() throws Exception {
		ResultActions responseEntity  = mockMvc.perform(get(getallurl));
		responseEntity.andExpect(status().isOk());
		String result = responseEntity.andReturn().getResponse().getContentAsString();
		assertNotNull(result);
	}


	@Test
	public void testSaveStudentPost() throws Exception {
		Student student=new Student("roll1","name1","std2");
		ResultActions responseEntity  = mockMvc.perform(post(posturl).contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));
		responseEntity.andExpect(status().isOk());

	}

	@Test
	public void testUpdateStudentPut() throws Exception {
		Student student=new Student("roll1","name1","std2");
		mockMvc.perform(post(posturl).contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));

		ResultActions responseEntity  = mockMvc.perform(put(puturl).param("name","name1")
				.param("std","std3"));
		responseEntity.andExpect(status().isOk());
		String result = responseEntity.andReturn().getResponse().getContentAsString();
		assertNotNull(result);

	}
	private ResultActions processApiRequest(String api, HttpMethod methodType, String name, Student student) {
		ResultActions response = null;
		try {
			switch (methodType) {
				case GET:
					response = mockMvc.perform(get(api).param("name",name));
					break;
				case POST:
					response = mockMvc.perform(post(api).contentType(MediaType.APPLICATION_JSON)
							.content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));
					break;
				case PUT:
					response = mockMvc.perform(put(api, name).contentType(MediaType.APPLICATION_JSON)
							.content(asJsonString(student)).param("name",name).accept(MediaType.APPLICATION_JSON));
					break;
				case DELETE:
					response = mockMvc.perform(delete(api, name).param("name",name));
					break;
				default:
					fail("Method Not supported");
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		return response;
	}

	private String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static Student createEmployee(String name, String roll, String std) {
		Student student = new Student(name, roll,std);
		return student;
	}

}
