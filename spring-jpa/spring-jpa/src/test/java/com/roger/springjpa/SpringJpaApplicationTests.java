package com.roger.springjpa;

import com.roger.springjpa.entity.Merchandise;
import com.roger.springjpa.repository.MerchandiseRepository;
import com.roger.springjpa.service.MerchandiseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class SpringJpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void prueba() {
		MerchandiseRepository merchandiseRepository = context
				.getBean(MerchandiseRepository.class);

		/*
		Merchandise finalFantasy = Merchandise.builder()
				.brand("Stranger of Paradise")
				.price(70d)
				.build();

		merchandiseRepository.save(finalFantasy);
		*/

		Merchandise forspoken = Merchandise.builder()
				.brand("Forspoken")
				.price(70d)
				.build();

		merchandiseRepository.save(forspoken);


	}

	@Test
	void pruebaBuena(){
		MerchandiseService merchandiseService = context
				.getBean(MerchandiseService.class);

		Merchandise bravely = Merchandise.builder()
				.brand("Bravely Default: Airy Lies")
				.price(39.99)
				.build();

		merchandiseService.saveMerchandise(bravely);

	}

}
