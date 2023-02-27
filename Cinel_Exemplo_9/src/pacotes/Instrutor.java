package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Instrutor {
	
	// atributos para o instrutor
	String nomeInstrutor;
	String nibInstrutor;

	Scanner lerString = new Scanner(System.in);

	public Instrutor() {
		// TODO Auto-generated constructor stub
	}
	
	ArrayList<String> novoInstrutor = new ArrayList<String>();
	
	public void GuardarDadosInstrutor(String nomeInstrutorM, String CCInstrutorM, int anoNasInstrutorM)
	{
		this.nomeInstrutor = nomeInstrutorM;
		this.CCInstrutor = CCInstrutorM;
		this.anoNasInstrutor = anoNasInstrutorM;
		
		String linhaInstrutor = this.nomeInstrutor + ";" + this.CCInstrutor + ";" + this.anoNasInstrutor;
		
		novoInstrutor.add(linhaInstrutor);
	}
	
	public void MostrarDadosInstrutor()
	{
		for(int i = 0; i<novoInstrutor.size(); i++)
		{
			System.out.println(novoInstrutor.get(i));
		}
	}
	
	public void AtualizarDadosInstrutor()
	{
		int aux = 0;
		System.out.println("Indique o nome do instrutor que pretende atualizar: ");
		this.nomeInstrutor = lerString.nextLine();
		
		for(int i = 0; i<novoInstrutor.size(); i++)
		{
			String dadosInstrutor = novoInstrutor.get(i);
			
			String separadorInstrutor = ";";
			
			String[] xColunasInstrutor = dadosInstrutor.split(separadorInstrutor);
			
			if(this.nomeInstrutor.equals(xColunasInstrutor[0]))
			{
				System.out.println("Indique o novo CC do instrutor: " + xColunasInstrutor[0]);
				this.CCInstrutor = lerString.nextLine();
				
				String linhaInstrutor = xColunasInstrutor[0] + ";" + xColunasInstrutor[1] + ";"  + this.CCInstrutor;
				
				novoInstrutor.set(i, linhaInstrutor);
				aux = 1;
			}
			if(aux == 0)
			{
				System.out.println("O instrutor que pretende atualizar nao existe");
			}
		}
	}

}
