package packages;
import java.util.ArrayList;

public class Usuario {

	// Aqui vou atribuir atributos e metodos que modelam o meu usario dentro do meu sistemas
	// Atributos //modificadores de acesso das variaveis // apenas este escopo aqui tem acesso às variaveis desta classe 
	private String email;
	private String senha;
	private ArrayList<Tarefa> tarefas; // cada objeto de usuario vai ter o seu arraylist de tarefa / Tarefa é uma classe 
	
	public ArrayList<Tarefa> getTarefas() {
		return tarefas;
	}
	public void setTarefas(ArrayList<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
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

