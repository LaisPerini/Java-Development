package br.com.fiap.testes;

import javax.swing.JOptionPane;
import br.com.fiap.beans.Produto;
import br.com.fiap.dao.ProdutoDAO;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutoDAO dao = null;
		try{
			dao = new ProdutoDAO();
			do{
				char op = JOptionPane.showInputDialog
						("Digite:\n <C> para cadastrar\n"
								+ "<N> para Consultar\n"
								+ "<A> para Aumentar\n"
								+ "<E> para Excluir\n "
								+ "<L> para Listar")
						.toUpperCase().charAt(0);
				if (op=='C'){
					Produto p = new Produto();
					p.setDescricao(JOptionPane.showInputDialog("Descrição"));
					p.setCategoria(JOptionPane.showInputDialog("Categoria"));
					p.setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
					p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Código")));
					System.out.println(dao.gravar(p));
				}else if(op=='N'){
					int cod=Integer.parseInt(JOptionPane.showInputDialog("Código"));
					Produto p = dao.getProduto(cod);
					System.out.println("Código: " + p.getCodigo());
					System.out.println("Descrição: " + p.getDescricao());
					System.out.println("Valor: " + p.getValor());
					System.out.println("Categoria: " + p.getCategoria());
					System.out.println();
				}else if(op=='A'){
					double porc = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem de aumento"));
					System.out.println(dao.aumentar(porc)+ " upado(s)!");
				}else if(op=='E'){
					int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
					System.out.println(dao.excluirPorCodigo(cod)+ " cliente(s) excluído(s)!");					
				}else if(op=='L'){
					String cat = JOptionPane.showInputDialog("Digite a categoria");
					for (Produto p : dao.listarCategorias(cat)){
						System.out.println("Descrição: " + p.getDescricao());
						System.out.println("Valor....: " + p.getValor());
						System.out.println();
					}
				}else{
					System.out.println("Opção inválida!!!");
				}
			}while(JOptionPane.showConfirmDialog
					(null, "Continuar?","DAOPRODUTO",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE)==0);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				dao.fechar();
			}catch(Exception e){
				
			}
		}

	}

}
