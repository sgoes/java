package packages;

public class Usuario {

	// Aqui vou atribuir atributos e metodos que modelam o meu usario dentro do meu sistemas
	// Atributos //modificadores de acesso das variaveis // apenas este escopo aqui tem acesso às variaveis desta classe 
	private String email;
	private String senha;
	
	
	// Metodo que permite modificar o acesso, para receber os valores. 
	public void atribuirEmail(String email) {
		this.email = email; // este segundo email é referente à variável do parameto, à variavel local, o this seerve para diferenciar // o this tbm faz referencia ao objeto
	}
	
	// Método que permite enviar os valores das variaveis privates da class usuario para a class main
	public String pegarEmail() {
		return email;
	}
	
	public void atribuirSenha(String senha) {
		this.senha = senha;
	}
	
	public String pegarSenha() {
		return senha;
	}
		
	// AQUI TENHO A MANEIRA DE PEGAR VALORES DA CLASSE MAIN PARA A CLASSE USUARIO E DA CLASSE USUARIO PARA A CLASSE MAIN
}

