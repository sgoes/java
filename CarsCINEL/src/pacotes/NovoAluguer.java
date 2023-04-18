package pacotes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NovoAluguer {

	public NovoAluguer() {
		// TODO Auto-generated constructor stub
	}
	
	// Atributos
	String dataLevantamento;
	String matricula;
	String NIFCliente;
	String nomeCliente;
	String fichaAluguer;
	int preço;

	static ArrayList<String>DadosAluguer = new ArrayList<String>();
	
	public void BaseDadosAluguer(String data, String matricula, String NIF, String nome, String ficha, int valor) {
		
		this.dataLevantamento = data;
		this.matricula = matricula;
		this.NIFCliente = NIF;
		this.nomeCliente = nome;
		this.fichaAluguer = ficha;
		this.preço = valor;
		
		String linha = this.dataLevantamento + ";" + this.matricula + ";" + this.NIFCliente + ";" + this.nomeCliente + ";" + this.fichaAluguer + ";" + this.preço;
		
		DadosAluguer.add(linha);
		
		JOptionPane.showMessageDialog(null, "Os dados foram guardados com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
}

