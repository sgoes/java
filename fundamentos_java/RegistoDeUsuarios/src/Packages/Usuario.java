package Packages;

public class Usuario {

	// Aqui vou atribuir atributos e metodos que modelam o meu usario dentro do meu sistemas
	// Atributos //modificadores de acesso das variaveis // apenas este escopo aqui tem acesso às variaveis desta classe 
	private String email;
	private String senha;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}

