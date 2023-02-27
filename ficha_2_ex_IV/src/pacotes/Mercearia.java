package pacotes;
import java.util.*;

public class Mercearia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar o método que lê, guarda e atribui o valor introduzido pelo usuario
		Scanner ler = new Scanner(System.in);
		Scanner lerInt = new Scanner(System.in);
		
		// Instanciar classes
		Frutas chamaFrutas = new Frutas();
		Legumes chamaLegumes = new Legumes();
		Padaria chamaPadaria = new Padaria();
		
		// Atributos		
		String resposta = "1";
		String respostaF;
		String respostaL;
		String respostaP;
		
		int respostaFQ = 0;
		int respostaLQ = 0;
		int respostaPQ = 0;
		
		
		
		// Mostrar menu prinicpal
		System.out.println("Olá! Chegou à sua merceraria preferida, sinta-se à vontade para escolher os produtos que deseja levar.");
		while(resposta != "0")
		{
			System.out.println("Selecione a sua opção inserido o número: ");
			System.out.println("1 - Fruta: ");
			System.out.println("2 - Legumes: ");
			System.out.println("3 - Padaria: ");
			System.out.println("4 - Sair da mercearia.");
			
			// Lê e guarda respostas --> Scanner
			resposta = ler.nextLine().trim();
			switch(resposta)
			{
			case "1":
				System.out.println("Que fruta deseja:");
				System.out.println("1 - Banana");
				System.out.println("2 - Morangos");
				System.out.println("3 - Abacate");
				respostaF = ler.nextLine();

				System.out.println("Indique a quantidade: ");
				respostaFQ = lerInt.nextInt();
				
				// enviar dados da main para o construtor da classe
				chamaFrutas.GuardaFrutas(respostaF, respostaFQ);
				chamaFrutas.resumoFruta();
				
				break;
				
				
			case "2":
				System.out.println("Que legumes deseja: ");
				System.out.println("1 - Ervilhas");
				System.out.println("2 - Brocolos");
				System.out.println("3 - Espinafres");
				respostaL = ler.nextLine();
				
				System.out.println("Indique a quantidade: ");
				respostaLQ = lerInt.nextInt();
				
				chamaLegumes.GuardaLegumes(respostaL, respostaLQ);
				
				break;
				
				
			case "3":
				System.out.println("Que pão deseja: ");
				System.out.println("1 - PapoSeco");
				System.out.println("2 - Alentejano");
				System.out.println("3 - Broa de Milho");
				respostaP = ler.nextLine();	
				
				System.out.println("Indique a quantidade: ");
				respostaPQ = lerInt.nextInt();
				break;
				
				
			case "4":
				System.out.println("Obrigado! Volte sempre!");
				break;
			
			}
		}
		
	}

}
