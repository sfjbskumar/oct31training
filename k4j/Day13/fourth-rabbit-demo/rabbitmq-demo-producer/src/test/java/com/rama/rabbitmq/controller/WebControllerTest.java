package com.rama.rabbitmq.controller;

import com.rama.rabbitmq.model.Employee;
import com.rama.rabbitmq.service.RabbitMQSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles(value = "test")
public class WebControllerTest {
  @InjectMocks
  WebController webController;

  @Mock
  RabbitMQSender rabbitMQSender;

  @Test
  public void producerTest() {

    doNothing().when(rabbitMQSender).send(any(Employee.class));
    String result=webController.producer("empname1","empid1");

  }
}
