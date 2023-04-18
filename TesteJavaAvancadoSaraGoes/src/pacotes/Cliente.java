package pacotes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	// atributos
	String NIF;
	String nome;
	String email;
	
	// objeto para manipular os dados enquanto a app estiver ativa
	static ArrayList<String> dadosCliente = new ArrayList<String>();
	
	// métodos
	public void BaseDadosClientes(int NIF, String nome, String email) {
		this.NIF = Integer.toString(NIF);
		this.nome = nome;
		this.email = email;
		
		Boolean verifica = false;
		
		// Concatenar dados cliente numa linha
		String linha = this.NIF + ";" + this.nome + ";" + this.email;
		
		if(dadosCliente.size() == 0)
		{
			dadosCliente.add(linha);
			JOptionPane.showMessageDialog(null, "Dados guardados", "Informação", JOptionPane.INFORMATION_MESSAGE);
		}else {
			for(int i = 0; i < dadosCliente.size(); i++) {
				
				// separar os dados no arraylist de forma a obter apenas o NIF
				String[] coluna = dadosCliente.get(i).split(";");
				if(this.NIF.equals(coluna[0])) {
					JOptionPane.showMessageDialog(null, "Esse cliente já existe, por favor verifique o NIF", "Aviso", JOptionPane.INFORMATION_MESSAGE);
					verifica=true;
				}
				if(verifica == false)
				{
					dadosCliente.add(linha);
					JOptionPane.showMessageDialog(null, "Dados guardados!", "Informação", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		}
	}

}
