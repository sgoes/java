package pacotes;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Criar metodo scanner para ler a entrada do numero introduzido pelo usuario
        Scanner lerInt = new Scanner(System.in);

        // Criar instância para a classe numero:
        numero dadosNumero = new numero();

        // Apresentação do programa ao usuario
        System.out.println("Este programa permite converter um numero de 1 a 10 em texto!");

        // Criar input para o usuario intruduzir o numero
        System.out.println("Indique um numero de 1 a 10: ");
        // Ler e guardar o numero introduzido na classe
        dadosNumero.numeroUtilizador = lerInt.nextInt();

        // Método que é chamado da classe contrutora para ser apresentado no programa:
        dadosNumero.analisaNumero();


	}

}
