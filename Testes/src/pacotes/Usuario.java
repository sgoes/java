package pacotes;

public class Usuario {

	String email;
	String senha;
	 
	public void atribuirEmail(String email) {
		this.email = email; // o this.email faz referencia à variavel declarada no atributo e o segundo email faz referencia à variavel que é passada por parâmetro
	}
	
	public void atribuirSenha(String senha) {
		this.senha = senha;
	}


	
	
	

}
