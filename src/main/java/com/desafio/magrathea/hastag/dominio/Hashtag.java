package com.desafio.magrathea.hastag.dominio;

import java.util.regex.Pattern;

public class Hashtag {

	private final Integer id;
	private final String nome;
	private static final Pattern NOME_VALIDO = Pattern.compile("\\w+");
	
	private Hashtag(String nome) {
		this.id = 0;
		this.nome = nome;
	}
	
	public static Hashtag of(String nome) {
		if (valido(nome)) {
			return new Hashtag(nome);		
		}
		throw new IllegalArgumentException();
	}
		
	public static boolean valido(String nome) {
		return NOME_VALIDO.matcher(nome).matches();
	}
	
	public Integer id() {
		return id;
	}
	
	public String nome() {
		return nome;
	}
}
