import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {

	//atributos
	
	String CC;
	String nomeCompleto;
	String dataNascimento;
	
	//utilizo o arraylist para poder manipular os dados enquanto a aplicação estiver ativa
	static ArrayList<String> dadosCliente = new ArrayList<String>();
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	
	//métodos
	public void BaseDadosClientes(int CC, String nome, String data)
	{
		
		this.CC = Integer.toString(CC);
		this.nomeCompleto = nome;
		this.dataNascimento = data;
		
		//int verifica = 0;
		Boolean verifica = false;
		
		String linha = this.CC + ";" + this.nomeCompleto + ";" + this.dataNascimento;
		
		//JOptionPane.showMessageDialog(null,dadosCliente.size());
		
		if(dadosCliente.size() == 0)
		{
			dadosCliente.add(linha);
			JOptionPane.showMessageDialog(null, "Dados Guardados ! - Size 0", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
		}
		else
		{
			for(int i =0; i<dadosCliente.size(); i++)
			{
				//vou separar os dados guardados no ArrayList, para aceder ao CC
				String[] coluna = dadosCliente.get(i).split(";"); 
				
				if(this.CC.equals(coluna[0]))
				{
					JOptionPane.showMessageDialog(null, "Esse cliente já existe, por favor verifique o CC !", "AVISO", JOptionPane.INFORMATION_MESSAGE);
					verifica = true;
				}
				
			}
			
			if(verifica == false)
			{
				dadosCliente.add(linha);
				JOptionPane.showMessageDialog(null, "Dados Guardados !", "INFORMAÇÃO", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
		
		
		
	}

}
