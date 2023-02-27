package pacotes;

public class Carro extends Veiculo {

	// Atributos
	int numLugCarro;
	int numPortasCarro;
	double numKmCarro;

	
	public void MostraCarro(String marca, String modelo, double preco, int lugares, int portas, double km) 
	{
		this.numLugCarro = lugares;
		this.numPortasCarro = portas;
		this.numKmCarro = km;
		this.marcaVeiculo = marca;
		this.modeloVeiculo = modelo;
		this.precoVeiculo = preco;
		
		// Mostrar dados os dados referentes ao carro no main
		System.out.println("Os dados de registo da carro são os seguintes:");
		System.out.println("O modelo do carro é: " + this.modeloVeiculo );
		System.out.println("A marca do carro é: : " + this.marcaVeiculo);
		System.out.println("O preço do carro é: : " + this.precoVeiculo );
		System.out.println("O carro tem: " + this.numLugCarro + " lugares");
		System.out.println("O carro tem:" + this.numPortasCarro + " portas");
		System.out.println("O carro tem:" + this.numKmCarro + " km");
		
	}


}
