package pacotes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Funcionarios {

	public Funcionarios() {
		// TODO Auto-generated constructor stub
	}
	
	// atributos
	String codigoFunc;
	String nomeFunc;
	
	// ArrayList para guardar os dados dos funcionarios
	static ArrayList<String>dadosFuncionario = new ArrayList<String>();
	
	// metodos
	// declarar um so metodo para verificr e um outro para guardar
	public void BaseDadosFuncionarios(int codigo, String nome) {
		this.codigoFunc = Integer.toString(codigo);
		this.nomeFunc = nome;
		
		// variavel para alterar o estado
		Boolean verifica = false;
		
		String linha = " " + this.codigoFunc + ";" + this.codigoFunc;
		// verificar se o CodigoFunc já existe
		if(dadosFuncionario.size()==0) {
			dadosFuncionario.add(linha);
		}else {
			//verificar se o codfunc ja existe
			for(int i = 0; i < dadosFuncionario.size(); i++) {
				String[] coluna = dadosFuncionario.get(i).split(";");
				
				if(this.codigoFunc.equals(coluna[0].trim())) {
					JOptionPane.showMessageDialog(null, "Esse funcionario já existe", "AVISO", JOptionPane.INFORMATION_MESSAGE);
				}
				if(verifica == false) {
					dadosFuncionario.add(linha);
					JOptionPane.showMessageDialog(null, "Dados do funcionário guardados com sucesso");
				}
			}
		}
	}

}
