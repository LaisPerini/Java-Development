package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;
import br.com.fiap.conexao.ConexaoFactory;

public class ClienteDAO {
	private Connection con;
	
	public ClienteDAO()throws Exception{
		con = new ConexaoFactory().conectar();
	}
	
	public String fechar() throws Exception{
		con.close();
		return "Fechou!";
	}
	
	public String inserir(Cliente cli)throws Exception{
		PreparedStatement estrutura= null;
		estrutura = con.prepareStatement
				("INSERT INTO TB_DDD_CLIENTE "
				+ "(NR_CLIENTE,NM_CLIENTE,QT_ESTRELAS) "
				+ "VALUES (?,?,?)");
		estrutura.setInt(1, cli.getNumero());
		estrutura.setString(2, cli.getNome());
		estrutura.setInt(3, cli.getQtdeEstrelas());
		estrutura.execute();
		for(Telefone t : cli.getFones()){
			new TelefoneDAO().inserir(t, cli.getNumero());
		}
		estrutura.close();
		return "Cadastrado com sucesso!";
	}
	public Cliente getCliente(int numero) throws Exception{
		Cliente cli = new Cliente();
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement
				("SELECT * FROM TB_DDD_CLIENTE WHERE NR_CLIENTE=?");
		estrutura.setInt(1, numero);
		ResultSet resultado = estrutura.executeQuery();
		if(resultado.next()){
			cli.setNome(resultado.getString("NM_CLIENTE"));
			cli.setNumero(resultado.getInt("NR_CLIENTE"));
			cli.setQtdeEstrelas(resultado.getInt("QT_ESTRELAS"));

			//TELEFONE
			TelefoneDAO dao = new TelefoneDAO();
			cli.setFones(dao.consultarPorNumeroCliente(numero));
			dao.fechar();
		}
		resultado.close();
		estrutura.close();
		return cli;
	}
	
	public int excluirNome(String pNome)throws Exception{
		TelefoneDAO dao = new TelefoneDAO();
		PreparedStatement stmt = con.prepareStatement
				("SELECT * FROM TB_DDD_CLIENTE WHERE NM_CLIENTE LIKE ?");
		stmt.setString(1, pNome + "%");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			dao.excluirPorNumeroCliente(rs.getInt("NR_CLIENTE"));
		}
		dao.fechar();
		
		PreparedStatement estrutura = con.prepareStatement
			("DELETE FROM TB_DDD_CLIENTE WHERE NM_CLIENTE LIKE ?");
		estrutura.setString(1, pNome+"%");
		int x = estrutura.executeUpdate();
		
		estrutura.close();
		return x;
	}
	public String elevarNivel(int numero)throws Exception{
		PreparedStatement estrutura = 
				con.prepareStatement("UPDATE TB_DDD_CLIENTE SET QT_ESTRELAS=QT_ESTRELAS+1 WHERE NR_CLIENTE=?");
		estrutura.setInt(1, numero);
		int x = estrutura.executeUpdate();
		estrutura.close();
		return x + " linha(s) foi(ram) alterada(s)!";
	}
	
	public List<Cliente> getListarNivel(int estrelas)throws Exception{
		
		List<Cliente> lista = new ArrayList<>();
		Cliente objCliente = new Cliente();
		
		PreparedStatement estrutura = null;
		estrutura = con.prepareStatement
				("SELECT * FROM TB_DDD_CLIENTE WHERE QT_ESTRELAS=?");
		estrutura.setInt(1, estrelas);
		ResultSet resultado = estrutura.executeQuery();
		while(resultado.next()){
			objCliente = new Cliente();
			objCliente.setNome(resultado.getString("NM_CLIENTE"));
			objCliente.setNumero(resultado.getInt("NR_CLIENTE"));
			objCliente.setQtdeEstrelas(resultado.getInt("QT_ESTRELAS"));
			//INICIO DO CODIGO PELA ALTERAÇÃO DO TELEFONE
			TelefoneDAO dao = new TelefoneDAO();
			List<Telefone> listaFones = dao.consultarPorNumeroCliente
											(resultado.getInt("NR_CLIENTE"));
			dao.fechar();
			objCliente.setFones(listaFones);
			//FIM
			lista.add(objCliente);
			
		}
		resultado.close();
		estrutura.close();
		return lista;
		
	}
}


















