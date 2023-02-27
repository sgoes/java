package pacotes;
import java.util.ArrayList;
import java.util.Scanner;

public class Medico {

	// atributos
	private String nomeMedico;
	private String especialidadeMedico;
	private String nifMedico;
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> medicos = new ArrayList<String>();
	ArrayList<String> especialidades = new ArrayList<String>();
	ArrayList<String> nif = new ArrayList<String>();
	
	public String getNomeMedico() {
		return nomeMedico;
	}
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
		
	}
	
	
	public String getEspecialidadeMedico() {
		return especialidadeMedico;
	}
	public void setEspecialidadeMedico(String especialidadeMedico) {
		this.especialidadeMedico = especialidadeMedico;
	}
	
	
	public String getNifMedico() {
		return nifMedico;
	}
	public void setNifMedico(String nifMedico) {
		this.nifMedico = nifMedico;
	}


	// metodos - receber novo medico
	
	public void dadosMedico() {
		System.out.println("Insira o nome do médico: ");
		nomeMedico = scanner.nextLine();
		
		medicos.add(nomeMedico);
		
		System.out.println("Insira a sua especialidade: ");
		especialidadeMedico = scanner.nextLine();
		
		especialidades.add(especialidadeMedico);
		
		System.out.println("Insira o seu nif: ");
		nifMedico = scanner.nextLine();
		
		nif.add(nifMedico);	
	}
	
	public void mostaMedico() {
		for(int i = 0; i < medicos.size(); i++) {
			System.out.println(medicos.get(i));
			break;
		}
		
	}
		
}
	
