package excecao;

import java.sql.SQLException;

public class Excecao extends Exception{
public static String ex(Exception e){
	if (e instanceof SQLException){
		if(e.getMessage().indexOf("logon denied")>=0){
			return "Erro de login";
		}else if (e.getMessage().indexOf("a tabela ou view não existe")>=0){
			return "Erro de tabela";
		}else{
			return "Erro no banco";
		}
	}else{
		return "Erro desconhecido";
	}
}
}
