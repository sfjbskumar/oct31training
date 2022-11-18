package com.mongo.app.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CreateControllerTest {
    @InjectMocks
    private CreateController createController;
    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void saveCustomerTest() {
        Customer mockCustomer = mock(Customer.class);
        Customer expectedCustomer = new Customer("customer1", "1", "test address");
        when(customerRepository.save(any(Customer.class))).thenReturn(expectedCustomer);
        Customer result = createController.saveCustomer(mockCustomer);
        Assert.assertEquals(result.getAddress(), expectedCustomer.getAddress());
        Assert.assertEquals(result.getName(), expectedCustomer.getName());
        Assert.assertEquals(result.getCustId(), expectedCustomer.getCustId());

    }

    @Test
    public void readCustomerTest() {
        List<Customer> customers= new ArrayList();
        Customer expectedCustomer = new Customer("customer1", "1", "test address");
        customers.add(expectedCustomer);
        when(customerRepository.findAll()).thenReturn(customers);
        List<Customer> result = createController.readCustomer();
        Assert.assertEquals(result.get(0).getAddress(), expectedCustomer.getAddress());
        Assert.assertEquals(result.get(0).getName(), expectedCustomer.getName());
        Assert.assertEquals(result.get(0).getCustId(), expectedCustomer.getCustId());

    }

    @Test
    public void modifyByIDTest() {
        Customer expectedCustomer = new Customer("customer1", "1", "test address");
        when(customerRepository.findByName(anyString())).thenReturn(expectedCustomer);
        createController.modifyByID("custid1","custname");
        verify(customerRepository, times(1)).save(expectedCustomer);
    }

    @Test
    public void deleteyByIDTest() {
        String customername= "custname";
        createController.deleteByID(customername);
        verify(customerRepository, times(1)).deleteByname(customername);
    }
}
