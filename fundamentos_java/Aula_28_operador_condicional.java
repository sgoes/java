package pacotes;

public class Aula_28_operador_condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int maior;
		
		maior = (a < b) ? 500 : 1000; // o ponto de interroga��o retorna o valor verdadeiro neste caso 500 o : retorna o valor falso, caso o a seja menor que o b, o valor impresso na consola ser� 500, para verificar se tudo deu certo, dou print
		System.out.println(maior); // a condi��o � verdadeira, portanto vai ser retribuido 500

	}

}
