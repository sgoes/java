package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		
		//Atriburos para pagamento
		double preco = 50; // 100%
		double descontoSeguro = 0.15; // 50*0.15 = 7,5 // 50-7,5
		double desconto = 0.05; // 50*0.5 = 2,5 // 50-2,5 
		
		// valor para quem ja realizou consultas e nao tem seguro
		double precoDesconto = (preco * desconto);
		double precoDescontoFinal = (preco - precoDesconto);
		
		//valor para quem seguro e não realizou mais que uma consulta
		double precoDescontoSeg = (preco * descontoSeguro);
		double precoDescontoSegFinal = (preco - precoDescontoSeg);
	
		
		//valor para quem tem seguro e realizou mais que uma consulta
		double somaDesconto = (precoDesconto + precoDescontoSeg);
		double precoDescontoSeg2 = ( preco - somaDesconto);
		
		// Atributos
		//Cliente
		String NomeClienteConsulta = null;
		String nifClienteConsulta = null;
		String emailClienteConsulta = null;
		String seguroClienteConsulta = null;
		
		// Medico
		String NomeMedicoConsulta;
		String EspecialidadeConsulta;
		String nifMedicoConsulta;
		
		
		// Instanciar objetos das classes
		Cliente clientes = new Cliente();
		Medico medico = new Medico();

		//ArrayLists
		ArrayList<String> novoCliente = new ArrayList<String>();
		
		//-----------------------------------------------------------------------
		
		
		boolean play = true;
		
		while(play) {
			System.out.println("==== WELCOME TO CINEL WHITE CLINIC ====");
			System.out.println("[1] Agendar consulta: ");
			System.out.println("[a] Inserir medico: ");
			System.out.println("[b] Atualizar dados cliente: ");
			System.out.println("[2] Listar consultas por especialidade.");
			System.out.println("[3] Listar consultas por cliente.");
			System.out.println("[4] Procurar cliente por e-mail");
			System.out.println("[5] Apagar consulta.");
			System.out.println("[6] Apresentar o total pago em consultas.");
			System.out.println("[7] Sair");
			System.out.println("Digite a opção: ");
			String opcao = scanner.nextLine();
		
			switch(opcao) {
				case "1":{
					System.out.println("==== Agendar Consulta =====");
					
					clientes.dadosCliente(NomeClienteConsulta, nifClienteConsulta, emailClienteConsulta, seguroClienteConsulta);
					
					
					//chamar o método do menu das especialidades
					//chamar o método do menus dos medico para cada especialidade
					
					break;
					}
				case "a":{
					medico.dadosMedico();
					break;
				}
				case "b":{
					clientes.atualizarDados();
					break;
				}
				case "2":{
					System.out.println("==== Listar Consultas por Especialidade ====");
					// chama metodos consultas
					break;
				}
				case "3":{
					System.out.println("==== Listar Consultas por Cliente ====");
					clientes.MostraClientes();
					break;
				}
				case "4": {
					System.out.println("==== Procurar Cliente por E-mail====");
					clientes.ProcurarPorCliente();
					break;
				}			
				
				
				case "5": {
					System.out.println("==== Apagar Consulta ====");
					break;
				}
				case "6": {
					System.out.println("==== Apresentar o total pago em consultas ===");

					System.out.println("Responda 'sim' ou 'nao' às seguintes perguntas");
					System.out.println("Tem seguro: ");
					String seguro = scanner.nextLine();
					System.out.println("Já realizou mais de um consulta na CINEL White Clinic?");
					String secondConsult = scanner.nextLine();
					
					if(seguro.equals("sim") && (secondConsult.equals("sim"))){
						System.out.println("O preço final é: " + precoDescontoSeg2 + "€");
						
					}else if(!seguro.equals("sim") && (secondConsult.equals("sim"))) {
						System.out.println("O preço final é: " + precoDescontoFinal + "€");
					}else if(seguro.equals("sim") && (!secondConsult.equals("sim"))) {
						System.out.println("O preço final é: " + precoDescontoSegFinal + "€");
					}
					else {
					System.out.println("O preço da consulta é: " + preco + "€");
					}
					break;
				}
			
				case "7":{
					System.out.println("==== ------ SAINDO DO MENU ------ ====");
					play = false;
					break;
				}

				default:{
					System.out.println("Insira uma opção válida! ");
					break;
				}
			}
		}
	}
}

	