package com.example.pensionmanagment;

import com.example.pensionmanagment.Controller.Pension;
import com.example.pensionmanagment.Controller.PensionRepository;
import com.example.pensionmanagment.Controller.Pensioncontoller;
import com.example.pensionmanagment.Controller.PensionService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@WebMvcTest(Pensioncontoller.class)
public class PensionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PensionService pensionService;

    @MockBean
    private PensionRepository pensionRepository;

    @Test
    @WithMockUser(roles = "ADMIN")
    void testCreateApplicant() throws Exception{
        Pension pension = new Pension();
        pension.setId(200);
        pension.setName("lahari");
        pension.setAge(21);
        pension.setBalance(10000);
        pension.setMobile("9876455");
        pension.setEmpStatus("A");
        pension.setPensionStatus("N");
        pension.setPensionMMYY("0922");
        pension.setInstallment(980);

        String inputInJson = this.mapToJson(pension);

        String URI = "/create/applicant";

        Mockito.when(pensionService.save(Mockito.any(Pension.class))).thenReturn(pension);
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post(URI)
                .accept(MediaType.APPLICATION_JSON).content(inputInJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();

        String outputInJson = response.getContentAsString();

        assertThat(outputInJson).isEqualTo(inputInJson);
        assertEquals(HttpStatus.OK.value(), response.getStatus());

    }

    @Test
    @WithMockUser(roles = "USER")
    void testCheckBalance() throws Exception{

        Pension pension = new Pension();
        //  pension.setId(200);
        pension.setBalance(10000);

        String inputInJson = this.mapToJson(pension.getBalance());

        String URI = "/checkBalance/200";

        Mockito.when(pensionService.checkBalance(200)).thenReturn(String.valueOf(pension.getBalance()));
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI);


        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();

        String outputInJson = response.getContentAsString();

        assertThat(outputInJson).isEqualTo(inputInJson);
        assertEquals(HttpStatus.OK.value(), response.getStatus());

    }

    @Test
    @WithMockUser(roles = "USER")
    void testCheckApplicant() throws Exception{

        Pension pension = new Pension();
        pension.setId(200);
        pension.setName("lahari");
        pension.setAge(21);
        pension.setBalance(10000);
        pension.setMobile("9876455");
        pension.setEmpStatus("A");
        pension.setPensionStatus("N");
        pension.setPensionMMYY("0922");
        pension.setInstallment(980);


        String inputInJson = this.mapToJson(pension);

        String URI = "/checkApplication/200";

        Mockito.when(pensionService.getApplicantById(200)).thenReturn(pension);
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI);


        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();

        String outputInJson = response.getContentAsString();

        assertThat(outputInJson).isEqualTo(inputInJson);
        assertEquals(HttpStatus.OK.value(), response.getStatus());

    }




    /**
     * Maps an Object into a JSON String. Uses a Jackson ObjectMapper.
     */
    private String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }

}
