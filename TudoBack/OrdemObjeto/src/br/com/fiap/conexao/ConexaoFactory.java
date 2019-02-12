package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

	public Connection conectar()throws Exception{
		return DriverManager.getConnection
			("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", 
			"RM77777", "123456");
		
	}
}
