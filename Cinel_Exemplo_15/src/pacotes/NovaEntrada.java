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
	
	static ArrayList<String> dadosReparações = new ArrayList<String>();
	
	public NovaEntrada() {
		// TODO Auto-generated constructor stub
	}

	
	//método
	
	public void BaseDadosReparações(String data, String matricula, String CC, String nome, String serviço,int valor )
	{
		this.dataEntrada = data;
		
		this.matricula = matricula;
		
		this.ccCliente = CC;
		
		this.nomeCliente = nome;
		
		this.folhaServiço = serviço;
		
		this.preço = valor;
		
		String linha = this.dataEntrada +";"+this.matricula+";"+this.ccCliente+";"+this.nomeCliente+";"+this.folhaServiço+";"+this.preço;
		
		dadosReparações.add(linha);
		
		JOptionPane.showMessageDialog(null, "Os dados foram guardados com sucesso !", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}