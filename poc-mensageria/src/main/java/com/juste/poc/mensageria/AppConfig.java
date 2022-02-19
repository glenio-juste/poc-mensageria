package com.juste.poc.mensageria;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@SpringBootApplication
@ComponentScan(basePackageClasses = {Consumer.class})
@EnableJms
public class AppConfig {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppConfig.class, args);
	}

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("queue");
	}
}
