package pacotes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	// atributos
	String NIF;
	String nomeCliente;
	String emailCliente;

	// ArayList para guardar os dados dos clientes
	static ArrayList<String>dadosCliente = new ArrayList<String>();
	
	// métodos
	// vai ser declarado um so metodo um para verificar e um para guardar
	public void BaseDadosClientes(int NIF, String nome, String email) {
		
		this.NIF = Integer.toString(NIF);
		this.nomeCliente = nome;
		this.emailCliente = email;
		
		// variavel para alterar o estado, caso seja falso, é sinal que o cliente não é repetido e entao podemos adcionar os elementos ao arrayList
		Boolean verifica = false;
		
		
		String linha = " " + this.NIF + ";" + this.nomeCliente + ";" + this.emailCliente;
		
		// verificar se o NIF existe
		if(dadosCliente.size()==0)
		{
			dadosCliente.add(linha);
		} else {
			// verificar se já existe o NIF
			for(int i = 0; i < dadosCliente.size(); i++) {
				
				// primeiro preciso de separar o NIF do resto da linha, o NIF correponde à posição 0
				String[] coluna = dadosCliente.get(i).split(";");
					
				// vou comparar se o NIF ja existe
				if(this.NIF.equals(coluna[0].trim())) {
					JOptionPane.showMessageDialog(null, "Esse cliente já existe!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
					verifica = true;
				}
				if(verifica == false) {
					dadosCliente.add(linha);
					JOptionPane.showMessageDialog(null, "Dados guardados com sucesso!");
				}
			}
		}
		
	}
}
