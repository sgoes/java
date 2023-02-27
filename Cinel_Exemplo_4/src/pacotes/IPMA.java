package pacotes;

public class IPMA {
	
	// Atributos
	private String localidade;
	private int temperatura;
	int max = -1000; // o max iniciliza-se com valores muito baixos - para garantir que estou a salvaguardar sempre o valor maximo inserido
	int min = 1000;// o min inicializa-se com valores muito altos - para garantir que o que entr
	String localidadeTempMax;
	

	public IPMA() {
		// TODO Auto-generated constructor stub
	}
	
	// Metodos
	public void GuardarDados(String localidadePrincipal, int temperaturaPrincipal) // vem da classe principal
	{
		
		this.localidade = localidadePrincipal;  // assume o valor que vem da classe principal
		this.temperatura = temperaturaPrincipal; // os valores que vêm da classe princial
		
		// determinar o valor da maior temperatura inserida 
		if(this.temperatura > max)
		{
			this.max = this.temperatura;
			this.localidadeTempMax = this.localidade;
		}
		
		// determinar o valor da menor temperatura inserida
		if(this.temperatura < min)
		{
			this.min = this.temperatura;
		}
		
	}
	
	// Metodo que devolve um valor inteiro
	public  int MostrarTemperaturaMax()
	{
		return this.max;
	}
	
	public int MostrarTemperaturaMin()
	{
		return this.min;
	}
	
	public String MostrarLocalidadePrincipal()
	{
		return this.localidade;
	}
	
	// alternativa
	public void MostrarTemperaturaMaxAlternativa()
	{
		System.out.println("A temperatura máxima é de: " + this.max);
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}


	



}
