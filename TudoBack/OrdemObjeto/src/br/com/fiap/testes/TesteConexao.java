package br.com.fiap.testes;

import java.sql.Connection;

import br.com.fiap.conexao.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) {
		
		Connection c = null;
		try{
			c = new ConexaoFactory().conectar();
			System.out.println("Abriu....");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				c.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
