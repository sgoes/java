package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Medicos {
	static ArrayList<String> nomeMedico = new ArrayList<String>();
	static ArrayList<String> especialidadeMedico = new ArrayList<String>();
	static ArrayList<String> consulta = new ArrayList<String>();
	
	Scanner scanner = new Scanner(System.in);
	
	public void GuardarDados() {
		
		System.out.println("Indique o nome do médico: ");
		String nome = scanner.nextLine();
		nomeMedico.add(nome);
		
		System.out.println("Indique a especialidade do médico: ");
		String especialidade = scanner.nextLine();
		especialidadeMedico.add(especialidade);
	}
	
	public void MarcarConsulta() {
		int aux = 0;
		int posicao = 0;
		System.out.println("Insique o nome do medico que pretende");
		String nome = scanner.nextLine();
		
		for(int i=0; i < nomeMedico.size(); i++)
		{
			if(nome.equals(nomeMedico.get(i))) {
				aux = 1;
				nome = nomeMedico.get(i);
				posicao = i;
			}
			if(aux == 0) {
				System.out.println("O medico que pretende nao existe");
			}
			if(aux == 1)
			{
				System.out.println("Indique o seu nome para amarcação da especialidade:" + especialidadeMedico.get(posicao) + "com o médico" + nomeMedico.get(posicao));
				String utente = scanner.nextLine();
				String linha = utente + ";" + nomeMedico.get(posicao) + ";" + especialidadeMedico.get(posicao);
			}
		}
	}

}
