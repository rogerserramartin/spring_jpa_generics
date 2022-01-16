package com.roger.springjpa;

import com.roger.springjpa.entity.Merchandise;
import com.roger.springjpa.repository.MerchandiseRepository;
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

		Merchandise finalFantasy = Merchandise.builder()
				.brand("Stranger of Paradise")
				.price(70d)
				.build();

		merchandiseRepository.save(finalFantasy);
		
	}

}
