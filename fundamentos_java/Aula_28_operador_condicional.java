package pacotes;

public class Aula_28_operador_condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int maior;
		
		maior = (a < b) ? 500 : 1000; // o ponto de interrogação retorna o valor verdadeiro neste caso 500 o : retorna o valor falso, caso o a seja menor que o b, o valor impresso na consola será 500, para verificar se tudo deu certo, dou print
		System.out.println(maior); // a condição é verdadeira, portanto vai ser retribuido 500

	}

}
