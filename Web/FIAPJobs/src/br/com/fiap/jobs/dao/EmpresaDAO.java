package br.com.fiap.jobs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.jobs.bean.Empresa;

public class EmpresaDAO {

	public void inserir(Empresa empresa) throws SQLException {

		Connection conn = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtInsert = conn
					.prepareStatement("INSERT INTO jobs_empresa(id, nome, local, numero_funcionarios, porte) VALUES (SEQ_EMPRESA.nextval, ?, ?, ?, ? )");

			stmtInsert.setString(1, empresa.getNome());
			stmtInsert.setString(2, empresa.getLocal());
			stmtInsert.setInt(3, empresa.getNumeroFuncionarios());
			stmtInsert.setString(4, empresa.getPorte());
			stmtInsert.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(
					"Erro ao conectar ou manipular o banco de dados!", e);
		} finally {

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new SQLException(
							"Erro ao fechar a conexao com o banco de dados!", e);
				}
			}

		}
//		.prepareStatement("INSERT INTO jobs_empresa(id, cargo, data_anuncio, descricao, quantidade, salario, titulo, empresa_id) VALUES (SQ_ALUNO.nextval, ?, ?, ?, ?, ?, ?, ?, ? )");
	}
	
	public ArrayList<Empresa> listarTodos() throws SQLException {

		ArrayList<Empresa> listaEmpresa = new ArrayList<Empresa>();
		Connection conn = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtSelect = conn.prepareStatement("SELECT * FROM JOBS_EMPRESA ORDER BY NOME");
			
			ResultSet rs = stmtSelect.executeQuery();
			
			while (rs.next()) {

				Empresa	empresa = new Empresa();
				
				empresa.setId(rs.getInt("id"));
				empresa.setLocal(rs.getString("local"));
				empresa.setNome(rs.getString("nome"));
				empresa.setNumeroFuncionarios(rs.getInt("numero_funcionarios"));
				empresa.setPorte(rs.getString("porte"));
				
				listaEmpresa.add(empresa);
			}
			

		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new SQLException("Erro ao conectar ou manipular o banco de dados!", e);
			
		} finally {

			if (conn != null) {
				try {
					
					conn.close();
										
				} catch (SQLException e) {
					
					e.printStackTrace();
					throw new SQLException("Erro ao fechar a conexao com o banco de dados!", e);
				}
			}
		}	
	
		return listaEmpresa;
		
	}
	
	public Empresa buscarPorId(int id) throws SQLException {

		Connection conn = null;
		Empresa	empresa = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtSelect = conn.prepareStatement("SELECT * FROM JOBS_EMPRESA WHERE ID = ?");
			stmtSelect.setInt(1, id);
			
			ResultSet rs = stmtSelect.executeQuery();
			
			if (rs.next()) {

				empresa = new Empresa();
				
				empresa.setId(rs.getInt("id"));
				empresa.setLocal(rs.getString("local"));
				empresa.setNome(rs.getString("nome"));
				empresa.setNumeroFuncionarios(rs.getInt("numero_funcionarios"));
				empresa.setPorte(rs.getString("porte"));
				
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new SQLException("Erro ao conectar ou manipular o banco de dados!", e);
			
		} finally {

			if (conn != null) {
				try {
					
					conn.close();
										
				} catch (SQLException e) {
					
					e.printStackTrace();
					throw new SQLException("Erro ao fechar a conexao com o banco de dados!", e);
				}
			}
		}	
	
		return empresa;
		
	}
	
	public void alterar(Empresa empresa) throws SQLException {

		Connection conn = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtInsert = conn
					.prepareStatement("UPDATE jobs_empresa SET nome=?, local=?, numero_funcionarios=?, porte=? WHERE ID = ?");

			stmtInsert.setString(1, empresa.getNome());
			stmtInsert.setString(2, empresa.getLocal());
			stmtInsert.setInt(3, empresa.getNumeroFuncionarios());
			stmtInsert.setString(4, empresa.getPorte());
			stmtInsert.setInt(5, empresa.getId());
			stmtInsert.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException(
					"Erro ao conectar ou manipular o banco de dados!", e);
		} finally {

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
					throw new SQLException(
							"Erro ao fechar a conexao com o banco de dados!", e);
				}
			}
		}
	}
}
