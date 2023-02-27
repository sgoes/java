package pacotes;

public class Motas extends Veiculo{
	
	// Atributos
	String anoMota;
	String corMota;

	public Motas() {
		// TODO Auto-generated constructor stub
	}
	
	public void MostraMota(String marca, String modelo, double preco, String ano, String cor)
	{
		this.anoMota = ano;
		this.corMota = cor;
		this.marcaVeiculo = marca;
		this.modeloVeiculo = modelo;
		this.precoVeiculo = preco;
		
		// Mostrar dados os dados referentes à mota no main
		System.out.println("Os dados de registo da mota são os seguintes:");
		System.out.println("Ano da mota: " + this.anoMota);
		System.out.println("A côr da mota é: " + this.corMota);
		System.out.println("A marca da mota é: " + this.marcaVeiculo );
		System.out.println("O modelo da mota é:" + this.modeloVeiculo);
		System.out.println("O preço da mota é: " + this.precoVeiculo);
	}
	
	// Outro método de chamar métodos da classe mãe
	//super.MostarClasseVeiculo();

}
