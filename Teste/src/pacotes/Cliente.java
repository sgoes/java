package pacotes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	//Instanciar o Scanner
	Scanner scanner = new Scanner(System.in);
	
	// Instanciar objetos das classes
	Consulta consulta = new Consulta();
	Consulta medico = new  Consulta();
	
	// ArrayList para armazenar os dados do cliente
	ArrayList<String> dadosCliente = new ArrayList<String>();
	
	// Atributos
	String nome;
	String NIF;
	String email;
	String seguro;
	
	String juntaDadosCliente;
	
	// metodo que guarda os dados dos clientes
	public void GuardaDadosClientes(String nomeClienteConsulta, String NIFClienteConsulta, String emailClienteConsulta, String seguroClienteConsulta) {
		
		this.nome = nomeClienteConsulta;
		this.NIF = NIFClienteConsulta;
		this.email = emailClienteConsulta;
		this.seguro = seguroClienteConsulta;
		 
		System.out.println("Insira o seu nome: ");
		this.nome = scanner.nextLine();
		
		System.out.println("Insira o seu NIF: ");
		this.NIF = scanner.nextLine();
		
		System.out.println("Insira o seu e-mail: ");
		this.email = scanner.nextLine();
		
		System.out.println("Tem seguro: ");
		this.seguro = scanner.nextLine();
		
		juntaDadosCliente = "Nome do cliente: " + this.nome + "\n O NIF do cliente é: " + this.NIF + "\n O e-mail do cliente é: " + this.email + "\n Tem seguro: " + this.seguro;
		// Metodo que junta os inputs clientes num array 
		dadosCliente.add(juntaDadosCliente);
		
		//System.out.println(dadosCliente);	
		
	}
	
	public void MostrarClientes() {
		for(int i = 0; i < dadosCliente.size(); i++) {
			System.out.println(dadosCliente.get(i));
		}
	}

}
