package com.student.app;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.junit.Assert.assertEquals;
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

	@Value("${student.post.url}")
	String posturl;

	@Value("${student.put.url}")
	String puturl;

	@Value("${student.delete.url}")
	String deleteurl;

	@Test
	public void testStudentGet() throws Exception {
		ResultActions responseEntity  = mockMvc.perform(get(geturl).param("name","test"));
		responseEntity.andExpect(status().isOk());
		ObjectMapper mapper = new ObjectMapper();
		Student result = mapper.readValue(responseEntity.andReturn().getResponse().getContentAsString(),
				new TypeReference<Student>() {
				});
		assertEquals("test", result.getName());
		assertEquals("2nd", result.getStd());
		assertEquals("roll1", result.getRollNo());
	}

	@Test
	public void testStudentPost() throws Exception {
		Student student= createStudent("stud1","roll12","std1");
		ResultActions responseEntity  = mockMvc.perform(post(posturl).contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(student)).accept(MediaType.APPLICATION_JSON));
		responseEntity.andExpect(status().isOk());
		ObjectMapper mapper = new ObjectMapper();
		Student result = mapper.readValue(responseEntity.andReturn().getResponse().getContentAsString(),
				new TypeReference<Student>() {
				});
		assertEquals("stud1", result.getName());
		assertEquals("std1", result.getStd());
		assertEquals("roll12", result.getRollNo());
	}

	@Test
	public void testStudentupdate() throws Exception {
		Student student= createStudent("stud1","roll12","std1");
		ResultActions responseEntity  = mockMvc.perform(put(puturl)
				.param("name","stud1").param("std","3rd"));
		responseEntity.andExpect(status().isOk());
		ObjectMapper mapper = new ObjectMapper();
		Student result = mapper.readValue(responseEntity.andReturn().getResponse().getContentAsString(),
				new TypeReference<Student>() {
				});
		assertEquals("stud1", result.getName());
		assertEquals("3rd", result.getStd());
		assertEquals("roll1", result.getRollNo());
	}

	@Test
	public void testStudentDelete() throws Exception {
		ResultActions responseEntity  = mockMvc.perform(delete(deleteurl).param("name","test"));
		responseEntity.andExpect(status().isOk());
		ObjectMapper mapper = new ObjectMapper();
		String result=responseEntity.andReturn().getResponse().getContentAsString();

		assertEquals("test", result);

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

	private static Student createStudent(String name, String roll, String std) {
		Student student = new Student(roll,name,std);
		return student;
	}

}
