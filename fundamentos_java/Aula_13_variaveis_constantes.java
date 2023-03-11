package pacotes;

public class Aula_13_variaveis_constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		// qual é a diferença entre esta variável e uma variável constante?
		// a diferença é que posso alterar a qualquer altura enquanto uma constante não posso alterar o valor
		
		final int b = 10;
		//b = 10; Não podemos atribuir um valor diferente a uma constante
		
		System.out.println("x = " + x);
		//System.out.println("b = " + b);
	}

}
