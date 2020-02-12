package com.desafio.magrathea.hashtag.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.desafio.magrathea.hastag.dominio.Hashtag;

@DisplayName("Teste De Criação de uma Hashtag")
public class HashtagTest {

	@Test
	@DisplayName("valida")
	void valida() {

		Hashtag hashtag = Hashtag.of("SomosMacacos");

		assertNotNull(hashtag);
		assertNotNull(hashtag.id());
		assertEquals("SomosMacacos", hashtag.nome());
	}

	@Test
	@DisplayName("invalida")
	void invalida() {
		assertThrows(IllegalArgumentException.class, () -> {
			Hashtag.of("Somos  Macacos");
		});
	}

}
