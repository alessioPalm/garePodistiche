package com.example.demo;

import com.example.demo.modello.Atleta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AtletaServiceTest {

	@Test
	void contextLoads() {
		AtletaService atletaService = new AtletaService();

		Assertions.assertEquals(0, atletaService.findAllAtleti().size());
		Assertions.assertNull(atletaService.findById(1));


		Atleta a = new Atleta (1, "alessio", "palmese");
		atletaService.inserimento(a);

		Assertions.assertEquals(1, atletaService.findAllAtleti().size());
		Assertions.assertNotNull(atletaService.findById(1));

	}

}
