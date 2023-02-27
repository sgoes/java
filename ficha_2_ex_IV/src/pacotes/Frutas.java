package pacotes;
import java.util.*;

public class Frutas {
	// Ler, guardar e atribuir respostas inseridas pelo utilizador às variaveis
	Scanner ler = new Scanner(System.in);
	Scanner inteiros = new Scanner(System.in);
	
	// Atributos para a quatidade de frutos
	int bananasQ = 0;
	int morangosQ = 0;
	int abacatesQ = 0;
	
	// Atributos para o preço dos frutas
	int bananaP = 5;
	int morangosP = 2;
	int abacatesP = 3;
	int totalBananas;
	int totalMorangos;
	int totalAbacates;
	int totalFruta = 0;


	public Frutas() {
		// TODO Auto-generated constructor stub
	}
	
	public void GuardaFrutas(String respostaF, int respostaFQ)
	{
		
		if(respostaF.equals("1"))
		{
			this.bananasQ += respostaFQ;
			System.out.println("tem: " + bananasQ + " bananas no carrinho");
			
			totalBananas = this.bananaP *= this.bananasQ;
			System.out.println("Tem a pagar: " + totalBananas + "€ pelas bananas");
		}
		else if(respostaF.equals("2"))
		{
			this.morangosQ += respostaFQ;
			System.out.println("tem: " + morangosQ + " morangos no carrinho");
			
			totalMorangos = this.morangosP *= this.morangosQ;
			System.out.println("Tem a pagar: " + totalMorangos + "€ pelos morangos");
		}
		else if(respostaF.equals("3"))
		{
			this.abacatesQ += respostaFQ;
			System.out.println("tem: " + abacatesQ + " abacates no carrinho");
			
			totalAbacates = this.abacatesP *= this.abacatesQ;
			System.out.println("Tem a pagar: " + totalAbacates + "€ pelos abacates");
		}
		else
		{
			System.out.println("Opção inválida");
		}		

	}
	
	public void resumoFruta()
	{
		this.totalFruta = this.totalBananas + this.totalMorangos + this.totalAbacates;
		System.out.println("No total da fruta tem a pagar: " + this.totalFruta + "€");
	}
	



}



