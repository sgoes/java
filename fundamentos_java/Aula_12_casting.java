package pacotes;

public class Aula_12_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 6;
		int z = 3;
		double a = 3.0;
		double b = 1.0;
		double c = (double)x /z; // aqui estamos a dividir dois numeros inteiros, o programa faz a conta no entanto vai sempre retornar a parte inteira
		// Casting - quando se for�a a vari�vel imediatamente a seguir a ser de outro tipo, neste caso � so o x que � double, basta um dos valores ser do tipo double
		double d = (double)(x/y);
		// Casting - aqui a opera��o � efetuada e so no fim for�a o valor a dar double
		int h = (int)c; // toda a parte decimal vai ser ignorada
		
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d ); // n�o adiante de nada, o double � apenas feito depois da opera��o ser efetuada
		System.out.println("h = " + h);
	
		
		
	}

}
