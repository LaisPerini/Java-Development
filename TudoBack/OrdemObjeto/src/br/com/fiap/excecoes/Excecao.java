package br.com.fiap.excecoes;

import java.sql.SQLException;

public class Excecao extends Exception{

	public static String tratarExcecao(Exception e){
		if (e instanceof SQLException){
			return "Erro com o banco de dados";
		}else if (e instanceof NumberFormatException){
			return "Falha ao converter um número!";
		}else{
			return "Erro desconhecido";
		}
	}
}
