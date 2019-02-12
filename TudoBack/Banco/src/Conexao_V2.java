import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao_V2 {

	public static void main(String[] args) {
		Connection conectar = null;
		Statement estrutura=null;
		ResultSet resultado = null;
		try{
			conectar = DriverManager.getConnection
					("jdbc:oracle:thin:/:@192.168.60.15:1521:ORCL","PF0709","");
			estrutura = conectar.createStatement();
			resultado= estrutura.executeQuery
					("select * from TB_DDD_CLIENTE");
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
