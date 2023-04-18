package pacotes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Medicos {

	// Atributos
	String nomeMedico;
	String especialidadeMedico;
	
	public Medicos() {
		// TODO Auto-generated constructor stub
	}
	
	public void MedicoInserir(String medico, String especialidade) {
		// associar dados entre classes
		this.nomeMedico = medico;
		this.especialidadeMedico = especialidade;
		
		// Usar a linha para guardar os dados todos
		// é necessário adicionar um "espaço" à minha string linha para posteriormente os dados serem lidos corretamente
		String linha =" " + this.nomeMedico + ";" +  this.especialidadeMedico + "\n";
		
		try {
		// FileWriter serve para escrever no ficheiro
		FileWriter ficheiro = new FileWriter("C:\\docs\\ficheiros\\medico.txt", true);
		
		// Apontador para  escrever dados
		BufferedWriter escreve = new BufferedWriter(ficheiro);
		
		escreve.write(linha);
		escreve.close();
		ficheiro.close();
		JOptionPane.showMessageDialog(null, "Dados guardados no ficheiro com sucesso!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Algo correu mal, contacte o administrador!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void LerDadosFicheiro() {
		
		try {
			// vou tentar ler os dados do ficheiro FileReader serve para ler
			FileReader ler = new FileReader("C:\\docs\\ficheiros\\medico.txt"); // Aqui crio o objeto para "ler" os dados que estão dentro do file
			BufferedReader dados = new BufferedReader(ler); // isto funciona um bocado como a logica do Scanner // Aqui leio mesmo os dados, através do objeto BufferedReader
			
			// enquanto houver dados nós vamos ler dados
			
			while(dados.read() != -1) {
				// vou criar uma String list - para conseguir mostrar os dados à medida que estou a lê-los // esta String linha é diferente da outra dado que está dentro de outro método
				// Agora tenho de separar os campos
				String[] linha = dados.readLine().split(";");
				// o JOptionPane aquivale a System.out.println, mas aqui  funciona para a lógica  do design
				JOptionPane.showMessageDialog(null, linha[1]); 
				
				// Agora tenho de separar os campos
		
			}
			
	
			}catch(Exception e) {
		
			}
		} 
	}

