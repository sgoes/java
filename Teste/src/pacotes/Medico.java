package pacotes;

import java.util.ArrayList;
import java.util.Scanner;

public class Medico {

	public Medico() {
		// TODO Auto-generated constructor stub
	}
	// Instanciar scanner
	Scanner scanner = new Scanner(System.in); 
	
	

	
	// ArrayList para armazenar os dados do cliente
	static ArrayList<String> dadosMedico = new ArrayList<String>();
	
	// Atributos
	private String nomeMedico;
	private String NIFMedico;
	private String especialidade;
	
	
	
	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getNIFMedico() {
		return NIFMedico;
	}

	public void setNIFMedico(String nIFMedico) {
		NIFMedico = nIFMedico;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	// Instanciar objetos de classes
	Consulta consulta = new Consulta();
	Cliente cliente = new Cliente();
	
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
		
		//System.out.println(dadosMedico);
		
		
	}
	
	public void MostrarMedicos() {
		for(int i  = 0; i < dadosMedico.size(); i++) {
			System.out.println(dadosMedico.get(i));
		}
	}
	
	public void MarcarConsulta() {
		System.out.println("Insira o nome do médico com quem pretente marcar a consulta");
		String nomeMedicoPretendido = scanner.nextLine(); 
		if(nomeMedicoPretendido.equals(nomeMedico)) {
			for(int i = 0; i < dadosMedico.size();) {
				System.out.println("O médico indicado está disponível!");
				break;
				}
		}else {
			System.out.println("Médico não se encontra registado");
		}
			
				System.out.println("Insira a especialidade pretendida: ");
				String especialidadePrentendida = scanner.nextLine();
				if(especialidadePrentendida.equals(especialidade) && (nomeMedico.equals(nomeMedicoPretendido))){
					for(int j = 0; j < dadosMedico.size();) {
						System.out.println("Consulta agendada.");
						break;
				}
				}else {
					System.out.println("O médico pretendido não exerce essa especialidade.");
				}

		

	}
	
}
