package pacotes;
import java.util.*;

import javax.sql.rowset.serial.SQLOutputImpl;

public class StandJavaMain {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String veiculoTipo; // MAIN
		String marca; // CV --> CM --> CC
		String modelo; // CV --> CM --> CC
		double preco; // CV --> CM --> CC
		String ano = null; // CV --> CM
		String cor = null; // CV --> CM
		int lugares = 0; // CV --> CC
		int portas = 0; // CV --> CC
		double km = 0; // CV --> CC
		
		// Criar objeto para a classe Veiculo:
		Veiculo veiculoNew = new Veiculo();
		
		// Criar objeto para a classe Motas:
		Motas motasNew = new Motas();
		
		// Criar o objeto para a classe Carro:
		Carro carroNew = new Carro();
		
		// Criar método para ler os dados introduzidos pelo utlizador:
		Scanner lerString = new Scanner(System.in);
		Scanner lerInt  = new Scanner(System.in);
		Scanner lerDouble = new Scanner(System.in);
		
		veiculoNew.MotrarClasseVeiculo();
		
		// Inserir se é carro ou mota
		System.out.println("Quer fazer o registo de um carro ou de um mota: ");
		veiculoTipo = lerString.nextLine();
		
		
		
		// Inserção de dados do usuário
		
		// Inserir marca do veiculo
		System.out.println("Indique a marca do veículo: ");
		marca = lerString.nextLine();
		
		// Inserir modelo do veiculo
		System.out.println("Insira o modelo do veículo:");
		modelo = lerString.nextLine();
		
		
		// Insira o preço do veículo
		System.out.println("Insira o preço do veículo: ");
		preco = lerDouble.nextDouble();		

		
		if(veiculoTipo.equals("mota")) {
			System.out.println("Insira o ano da mota: ");
			ano = lerString.nextLine();
			
			System.out.println("Insira a côr da mota: ");
			cor = lerString.nextLine();
			
			// Método que vai à classe Mota:
			motasNew.MostraMota(marca, modelo, preco, ano, cor);
			
		}
		else if(veiculoTipo.equals("carro")) {
			System.out.println("Insira o número de lugares: ");
			lugares = lerInt.nextInt();
			
			System.out.println("Insira o número de portas: ");
			portas = lerInt.nextInt();
			
			System.out.println("Insira os km atuais: ");
			km = lerDouble.nextDouble();
			
			// Método que vai buscar à classe Carro:
			carroNew.MostraCarro(marca, modelo, preco, lugares, portas, km);
		}
		else {
			System.out.println("Introduza de forma correta o tipo de veiculo que quer fazer o registo.");
		}
		
		veiculoNew.MotrarClasseVeiculo();
		
		
		// Depois de criar o formulário quer entrar mostrar os métodos que revelam a informação
		
		
	}
	

	
	
	
	

}
