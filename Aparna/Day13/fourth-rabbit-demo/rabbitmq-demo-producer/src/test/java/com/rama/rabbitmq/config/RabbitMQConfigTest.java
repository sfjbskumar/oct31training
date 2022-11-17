package com.rama.rabbitmq.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

@RunWith(MockitoJUnitRunner.class)
@ActiveProfiles(value = "test")
public class RabbitMQConfigTest {
	@InjectMocks
	RabbitMQConfig rabbitMQConfig;

	@Test
	public void rabbitTemplateTest() {
		ConnectionFactory connectionFactory= Mockito.mock(ConnectionFactory.class);
		MessageConverter messageConverter= Mockito.mock(MessageConverter.class);
		AmqpTemplate rabbitTemplate=rabbitMQConfig.rabbitTemplate(connectionFactory);
	}
}