package pacotes;

public class Televisao {
		
	// São os atributos da classe Telivisao
	int canal, volume;
	int horas, distancia;
	
	// construtor
	public Televisao()
	{
		
	}
	
	// metodo que recebe o volume atual da tv
	public void volumeTv(int volumeMain)
	{
		this.volume = volumeMain;
		
		System.out.println("Este é o volume atual: " + (this.volume));
		if(this.volume >= 20)
		{
			System.out.println("Deve baixar o volume da TV");
		}
	}
	
	
	
	// metodo que recebe o canal favorito
	public void canalFavorito(int canalMain)
	{
		this.canal = canalMain;
		
		System.out.println("Este é o seu canal favorito: " + (this.canal));

	}
	
	
	// metodo que recebe o n.º horas
	public void horasCanal(int horasMain)
	{
		this.horas = horasMain;
		
		System.out.println("Este é número de horas: " + (this.horas) + "h que passa a assistir o seu canal favorito!");

	}
	
	// metodo distancia que se encontra da tv
	public void distanciaTv(int distanciaMain)
	{
		this.distancia = distanciaMain;
		
		System.out.println("Esta é a distância: " + (this.distancia) + "m que se encontra da sua Tv!");

	}
	
		

}


