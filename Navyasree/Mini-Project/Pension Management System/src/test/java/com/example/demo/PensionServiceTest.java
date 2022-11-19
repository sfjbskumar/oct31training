package com.example.demo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.assertj.core.api.Assertions;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PensionServiceTest{

    @Autowired
    private PensionService pensionService;
    @MockBean
    private PensionRepository pensionRepository;


    @Test
    void testsave(){

        PensionManagemetSys p = new PensionManagemetSys();
        p.setId(201);
        p.setName("Navya");
        p.setAge("22");
        p.setBalanceamount(90000);
        p.setPhone(998877665);
        p.setEmpstatus("A");
        p.setPensionstatus("N");
        p.setPensionmmyy("0922");
        p.setInstallment(980);
        pensionRepository.save(p);
        Assertions.assertThat(p.getId()).isPositive();
        verify(pensionRepository, times(1)).save(any(PensionManagemetSys.class));
    }

    @Test
    void testGetStatus(){
        int id=201;
        PensionManagemetSys p = new PensionManagemetSys();
        p.setId(id);
        p.setName("jaydeep");
        p.setAge("21");
        p.setBalanceamount(80000);
        p.setPhone(998877665);
        p.setEmpstatus("A");
        p.setPensionstatus("N");
        p.setPensionmmyy("0922");
        p.setInstallment(1000);
        //pensionRepository.getBalance();
        when(pensionRepository.getEmpStatus(id)).thenReturn("A");
        assertEquals("A",pensionRepository.getEmpStatus(id));
        when(pensionRepository.getPensionStatus(id)).thenReturn("N");
        assertEquals("N",pensionRepository.getPensionStatus(id));
    }


    @Test
    void testGetBalance(){
        int id=201;
        PensionManagemetSys   pensionBuilder = new PensionManagemetSys();
        pensionBuilder.setId(id);
        pensionBuilder.setName("jaydeep");
        pensionBuilder.setAge("21");
        pensionBuilder.setBalanceamount(80000);
        pensionBuilder.setPhone(998877665);
        pensionBuilder.setEmpstatus("A");
        pensionBuilder.setPensionstatus("N");
        pensionBuilder.setPensionmmyy("0922");
        pensionBuilder.setInstallment(1000);

        PensionManagemetSys p = new PensionManagemetSys();
        when(pensionRepository.findById(id)).thenReturn(Optional.of(p));
        PensionManagemetSys pensioner = pensionService.getApplicantById(id);
        assertEquals(p.getId(), pensioner.getId());
        assertEquals(p.getName(), pensioner.getName());
        assertEquals(p.getAge(), pensioner.getAge());
        assertEquals(p.getBalanceamount(), pensioner.getBalanceamount());
        assertEquals(p.getPhone(), pensioner.getPhone());
        assertEquals(p.getEmpstatus(), pensioner.getEmpstatus());
        assertEquals(p.getPensionstatus(), pensioner.getPensionstatus());
        assertEquals(p.getPensionmmyy(), pensioner.getPensionmmyy());
        assertEquals(p.getInstallment(), pensioner.getInstallment());

    }
    @Test
    void testGetApplicantById(){
        int id=201;
        PensionManagemetSys   pensionBuilder = new PensionManagemetSys();
        pensionBuilder.setId(id);
        pensionBuilder.setName("Sivani");
        pensionBuilder.setAge("21");
        pensionBuilder.setBalanceamount(80000);
        pensionBuilder.setPhone(998877665);
        pensionBuilder.setEmpstatus("A");
        pensionBuilder.setPensionstatus("N");
        pensionBuilder.setPensionmmyy("0922");
        pensionBuilder.setInstallment(1000);

        PensionManagemetSys p = new PensionManagemetSys();
        when(pensionRepository.findById(id)).thenReturn(Optional.of(p));
        PensionManagemetSys pensioner = pensionService.getApplicantById(id);
        assertEquals(p.getId(), pensioner.getId());
        assertEquals(p.getName(), pensioner.getName());
        assertEquals(p.getAge(), pensioner.getAge());
        assertEquals(p.getBalanceamount(), pensioner.getBalanceamount());
        assertEquals(p.getPhone(), pensioner.getPhone());
        assertEquals(p.getEmpstatus(), pensioner.getEmpstatus());
        assertEquals(p.getPensionstatus(), pensioner.getPensionstatus());
        assertEquals(p.getPensionmmyy(), pensioner.getPensionmmyy());
        assertEquals(p.getInstallment(), pensioner.getInstallment());

    }

    @Test
    void testLoadPension(){
        pensionService.loadPension();
        verify(pensionRepository).loadPension(any(),any(),any(),any());
    }

    @Test
    void testIssuePension(){
        pensionService.issuePension();
        verify(pensionRepository).issuePension(any(),any(),any(),any());
    }


}
