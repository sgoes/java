package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Medico {

	public Medico() {
		// TODO Auto-generated constructor stub
	}
	// Instanciar scanner
	Scanner scanner = new Scanner(System.in); 
	
	
	// Instanciar objetos de classes
	Consulta consulta = new Consulta();
	Cliente cliente = new Cliente();
	
	// ArrayList para armazenar os dados do cliente
	static ArrayList<String> dadosMedico = new ArrayList<String>();
	
	// Atributos
	String nomeMedico;
	String NIFMedico;
	String especialidade;
	
	String juntaDadosMedico;
	
	public void GuardaDadosMedico() {
		System.out.println("Insira o nome do médico: ");
		nomeMedico = scanner.nextLine();
		
		System.out.println("Insira o NIF do médico: ");
		NIFMedico = scanner.nextLine();
		
		System.out.println("Insira a especilidade do médico: ");
		especialidade = scanner.nextLine();
		
		juntaDadosMedico = ("O nome do médico é: " + nomeMedico + "\n O NIF do médico é:  "  + NIFMedico  + " \n A especialidade do médico é:  "  + especialidade );
		dadosMedico.add(juntaDadosMedico);
		
		System.out.println(dadosMedico);
		
	}
	
}
