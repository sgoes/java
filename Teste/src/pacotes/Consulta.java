package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {

	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in); 
		

		
		//Atributos Cliente
		String nomeClienteConsulta = null;
		String NIFClienteConsulta = null;
		String emailClienteConsulta = null;
		String seguroClienteConsulta = null;
		
		
		// Instaciacao classes
		Medico medico = new Medico();
		Cliente cliente = new Cliente();
		
		// Controlador do while
		boolean play = true;
		
		while(play) {
			System.out.println("=== Welcome to CINEL White Clinic ====");
			System.out.println("[1] - Registo de um médico");
			System.out.println("[2] - Agendar consulta ");
			System.out.println("[3] - Marcar consulta ");
			System.out.println("Insira a sua opção ---->  ");
			String opcao = scanner.nextLine();
				switch(opcao) {
					case "1" :{
						// chama método para registar medico
						medico.GuardaDadosMedico();
						break;
					}
					case "2":{
						// chama método para registo de cliente
						cliente.GuardaDadosClientes(nomeClienteConsulta, NIFClienteConsulta, emailClienteConsulta, seguroClienteConsulta);
						medico.MarcarConsulta();
						break;
					}
					case "3":{
						
						break;
							}
					}
				}
			}
		}