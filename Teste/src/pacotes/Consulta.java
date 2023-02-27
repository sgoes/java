package pacotes;

import java.util.Scanner;

public class Consulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Atributos Medico
		String nomeMedicoConsulta;
		String NIFMedicoConsulta;
		String especialidadeConsulta;
		
		//Atributos Cliente
		String nomeClienteConsulta;
		String NIFCienteConsulta;
		String emailClienteConsulta;
		boolean seguroClienteConsulta;
		
		
		// Instaciacao classes
		Medico medico = new Medico();
		Cliente cliente = new Cliente();
		
		boolean play = true;
		
		while(play) {
			System.out.println("=== Welcome to CINEL White Clinic ====");
			System.out.println("[1] - Registo de um médico");
			System.out.println("Insira a sua opção ---->  ");
			String opcao = scanner.nextLine();
				switch(opcao) {
				case "1" :{
					// chama método para registar medico
					medico.GuardaDadosMedico();
					
					
					break;
				}
				}
		}


	}

}
