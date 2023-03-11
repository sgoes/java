package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {

	public static void main(String[] args){
	
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
			System.out.println("[3] - Listar Consultas ");
			System.out.println("[4] - Pagamento");
			System.out.println("[5] Eliminar consulta");
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
						medico.AgendarConsulta(nomeClienteConsulta, NIFClienteConsulta, emailClienteConsulta, seguroClienteConsulta);
						break;
					}
					case "3":{
							break;
						}
					case "4": {
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
					case "5":{
						System.out.println("====Eliminar consulta agendada====");
						break;
					}
						
					default:{
                        System.out.println("Opção inválida");}
				}
			}	
		
	}
}
		