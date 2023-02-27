package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	//Instanciar o Scanner
	Scanner scanner = new Scanner(System.in);
	
	// Instanciar objetos das classes
	Consulta consulta = new Consulta();
	Consulta medico = new  Consulta();
	
	// ArrayList para armazenar os dados do cliente
	static ArrayList<String> dadosCliente = new ArrayList<String>();
	
	// Atributos
	String nome;
	String NIF;
	String email;
	boolean seguro;
	
	
}
