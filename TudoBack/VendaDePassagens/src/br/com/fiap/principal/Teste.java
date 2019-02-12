package br.com.fiap.principal;

import br.com.fiap.beans.ClienteFisico;
import br.com.fiap.beans.Escala;
import br.com.fiap.beans.Passagem;
import br.com.fiap.beans.Voo;
import br.com.fiap.entrada.Magica;

public class Teste {
	public static void main(String[] args) {
		Passagem objetoPassagem = new Passagem(
				Magica.inteiro("Número"), 
				Magica.decimal("Valor"), 
				new ClienteFisico(
						Magica.inteiro("Código"), 
						Magica.texto("Nome"), 
						Magica.texto("Endereço"), 
						Magica.texto("Telefone"), 
						Magica.texto("CPF"), 
						Magica.texto("RG"), 
						Magica.texto("Nascimento")), 
				new Voo(Magica.texto("Numero"), 
						Magica.texto("Origem"), 
						Magica.texto("Destino"), 
						new Escala(
								Magica.texto("Local"), 
								Magica.texto("Duracao"), 
								Magica.texto("Tipo")
								))
				);
		System.out.println(objetoPassagem.getAll());

	}
}
