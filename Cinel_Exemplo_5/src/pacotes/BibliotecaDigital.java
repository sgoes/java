package pacotes;

public class BibliotecaDigital {
	
	//atributos
	String nomeFilme;
	int anoFilme, minAnoFilme = 10000;
	double duracaoFilme, maxDuracaoFilme = 0;
	double classificacaoFilme, maxClassificacaoFilme = 0;
	int quantidadeFilme;
	
	public BibliotecaDigital() {
		// TODO Auto-generated constructor stub
	}
		
		
		public void GuardarDados(String nome, String ano, String duracao, String classificacao)
		{
		this.nomeFilme = nome;
		//conversão de uma string em inteiro
		
		this.anoFilme = Integer.parseInt(ano);
		//conversao de string para inteiro
		
		this.duracaoFilme = Double.parseDouble(duracao);
		// conversao de string para double
		
		this.classificacaoFilme = Double.parseDouble(classificacao);
		
		
		//incrementa sempre em uma unidade, é igual ao metodo abaixo
		//this.quantidadeFilme = quantidadeFilme + 1;
		++ this.quantidadeFilme;
		
		if(this.anoFilme <= this.minAnoFilme)
		{
			this.minAnoFilme = this.anoFilme;
		}
		
		if(this.duracaoFilme >= this.maxDuracaoFilme)
		{
			this.maxDuracaoFilme = this.duracaoFilme;
		}
		if(this.classificacaoFilme >= this.maxClassificacaoFilme)
		{
			this.maxClassificacaoFilme = this.classificacaoFilme;
		}
		
	}
	
	public void FilmeMaisAntigo()
	{
		
		System.out.println("O filme mais antigo é do ano de: " + this.minAnoFilme);
	}

	public void MelhorFilmeClassificado()
	{
		
		System.out.println("O filme melhor classificado é: " + this.maxClassificacaoFilme);
	}
	
	public void FilmeMaiorDuracao()
	{
		System.out.println("O filme com maior duração é: " + this.maxDuracaoFilme);
	}
	
}
