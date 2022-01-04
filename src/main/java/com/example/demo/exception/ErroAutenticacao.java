package com.example.demo.exception;

@SuppressWarnings("serial")
public class ErroAutenticacao extends RuntimeException{
	
	public ErroAutenticacao(String mensagem) {
		super(mensagem);
	}

}
