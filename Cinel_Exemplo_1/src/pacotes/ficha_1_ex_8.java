package pacotes;
import java.util.*;

public class ficha_1_ex_8 {

	public static void main(String[] args) {
		
		//String Oral, Reprovado, Aprovado;
		Float nota1, nota2, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Indique a sua primeira nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Indique a sua primeira nota: ");
		nota2 = ler.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("A média das duas notas é: " + media);
		
		if (media >= 7 && media <= 10)
		{
			System.out.println("A média do aluno é está entre sete e dez, tem de ir à avaliação ORAL");
		}
		else if (media < 7)
		{ 
			System.out.println("A média do aluno é inferior a sete, está REPROVADO!");
		}
		else if (media > 10)
		{
			System.out.println("A média do aluno é superior a 10, está APROVADO!");
		}
		else if (media > 20)
		{
			System.out.println("A média é superior a 20, insira valores válidos");
		}
		else
		{
			System.out.println("Insira as notas do primeiro e do segundo teste!");
		}	

	}

}
