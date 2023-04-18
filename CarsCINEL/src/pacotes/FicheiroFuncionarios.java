package pacotes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FicheiroFuncionarios {

	public FicheiroFuncionarios() {
		// TODO Auto-generated constructor stub
	}
	public void EscreverFicheiroFuncionarios() {
		try {
			
			File ficheiro = new File("C:\\docs\\cinel_cars\\ficheiros\\funcionarios.txt");
			FileWriter escrever = new FileWriter(ficheiro);
			
			BufferedWriter wr = new BufferedWriter(escrever);
			
			for(int i = 0; i < Funcionarios.dadosFuncionario.size(); i++) {
				wr.write(" " + Funcionarios.dadosFuncionario.get(i));
				wr.newLine();
			}
			wr.close();
			escrever.close();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro de escrita, por favor contacte o administrador!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void LerFicheiroFuncionario() {
		
		try {
			FileReader ler = new FileReader("C:\\docs\\cinel_cars\\ficheiros\\funcionarios.txt");
			BufferedReader leitura = new BufferedReader(ler);
			
			while(leitura.read() != -1) {
			
				Funcionarios.dadosFuncionario.add(leitura.readLine());
			}
			
			leitura.close();
			ler.close();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro de escrita, por favor contacte o administrador!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}

}
