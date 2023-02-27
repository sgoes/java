package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
	
	// atributos
	String nomeClienteC;
	String nifClienteC;
	String emailClienteC;
	String seguroClienteC;
	
	Medico medico = new Medico();
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> clientes = new ArrayList<String>();
	ArrayList<String> nifClientes = new ArrayList<String>();
	ArrayList<String> emailClientes = new ArrayList<String>();
	
	//Metodos
	// Registar cliente
	public void dadosCliente(String NomeClienteConsulta, String nifClienteConsulta, String emailClienteConsulta, String seguroClienteConsulta) {
		
		this.nomeClienteC = NomeClienteConsulta;
		this.nifClienteC = nifClienteConsulta;
		this.emailClienteC = emailClienteConsulta;
		this.seguroClienteC = seguroClienteConsulta;
		
		System.out.println(" ===== Agendamento de Consulta: ==== ");
		System.out.println("É novo cliente? ");
		String novoCliente = scanner.nextLine();
		if(novoCliente.equals("sim")) {
			
			System.out.println("Insira o seu nome: ");
			nomeClienteC = scanner.nextLine();
			
			
			//Adicionar o nome à array list clientes
			clientes.add(nomeClienteC);
			
			System.out.println("Insira o seu nif: ");
			nifClienteC = scanner.nextLine();
			nifClientes.add(nifClienteC);
			
			System.out.println("Insira o seu e-mail: ");
			emailClienteC = scanner.nextLine();
			emailClientes.add(emailClienteC);
			
		}else {
			System.out.println("Marque a sua consulta");
			boolean play = true;
			while(play) {
				System.out.println("==== Especialidade ====");
				System.out.println("[1] Endodontia ");
				System.out.println("[2] Periodontologia ");
				System.out.println("[3] Cirurgia Oral ");
				System.out.println("[4] Implantologia ");
				System.out.println("[5] Sair");
				System.out.println("Escolha a especialidade: ");
				String opcao = scanner.next();
				
				switch(opcao) {
					case "1":
						System.out.println("Escolha o médico: ");
						// metodo para chamar o medico desta
						medico.mostaMedico();
						break;
					case "5":
						play = false;
						break;
				
				}
			}
		}
	}
			
		public void MostraClientes() {
			// Consultar por nomeClientes
			for(int i = 0; i < clientes.size(); i++) {
				System.out.println(clientes.get(i));
				System.out.println(nifClientes.get(i));
				System.out.println(emailClientes.get(i));
			}			
		}
		
		public void ProcurarPorCliente() {
			System.out.println("Digite um e-mail: ");
			String email = scanner.nextLine();
			
			boolean encontrado = false;
			for(int i = 0; i < emailClientes.size(); i++) {
				String emailTemp = emailClientes.get(i);
				
				if(emailClienteC.equals(emailTemp)) {
					System.out.println("E-mail encontrado: ");
					System.out.println("\t E-mail: " + emailTemp);
					encontrado = true;
					break;
				}
				if(!encontrado) {
					System.out.println("Email não encontrado!");
				}
				
			}
		}
		
		public void atualizarDados() {

			// java multidimensionais
				     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
				     
				     for (int i = 0; i < myNumbers.length; ++i) {  // se estiver mesmo a declarar arrays tenho que substituir o length pelo size
				    	 
				     }
				        for(int j = 0; j < myNumbers[i].length; ++j) {
				           System.out.println(myNumbers[i][j]);
				        }
				     }
				   
				     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
				     int[][] myNumbers1 = { {8, 9, 10, 11}, {12, 13, 14} };
				     
				     for (int i = 0; i < myNumbers.length; ++i) {
				        for(int j = 0; j < myNumbers[i].length; ++j)
				        	for(int k = 0; k < myNumbers1.length; ++k)
				            	for(int x = 0; x < myNumbers[k].length; ++x)
				        
				        {
				           System.out.println(myNumbers[i][j]);
				           System.out.println(myNumbers1[k][x]);
				        }
				     }
				     
				     // Aqui estou a percorrer dois arrays bidimensionais de uma so vez. Isto é útil para fazer a correspondencia entre array diferentes.
				     // De uma forma prática ele faz a correspondencia das posições entre arrays diferentes 
				   
				


		}

	}

	
	
	//Atualizar os dados de um cliente
	
	//Receber dados de cliente
	
	//Procurar por um determinado cliente
	
	//Inserir novo cliente
	
