package pacotes;

public class Aula_33_ordenar_array_bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetor[] = {3,6,2,1,8,4};
		int aux;
		boolean controle;
		
		// quantas vezes preciso percorrer o 
		for (int i = 0; i < vetor.length; ++i ) {
			//aqui dentro vou criar um ciclo for que vai ser responsável por analisar dois valores
			controle = true;
			for( int j = 0; j < (vetor.length -1); ++j) {
				//aqui dentro fazemos a verificação
				if(vetor[j] > vetor[j+1])//aqui estou a dizer caso o meu membro atual seja maior que o proximo
				{
					// agora quero inverter a posição
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j+1] = aux;
					controle = false;
					
				}
			}
			if(controle) {
				break;
			}
		}
		
		for(int i = 0; i < vetor.length; ++i) {
			System.out.println(vetor[i] + "");
		}

	}

}
