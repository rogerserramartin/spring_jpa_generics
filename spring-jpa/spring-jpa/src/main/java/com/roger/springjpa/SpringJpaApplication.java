package com.roger.springjpa;

import com.roger.springjpa.entity.Merchandise;
import com.roger.springjpa.service.MerchandiseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;
import java.util.List;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
		prueba();
	}

	private static void prueba() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ObjectInputFilter.Config.class);
		MerchandiseService merchandiseService = context.getBean(MerchandiseService.class);

		Merchandise merchandise1 = Merchandise.builder()
				.brand("Emporium Armony")
				.price(99d)
				.build();

		Merchandise merchandise2 = Merchandise.builder()
				.brand("Rams 32")
				.price(23.56)
				.build();

		merchandiseService.saveMerchandise(merchandise1);
		merchandiseService.saveMerchandise(merchandise2);


		List<Merchandise> merchandising = merchandiseService.getAllMerchandising();
		merchandising.forEach((merchandise) -> System.out.println("Marca: " + merchandise.getBrand()));

	}

}
