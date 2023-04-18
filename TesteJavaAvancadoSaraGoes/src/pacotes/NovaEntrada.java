package pacotes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NovaEntrada {
	
	//atributos
	
	String dataEntrada;
	String matricula;
	String ccCliente;
	String nomeCliente;
	String folhaServiço;
	int preço;
	

	// ArrayList DADOSREPAÇÕES que vai receber os dados 
	static ArrayList<String> dadosAlugar = new ArrayList<String>();
	
	public NovaEntrada() {
		// TODO Auto-generated constructor stub
	}

	
	//método
	
	public void BaseDadosAlugar(String data, String matricula, String CC, String nome, String serviço,int valor )
	{
		this.dataEntrada = data;
		
		this.matricula = matricula;
		
		this.ccCliente = CC;
		
		this.nomeCliente = nome;
		
		this.folhaServiço = serviço;
		
		this.preço = valor;
		
		String linha = this.dataEntrada +";"+this.matricula+";"+this.ccCliente+";"+this.nomeCliente+";"+this.folhaServiço+";"+this.preço;
		
		dadosAlugar.add(linha);
		
		JOptionPane.showMessageDialog(null, "Os dados foram guardados com sucesso !", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
