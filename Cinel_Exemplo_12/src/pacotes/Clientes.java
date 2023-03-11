package pacotes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Clientes {

	// Atributos
	String nomeCliente;
	String localidadeCliente;
	String generoCliente;
	
	// o static faz com que seja único em todo o meu arrayList
	static ArrayList<String> baseDados = new ArrayList<String>();
	static ArrayList<String>clienteLisboa = new ArrayList<String>();
	
	public Clientes() {
		// TODO Auto-generated constructor stub
	}
	
	// método
	
	public void GuardarDadosClientes(String nome, String localidade, String genero) { 
		
		// O metodo vai recebe aqueles três dados da classe principal - guardar --- associar 
		// estou a apontar para o objeto desta classe
		this.nomeCliente = nome;
		this.localidadeCliente = localidade;
		this.generoCliente = genero;
		
		// vou adicionar um arrayList para guardar os dados todos, para depois conseguir mostrá-los
		String linha = this.nomeCliente + "; "  + this.localidadeCliente + "; " + this.generoCliente;
		// carrego os dados todos da linha - no arrayList baseDados
		baseDados.add(linha);
	}
	
	public void TotalClientesGuardados() {
		// mostra o número de clientes guardados até ao momento
		JOptionPane.showMessageDialog(null, "Estão guardados até ao momento: " + baseDados.size() + " clientes");
	}
	

	
	

}
