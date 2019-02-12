package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {
	public Connection connect()throws Exception{
		return DriverManager.getConnection
("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","PF0709","170675");
	}
}
