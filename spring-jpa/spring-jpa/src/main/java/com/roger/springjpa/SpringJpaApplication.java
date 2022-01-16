package com.roger.springjpa;

import com.roger.springjpa.entity.Merchandise;
import com.roger.springjpa.repository.MerchandiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.ObjectInputFilter;
import java.util.List;

//@Configuration
//@EnableJpaRepositories("com.roger.springjpa.repository") // Si nos pasaramos la arquitectura de springboot por el forro tocaria hacer esto de abajo
//@EntityScan("com.roger.springjpa.entity")
//@ComponentScan("com.roger.springjpa.service")

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}




}
