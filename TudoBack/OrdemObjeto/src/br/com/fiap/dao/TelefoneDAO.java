package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Telefone;
import br.com.fiap.conexao.ConexaoFactory;

public class TelefoneDAO {
	private Connection con;
	public TelefoneDAO() throws Exception{
		con = new ConexaoFactory().conectar();
	}
	public void fechar() throws Exception{
		con.close();
	}
	public String inserir(Telefone tel, int numCliente)throws Exception{
		PreparedStatement estrutura = 
				con.prepareStatement("INSERT INTO TB_DDD_TELEFONE "
						+ "(NR_DDD, NR_TELEFONE, NM_OPERADORA, NR_CLIENTE) "
						+ "VALUES (?,?,?,?)");
		estrutura.setInt(1, tel.getDdd());
		estrutura.setString(2, tel.getNumero());
		estrutura.setString(3, tel.getOperadora());
		estrutura.setInt(4, numCliente);
		estrutura.execute();
		estrutura.close();
		return "Adicionado!!!";
	}
	
	public List<Telefone> consultarPorNumeroCliente(int numero)throws Exception{
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM TB_DDD_TELEFONE WHERE NR_CLIENTE = ?");
		stmt.setInt(1, numero);
		ResultSet rs = stmt.executeQuery();
		List<Telefone> lista = new ArrayList<>();
		while(rs.next()){
			lista.add(new Telefone
					(rs.getInt("NR_DDD"), 
					rs.getString("NR_TELEFONE"), 
					rs.getString("NM_OPERADORA")));
		}
		rs.close();
		stmt.close();
		return lista;
	}
	public List<Telefone> consultarPorOperadora(String operadora)throws Exception{
		PreparedStatement stmt = con.prepareStatement
				("SELECT * FROM TB_DDD_TELEFONE WHERE NM_OPERADORA = ?");
		stmt.setString(1, operadora + "%");
		ResultSet rs = stmt.executeQuery();
		List<Telefone> lista = new ArrayList<>();
		while(rs.next()){
			lista.add(new Telefone
					(rs.getInt("NR_DDD"), 
					rs.getString("NR_TELEFONE"), 
					rs.getString("NM_OPERADORA")));
		}
		rs.close();
		stmt.close();
		return lista;
	}
	public int excluirPorNumeroCliente(int numeroCliente)throws Exception{
		PreparedStatement stmt = con.prepareStatement
				("DELETE FROM TB_DDD_TELEFONE WHERE NR_CLIENTE=?");
		stmt.setInt(1, numeroCliente);
		int x = stmt.executeUpdate();
		stmt.close();
		return x;
	}
	public int excluirPorNumeroTelefone(String numeroTelefone)throws Exception{
		PreparedStatement stmt = con.prepareStatement
				("DELETE FROM TB_DDD_PRODUTO WHERE NR_TELEFONE=?");
		stmt.setString(1, numeroTelefone);
		int x = stmt.executeUpdate();
		stmt.close();
		return x;
	}

	public int alterarPorNumeroTelefone(Telefone obj)throws Exception{
		PreparedStatement stmt = con.prepareStatement
				("UPDATE TB_DDD_PRODUTO SET NM_OPERADORA=? WHERE NR_TELEFONE=?");
		stmt.setString(1, obj.getOperadora());
		stmt.setString(2, obj.getNumero());
		int x = stmt.executeUpdate();
		stmt.close();
		return x;
	}
	

}






