package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.beans.Telefone;
import br.com.fiap.dao.TelefoneDAO;

public class TelefoneBO {
	public static String novoTelefone(Telefone t, int numero)throws Exception{
		if (numero<=0){
			return "O número deve ser maior que zero";
		}
		if(t.getOperadora().length()>20){
			return "Operadora excedeu quantidade de caracteres";
		}
		if(t.getNumero().length()!=10 || t.getNumero().length()!=9){
			return "Formato inválido de telefone";
		}
		if(t.getDdd()>999){
			return "DDD excedeu o tamanho";
		}
		TelefoneDAO dao = new TelefoneDAO();
		String x = dao.inserir(t, numero);
		dao.fechar();
		return x;
	}
	public static List<Telefone> localizarOperadoras(String o)throws Exception{
		TelefoneDAO dao = new TelefoneDAO();
		List<Telefone> lista = dao.consultarPorOperadora(o);
		dao.fechar();
		return lista;
	}
	
	public static int apagarPorTelefone(String numTel)throws Exception{
		TelefoneDAO dao = new TelefoneDAO();
		int x = dao.excluirPorNumeroTelefone(numTel);
		dao.fechar();
		return x;
	}
	
	public static int alterarOperadora(Telefone obj)throws Exception{
		if(obj.getOperadora().length()>20){
			return 0;
		}		
		TelefoneDAO dao = new TelefoneDAO();
		int x = dao.alterarPorNumeroTelefone(obj);
		dao.fechar();
		return x;
	}
}








