package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import beans.Cliente;
import conexao.ConexaoFactory;

public class ClienteDAO {
	private Connection con;
	
	public ClienteDAO()throws Exception{
		con = new ConexaoFactory().connect();
	}
	
	public void fechar() throws Exception{
		con.close();
	}
	
	public String gravar(Cliente cli) throws Exception{
		PreparedStatement estrutura = con.prepareStatement
				("INSERT INTO TB_DDD_CLIENTE "
						+ "(NM_CLIENTE, NR_CLIENTE, QT_ESTRELAS) "
						+ "VALUES (?,?,?)");
		estrutura.setString(1, cli.getNome());
		estrutura.setInt(2, cli.getNumero());
		estrutura.setInt(3, cli.getQtdeEstrelas());
		int x = estrutura.executeUpdate();
		estrutura.close();
		return x + " cliente(s) foi(ram) armazenado(s)";
	}
}









