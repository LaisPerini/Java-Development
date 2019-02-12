import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// Método length(): retorna a quantidade de caracteres
		// que existem em uma String
		String uf=JOptionPane.showInputDialog
				("Digite a UF").toUpperCase();
		if (uf.length()==2){
			System.out.println("Estado válido");
		}
		// Método toUpperCase()/toLowerCase(): converte
		// o conteúdo de uma String para caixa alta ou
		// baixa.
		
		// Metodo equals(): compara dois valores do tipo 
		// String, este método diferencia letras maiúsculas 
		// de minúsculas
		
		if (uf.equals("SP")){
			System.out.println("São Paulo");
		}else if (uf.equals("RJ")){
			System.out.println("Rio de Janeiro");
		}else{
			System.out.println("Consulte o atlas");
		}
		// Metodo indexOf(): retorna a posição do caracter ou 
		// substring dentro de uma String.
		String email=JOptionPane.showInputDialog("Digite o email");
		System.out.println(email.indexOf('@'));
		if(email.indexOf('@')>0){
			System.out.println("Email válido!");
		}else{
			System.out.println("Juninho errou....");
		}
		
		// Metodo charAt(): retorna um dado do tipo "char" com
		// base em uma posição da String
		char genero = JOptionPane.showInputDialog
				("Digite o genero:").toUpperCase().charAt(0);
		if (genero=='M'){
			System.out.println("Masculino");
		}else if (genero=='F'){
			System.out.println("Feminino");
		}else{
			System.out.println("Genero inválido");
		}
		// Metodo substring(): permite retornar uma parte da String
		// através das coordenadas de inicio e fim.
		System.out.println(email.substring(0, 3));
		//Exibir a primeira metade
		System.out.println(email.substring(0, email.length()/2));
		//Exibir a segunda metade
		System.out.println(email.substring(email.length()/2));
		//Exibir o nome do usuário do email
		System.out.println(email.substring(0,email.indexOf('@')));
		//Exibir o servidor do email
		System.out.println(email.substring(email.indexOf('@')+1));
	}

}




