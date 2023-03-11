package packages;
import java.util.*;

import java.util.Scanner;

public class A5_Static_Instanci_main {
	
	public static void main(String[] args) {
		
		
		/*
		 * Declaracao das variaveis locais (main)
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		// Instanciação de objetos // vamos instanciar um objeto da classe calculadora --> A5_Static_instan_2
		A5_1_Static_Instcia_2 calc = new A5_1_Static_Instcia_2();
		A5_1_Static_Instcia_2 calc2 = new A5_1_Static_Instcia_2(); // aqui estou a instancir um outro objeto, ou seja, um novo objeto, que vai ser diferente do objeto de cima. O objeto guardado no objeto de cima, possui o seu próprio x e o seu proprio y.  O x de calc é diferente de x calc2
		
		
		/*
		 * Entrada de dados do usuário
		 */
		System.out.println("Digite o valor de x: ");
		calc.x = scanner.nextInt();
		
		System.out.println("Digite o valor de y: ");
		calc.y = scanner.nextInt();
		
		
		
		//Entrada do usuario para o novo objeto que foi criado
		System.out.println("Digite o valor de x para o calc2: ");
		calc2.x = scanner.nextInt();
		System.out.println("Digite o valor de y para o calc2: ");
		calc2.y = scanner.nextInt();
		// mais em baixo pode verificar que este objeto vai ser chamada
		
		//Chama método
		calc.soma();
		int somaApp = calc.soma(40,50); // realizar soma com variavis locais
		System.out.println("[metodoMainRetrun] Soma = " + somaApp);
		System.out.println("---------------------");
		calc.subtracao();
		calc.multiplicacao();
		calc.divisao();
		
		System.out.println("-----------AGORA É O CALC DOIS DOIS QUE ESTÁ A SER CHAMADO---------");
		int somaCalc2 = calc2.soma(10,20);
		System.out.println("[metodoMainReturn] Soma = " + somaCalc2);
		calc2.soma();
		calc2.subtracao();
		calc2.multiplicacao();
		calc2.divisao();
		
	}
	

}
