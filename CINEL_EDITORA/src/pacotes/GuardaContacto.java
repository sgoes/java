package pacotes;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class GuardaContacto {

	public GuardaContacto() {
		// TODO Auto-generated constructor stub
	}
	
	String nomeC;
	String telefoneC;
	String emailC;
	String grupoC;
	
	public void GuardaContactos(String nome, String telefone, String email, String grupo) {
		this.nomeC = nome;
		this.telefoneC = telefone;
		this.emailC = email;
		this.grupoC = grupo;
		
		//Linha para guardar os dados inseridos pelo utilizador
		String linha = this.nomeC + ";" + this.telefoneC + ";" + this.emailC + ";" + this.grupoC + "\n";
		
		try {
			//Apontador para escrever elementos no ficheiro
			FileWriter ficheiro = new FileWriter("C:\\docs\\cinel_editora\\docs\\contactos.txt",true);
			
			//Apontador para poder escrever
			BufferedWriter escreve = new BufferedWriter(ficheiro);
			escreve.write(linha);
			escreve.close();
			ficheiro.close();
			JOptionPane.showMessageDialog(null, "Dados guardados no ficheiro com sucesso");
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Algo correu mal, contacte o administrador!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
