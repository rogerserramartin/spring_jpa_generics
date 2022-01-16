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

@Configuration
@EnableJpaRepositories("com.roger.springjpa.repository") // IMPRESCINDIBLEEEEEEEEEEE!!!!!!
@EntityScan("com.roger.springjpa.entity") //IMPRESCINDIBLE!!!!!!!!! los 3 PARA QUE FUNCIONE AUTOWIRED SIN CONTROLADOR REST
@ComponentScan("com.roger.springjpa.service") //ESTE TAMBIEN

@EnableTransactionManagement
@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}




}
