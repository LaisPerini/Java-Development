package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;

public class ClienteBO {
	public static String novoCliente(Cliente objCliente)throws Exception{
		if (objCliente.getQtdeEstrelas()<1 || objCliente.getQtdeEstrelas()>5){
			return "Qtde de estrelas inválida";
		}
		if(objCliente.getNome().length()>50){
			return "Nome inválido!";
		}
		if(objCliente.getNumero()<0){
			return "Número inválido!";
		}
		ClienteDAO dao = new ClienteDAO();
		String msg = dao.inserir(objCliente);
		dao.fechar();
		return msg;
	}
	
	public static Cliente consultarPorCodigo(int n)throws Exception{
		ClienteDAO dao = new ClienteDAO();
		Cliente c =  dao.getCliente(n);
		dao.fechar();
		return c;
	}
	public static int apagarPorNome(String n)throws Exception{
		ClienteDAO dao = new ClienteDAO();
		int x = dao.excluirNome(n);
		dao.fechar();
		return x;
	}
	public static String aumentarEstrela(int n)throws Exception{
		ClienteDAO dao = new ClienteDAO();
		Cliente obj = dao.getCliente(n);
		if(obj.getQtdeEstrelas()>=5){
			return "Limite alcançado";
		}
		String x = dao.elevarNivel(n);
		dao.fechar();
		return x;
	}
	public static List<Cliente> consultarPorNivel(int n)throws Exception{
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> x = dao.getListarNivel(n);
		dao.fechar();
		return x;		
	}
}






