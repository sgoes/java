package pacotes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Consulta {

	// atributos
	String nomeUtente;
	String nomeMedico;
	String dataConsulta;
	String especialidade;
	
	
	
	
	
	public Consulta() {
		// TODO Auto-generated constructor stub
	}
	
	// metodos que me permitem guardar dados 
	public void MarcarConsulta2(String utente, String medico, String especialidade, String data) // vai receber estes metodos
	{
		// associar dados entre classes
		this.nomeUtente = utente;
		this.nomeMedico = medico;
		this.especialidade = especialidade;
		this.dataConsulta = data;
		
		// Usar a linha para guardar os dados todos 
		String linha = " " + this.nomeUtente + ";" + this.nomeMedico + ";" + this.especialidade + ";" + this.dataConsulta + "\n";
		
		try {
			
			FileWriter ficheiro = new FileWriter("C:\\docs\\ficheiros\\marcarConsultas.txt", true);
			
			// Apontador para oder escrever
			BufferedWriter escreve = new BufferedWriter(ficheiro);
			escreve.write(linha);
			escreve.close();
			ficheiro.close();
			JOptionPane.showMessageDialog(null, "Dados guardados no ficheiro com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
			
			
			
			
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Algo correu mal, contacte o administrador!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public void LerDadosFicheiro() {
		
	}

}
