package br.com.fiap.jobs.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.jobs.bean.Vaga;
import br.com.fiap.jobs.dao.VagaDAO;

public class VagaBO {

	private VagaDAO vagaDAO = new VagaDAO();
	
	public void inserir(Vaga vaga){
		try {
			vagaDAO.inserir(vaga);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Vaga> listarTodos(){
		try {
			return vagaDAO.listarTodos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ArrayList<Vaga>();
		}
	}
	
	public Vaga buscarPorId(int id) {
		try {
			return vagaDAO.buscarPorId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public void alterar(Vaga vaga) {
		try {
			vagaDAO.alterar(vaga);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removerPorID(int id) {
		try {
			vagaDAO.removerPorId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
