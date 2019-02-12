import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexao_V4 {

	public static void main(String[] args) {
		Connection conectar = null;
		PreparedStatement estrutura=null;
		ResultSet resultado = null;
		try{
			conectar = DriverManager.getConnection
					("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL","PF0709","");
			String strNome=JOptionPane.showInputDialog("Digite o nome:").toUpperCase();
			
			estrutura = conectar.prepareStatement
					("select * from TB_DDD_CLIENTE WHERE "
							+ "NM_CLIENTE LIKE '"+strNome+"%'");
			resultado= estrutura.executeQuery();
			while (resultado.next()){
				System.out.println("Nome: " + 
						resultado.getString(1));
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
