package pacotes;
import java.util.*;

public class Aula_26_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 0 a 10: ");
		int numero = input.nextInt();
		
		// para explicar o que o camarada break e continue fazem vamos precisar aqui um ciclo for
		for(int i = 0; i <= 10; ++i) {
			if(i == numero) {
				System.out.println("O seu numero � " + i);
				//break; // quebra a execu��o do ciclo for
			}else {
				System.out.println("O seu n�mero n�o �  " + i);
				continue; // se o continue estiver colocado e caso a condi�ao do if seja false e entre no else, e passando pelo continue, basicamente ele deixa de correr o resto do programa
			}
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXX");
		}
	}
}
