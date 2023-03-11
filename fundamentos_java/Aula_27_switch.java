package pacotes;
import java.util.Scanner;

public class Aula_27_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Selecione um numero de 1 a 5: ");
		int num = input.nextInt();
		
		
		// o switch permito-nos fazer um controle e baseado nesse controle executar determinadas instruções
		//dentro dos parenteses do switch coloco aquilo que quero controlar por exemplo e neste caso a variavel num
		
		switch(num){
		case 1: // este caso aqui está a controlar o valor da variavel num, caso o numero inserido seja um, vamos lançar um conjunto de instruções
			System.out.println("Você escolheu 1.");
			// eu podia ter aqui muitas mais instruções
			break; // 
		case 2: 
			System.out.println("Você escolheu 2.");
			break;
		case 3: 
			System.out.println("Você escolheu 3.");
			break;
		case 4: 
			System.out.println("Você escolheu 4.");
			break;
		case 5: 
			System.out.println("Você escolheu 5.");
			break;
		default: // este caso default serve para controlar algum input que não esteja a ser controlado pelo switch
			System.out.println("Pão com chouriçooooo");
		}
	}

}
