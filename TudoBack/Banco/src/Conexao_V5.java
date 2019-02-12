import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao_V5 {

	public static void main(String[] args) {
		Connection conectar = null;
		PreparedStatement estrutura=null;
		ResultSet resultado = null;
		try{
			conectar = DriverManager.getConnection
					("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL","PF0709","");
			String strNome=JOptionPane.showInputDialog("Digite o login:").toUpperCase();
			int intSenha=Integer.parseInt
						(JOptionPane.showInputDialog
						("Digite a senha"));
			estrutura = conectar.prepareStatement
					("select * from TB_DDD_CLIENTE WHERE "
			+ "NR_CLIENTE = "+intSenha+" AND NM_CLIENTE='"+strNome+"'");
			resultado= estrutura.executeQuery();
			if (resultado.next()){
				System.out.println("Logado com sucesso!");
			}else{
				System.out.println("Acesso negado");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				resultado.close();
				estrutura.close();
				conectar.close();
			}catch(SQLException e){
				e.printStackTrace();
			}

		}

	}

}
