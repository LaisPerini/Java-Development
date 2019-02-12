import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static void main(String[] args) throws Exception {
		Connection  conexao = null;
		String url=
		"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		conexao=DriverManager.getConnection(url,"","");
		System.out.println("Abriu");
		conexao.close();

	}

}
