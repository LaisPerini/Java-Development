package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexao.ConexaoFactory;

public class ProdutoDAO {
	private Connection con;
	
	public ProdutoDAO()throws Exception{
		con = new ConexaoFactory().conectar();
	}
	
	public String fechar() throws Exception{
		con.close();
		return "Fechou!";
	}
	
	public String gravar(Produto p)throws Exception{
		PreparedStatement estrutura=con.prepareStatement
				("INSERT INTO TB_DDD_PRODUTO (CD_PRODUTO, VL_PRODUTO, DS_PRODUTO, NM_CATEGORIA) "
						+ "VALUES (?,?,?,?)");
		estrutura.setInt(1, p.getCodigo());
		estrutura.setDouble(2, p.getValor());
		estrutura.setString(3, p.getDescricao());
		estrutura.setString(4, p.getCategoria());
		estrutura.execute();
		estrutura.close();
		return "Gravado com sucesso";
	}
	public Produto getProduto(int cod)throws Exception{
		Produto objeto = new Produto();
		PreparedStatement estrutura=con.prepareStatement
				("SELECT * FROM TB_DDD_PRODUTO WHERE CD_PRODUTO=?");
		estrutura.setInt(1, cod);
		ResultSet rs = estrutura.executeQuery();
		if (rs.next()){
			objeto.setCategoria(rs.getString("NM_CATEGORIA"));
			objeto.setDescricao(rs.getString("NM_PRODUTO"));
			objeto.setValor(rs.getDouble("VL_PRODUTO"));
			objeto.setCodigo(rs.getInt("CD_PRODUTO"));
		}
		rs.close();
		estrutura.close();
		return objeto;
	}
	public int excluirPorCodigo(int cod)throws Exception{
		PreparedStatement estrutura=con.prepareStatement
				("DELETE FROM TB_DDD_PRODUTO WHERE CD_PRODUTO=?");
		estrutura.setInt(1, cod);
		int x = estrutura.executeUpdate();
		estrutura.close();
		return x;
	}
	
	public int aumentar(double porc)throws Exception{
		PreparedStatement estrutura=con.prepareStatement
				("UPDATE TB_DDD_PRODUTO SET VL_PRODUTO = VL_PRODUTO * ?");
		estrutura.setDouble(1, 1+porc/100);
		int x = estrutura.executeUpdate();
		estrutura.close();
		return x;
		
	}
	
	public List<Produto> listarCategorias(String cat)throws Exception{
		List<Produto> lista =  new ArrayList<>();
		Produto objeto = new Produto();
		PreparedStatement estrutura=con.prepareStatement
				("SELECT * FROM TB_DDD_PRODUTO WHERE NM_CATEGORIA=?");
		estrutura.setString(1, cat);
		ResultSet rs = estrutura.executeQuery();
		while(rs.next()){
			objeto= new Produto();
			objeto.setCategoria(rs.getString("NM_CATEGORIA"));
			objeto.setDescricao(rs.getString("NM_PRODUTO"));
			objeto.setValor(rs.getDouble("VL_PRODUTO"));
			objeto.setCodigo(rs.getInt("CD_PRODUTO"));
			lista.add(objeto);
		}
		rs.close();
		estrutura.close();
		return lista;
	}
}







