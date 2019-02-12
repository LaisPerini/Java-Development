package br.com.fiap.jobs.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.jobs.bean.Empresa;
import br.com.fiap.jobs.dao.EmpresaDAO;

public class EmpresaBO {

	private EmpresaDAO empresaDAO = new EmpresaDAO();
	
	public void inserir(Empresa empresa) {
		try {
			empresaDAO.inserir(empresa);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Empresa> listarTodos()  {
		try {
			return empresaDAO.listarTodos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ArrayList<Empresa>();
		}
	}
	
	public Empresa buscarPorId(int id) {
		try {
			return empresaDAO.buscarPorId(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public void alterar(Empresa empresa) {
		try {
			empresaDAO.alterar(empresa);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
