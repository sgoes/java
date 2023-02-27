package pacotes;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inteiros = new Scanner(System.in);
	
		// Instância para a classe Televisao e para objeto
		Televisao dadosTv = new Televisao();
		
		System.out.println("Indique o volume da TV: ");
		dadosTv.volume = inteiros.nextInt();
		
		System.out.println("Indique o seu canal favorito: ");
		dadosTv.canal = inteiros.nextInt();
		
		System.out.println("Quantas horas costuma ver o seu canal favorito diariamente: ");
		dadosTv.horas = inteiros.nextInt();
		
		System.out.println("Qual é a distância em metros que se encontra da sua tv: ");
		dadosTv.distancia = inteiros.nextInt();
		
		
		// Metodo para analisar o volume da TV
		dadosTv.volumeTv(dadosTv.volume);
		
		// Metodo para analisar o canal favorito
		dadosTv.canalFavorito(dadosTv.canal);
		
		// Metodo para analisar o canal favorito
		dadosTv.horasCanal(dadosTv.horas);
		
		// Metodo para analisar a que distancia se encontra da tv
		dadosTv.distanciaTv(dadosTv.distancia);
		
	}

}
