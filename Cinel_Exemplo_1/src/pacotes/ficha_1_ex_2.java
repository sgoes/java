package pacotes;
import java.util.*;


public class ficha_1_ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float bmaior, bmenor, altura;
		float atrapezio;
		
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Indique a base maior: ");
		bmaior = ler.nextFloat();
		
		System.out.println("Indique a base menor: ");
		bmenor = ler.nextFloat();
		
		System.out.println("Indique a altura: ");
		altura = ler.nextFloat();
		
		atrapezio = bmaior + bmenor * (altura / 2);
		
		System.out.println("A área do trapézio é: " + atrapezio);
		

	}

}
