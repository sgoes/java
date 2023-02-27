package pacotes;
import java.util.*;

public class ficha_1_ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float peso, altura;
		float imc;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o seu peso: ");
		peso = ler.nextFloat();
		
		System.out.println("Insira a sua altura: ");
		altura = ler.nextFloat();
		
		imc = (peso/(altura*altura));
		
		System.out.println("O seu IMC é: " + imc);
		
		if (imc < 20)
		{ 
			System.out.println("Está a baixo do peso!");
		}
		else if (imc >= 20 && imc <= 24)
		{ 
			System.out.println("Peso normal!");
		}
		else if (imc == 25 && imc == 29)
		{ 
			System.out.println("Sobre peso!");
		}
		else if (imc == 30 && imc <= 39)
		{ 
			System.out.println("Obeso!");
		}
		else if (imc > 40)
		{
			System.out.println("Obeso mórbido");
		}
		else
		{
			System.out.println("Insira valores válidos");
		}


	}

}
