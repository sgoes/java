package pacotes;
import java.util.*;

public class Legumes {
	
	Scanner ler = new Scanner(System.in);
	Scanner lerInt = new Scanner(System.in);
	
	int ervilhasQ = 0;
	int brocolosQ = 0;
	int espinafresQ = 0;
	
	// Atributos preços para os legumes
	int ervilhasP = 2;
	int brocolosP = 3;
	int espinafresP = 4;
	
	int totalErvilhas;
	int totalBrocolos;
	int totalEspinafres;
	int totalLegumes;

	public Legumes() {
		// TODO Auto-generated constructor stub
	}
	
	public void GuardaLegumes(String respostaL, int respostaLQ) 
	{
		if(respostaL.equals("1"))
		{
			this.ervilhasQ += respostaLQ;
			System.out.println("Tem a pagar" + totalErvilhas + "€ pelas ervilhas");
			
		}
		else if(respostaL.equals("2"))
		{
			this.brocolosQ += respostaLQ;
			System.out.println("tem: " + brocolosQ + " brocolos no carrinho");
			
			totalBrocolos = this.brocolosP *= this.brocolosQ;
			System.out.println("Tem a pagar: " + totalBrocolos + "€ pelos brocolos");
		}
		else if(respostaL.equals("3"))
		{
			this.espinafresQ += respostaLQ;
			System.out.println("tem: " + espinafresQ + " brocolos no carrinho");
			
			totalEspinafres = this.espinafresP *= this.espinafresQ;
			System.out.println("Tem a pagar: " + totalEspinafres + "€ pelos espinafres");
		}
		else
		{
			System.out.println("Opção inválida");
		}		

	}
	public void resumoFruta()
	{
		this.totalLegumes = this.totalErvilhas + this.totalBrocolos + this.totalEspinafres;
		System.out.println("No total da fruta tem a pagar: " + this.totalLegumes + "€");
	}

}
