package com.example.demo;


import com.example.demo.PensionController;
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
import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(PensionController.class)
class PensionControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PensionService pensionService;

    @MockBean
    private PensionRepository pensionRepository;

    @Test
    @WithMockUser(roles = "ADMIN")
    void testCreateApplicant() throws Exception{
        PensionManagemetSys pension = new PensionManagemetSys();
        pension.setId(202);
        pension.setName("Navya");
        pension.setAge("22");
        pension.setBalanceamount(9000);
        pension.setPhone(123456789);
        pension.setEmpstatus("A");
        pension.setPensionstatus("N");
        pension.setPensionmmyy("0922");
        pension.setInstallment(980);
        String inputInJson = this.mapToJson(pension);
        String URI = "/create/applicant";
        Mockito.when(pensionService.save(Mockito.any(PensionManagemetSys.class))).thenReturn(pension);
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

        PensionManagemetSys pension = new PensionManagemetSys();
        //  pension.setId(201);
        pension.setBalanceamount(90000);

        String inputInJson = this.mapToJson(pension.getBalanceamount());

        String URI = "/checkbalance/201";

        Mockito.when(pensionService.checkBalance(201)).thenReturn(String.valueOf(pension.getBalanceamount()));
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

        PensionManagemetSys pension = new PensionManagemetSys();
        pension.setId(201);
        pension.setName("Navya");
        pension.setAge("22");
        pension.setBalanceamount(90000);
        pension.setPhone(123456789);
        pension.setEmpstatus("A");
        pension.setPensionstatus("N");
        pension.setPensionmmyy("0922");
        pension.setInstallment(980);


        String inputInJson = this.mapToJson(pension);

        String URI = "/checkapplication/201";

        Mockito.when(pensionService.getApplicantById(201)).thenReturn(pension);
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