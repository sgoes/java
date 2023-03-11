package pacotes;
import java.util.*;
//import java.util.Random;


public class Aula_25_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		boolean acertou = false;
		int tentativas = 10;
		int numeroSecreto = random.nextInt();
		long chute = 0; // variavel que vai contem o valor que o usuario estiver chutando
		
		System.out.println(numeroSecreto);
		while(tentativas > 0 && acertou == false) {
			System.out.println("Qual o seu chute: ");
			chute = input.nextLong(); // agora precisamos de comparar com o n�mero secreto, ver se o numero secreto � igual com o numero que o usuario digitou
			
			if(numeroSecreto == chute){
				System.out.println("Parab�ns voc� acertou");
				acertou = true; // isto vai fazer que o ciclo while n�o volte a rodar, dado que n�o satisfaz a condi��o
			}else if (chute < numeroSecreto) {
				--tentativas;
				System.out.println("N�mero muito pequeno" + tentativas + " tentivas restantes");
				
			}else {
				--tentativas;
				System.out.println("N�mero muito grande" + tentativas + " tentivas restantes");
			}
		}
	}
}
