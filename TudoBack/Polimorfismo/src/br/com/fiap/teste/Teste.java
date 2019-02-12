package br.com.fiap.teste;

import br.com.fiap.beans.Bacharelado;
import br.com.fiap.beans.Formacao;
import br.com.fiap.beans.Medio;
import br.com.fiap.beans.Tecnologo;
import br.com.fiap.entrada.Magica;

public class Teste {

	public static void main(String[] args) {
		Formacao f;
		String descricao= Magica.texto("Descrição");
		int periodo = Magica.inteiro("Período");
		double mensalidade = Magica.decimal("Mensalidade");
		char opcao = 
				Magica.texto
				("Digite <B> para bacharelado \n <T> para Tecnologo \n <M> para Ensino Medio").toUpperCase().charAt(0);
		if (opcao=='B'){
			f=new Bacharelado(
					descricao, 
					periodo, 
					mensalidade, 
					0, 
					Magica.texto("Projeto Conclusão"),
					Magica.inteiro("Carga horária")
					);
		}else if (opcao=='T'){
			f=new Tecnologo(
					descricao, 
					periodo, 
					mensalidade, 
					0, 
					Magica.logico("Plano Estendido - Digite SIM ou NAO")
					);
			
		}else{
			f = new Medio(
					descricao, 
					periodo, 
					mensalidade, 
					0, 
					Magica.texto("Tipo")					
					);
		}
		f.definirDuracao();
		System.out.println(f.getAll());
	}
}
