package br.com.fiap.jobs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import br.com.fiap.jobs.bean.Empresa;
import br.com.fiap.jobs.bean.Vaga;

public class VagaDAO {
	
	public void inserir(Vaga vaga) throws SQLException {

		Connection conn = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtInsert = conn
					.prepareStatement("INSERT INTO jobs_vaga(id, cargo, data_anuncio, descricao, quantidade, salario, titulo, empresa_id) VALUES (SEQ_VAGA.nextval, ?, ?, ?, ?, ?, ?, ? )");

			stmtInsert.setString(1, vaga.getCargo());
			stmtInsert.setDate(2,new java.sql.Date(vaga.getDataAnuncio().getTime().getTime()));
			stmtInsert.setString(3, vaga.getDescricao());
			stmtInsert.setInt(4, vaga.getQuantidade());
			stmtInsert.setDouble(5, vaga.getSalario());
			stmtInsert.setString(6, vaga.getTitulo());
			stmtInsert.setInt(7, vaga.getEmpresa().getId());
			
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
	
	public ArrayList<Vaga> listarTodos() throws SQLException {

		ArrayList<Vaga> listaVaga = new ArrayList<Vaga>();
		Connection conn = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtSelect = conn.prepareStatement("SELECT * FROM JOBS_VAGA ORDER BY DATA_ANUNCIO");
			
			ResultSet rs = stmtSelect.executeQuery();
			
			EmpresaDAO empresaDAO = new EmpresaDAO();
			
			while (rs.next()) {

				Vaga vaga = new Vaga();
				
				vaga.setId(rs.getInt("id"));
				vaga.setCargo(rs.getString("cargo"));
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(new Date(rs.getDate("data_anuncio").getTime()));
				vaga.setDataAnuncio(calendar);
				vaga.setDescricao(rs.getString("descricao"));
				vaga.setQuantidade(rs.getInt("quantidade"));
				vaga.setSalario(rs.getDouble("salario"));
				vaga.setTitulo(rs.getString("titulo"));
				
				Empresa empresa = empresaDAO.buscarPorId(rs.getInt("empresa_id"));
				vaga.setEmpresa(empresa);
				
				listaVaga.add(vaga);
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
	
		return listaVaga;
		
	}
	
	public Vaga buscarPorId(int id) throws SQLException {

		Connection conn = null;
		Vaga vaga = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtSelect = conn.prepareStatement("SELECT * FROM JOBS_VAGA WHERE ID = ?");
			stmtSelect.setInt(1, id);
			
			ResultSet rs = stmtSelect.executeQuery();
			
			if (rs.next()) {

				vaga = new Vaga();
				
				vaga.setId(rs.getInt("id"));
				vaga.setCargo(rs.getString("cargo"));
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(new Date(rs.getDate("data_anuncio").getTime()));
				vaga.setDataAnuncio(calendar);
				vaga.setDescricao(rs.getString("descricao"));
				vaga.setQuantidade(rs.getInt("quantidade"));
				vaga.setSalario(rs.getDouble("salario"));
				vaga.setTitulo(rs.getString("titulo"));
				
				EmpresaDAO empresaDAO = new EmpresaDAO();
				Empresa empresa = empresaDAO.buscarPorId(rs.getInt("empresa_id"));
				vaga.setEmpresa(empresa);
				
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
	
		return vaga;
		
	}
	
	public void alterar(Vaga vaga) throws SQLException {

		Connection conn = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtInsert = conn
					.prepareStatement("UPDATE JOBS_VAGA SET cargo = ?, data_anuncio = ?, descricao =?, quantidade=?, salario=?, titulo=?, empresa_id=? WHERE ID = ?");

			stmtInsert.setString(1, vaga.getCargo());
			stmtInsert.setDate(2,new java.sql.Date(vaga.getDataAnuncio().getTime().getTime()));
			stmtInsert.setString(3, vaga.getDescricao());
			stmtInsert.setInt(4, vaga.getQuantidade());
			stmtInsert.setDouble(5, vaga.getSalario());
			stmtInsert.setString(6, vaga.getTitulo());
			stmtInsert.setInt(7, vaga.getEmpresa().getId());
			stmtInsert.setInt(8, vaga.getId());
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
	
	public void removerPorId(int id) throws SQLException {

		Connection conn = null;

		try {

			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement stmtInsert = conn
					.prepareStatement("DELETE FROM JOBS_VAGA WHERE ID = ?");

			stmtInsert.setInt(1, id);
			stmtInsert.execute();

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
