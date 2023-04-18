package pacotes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FicheiroCliente {
	
	
	public FicheiroCliente() {
		// TODO Auto-generated constructor stub
	}
	

	
	public void EscreverFicheiroCliente()
	{
		
		try {
			
			File ficheiro = new File("C:\\docs\\cinel_cars\\ficheiros\\clientes.txt");
			
			FileWriter escrever = new FileWriter(ficheiro);
			
			BufferedWriter wr = new BufferedWriter(escrever);
			
			for(int i=0; i< Cliente.dadosCliente.size(); i++)
			{
				wr.write(" " + Cliente.dadosCliente.get(i));
				wr.newLine();
			}
			
			wr.close();
			
			escrever.close();
			
			
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Erro de escrita, por favor contacte o Administrador !", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
		public void LerFicheiroCliente()
		{
			
			try {
				
				FileReader ler = new FileReader("C:\\docs\\cinel_cars\\ficheiros\\clientes.txt");
				
				BufferedReader leitura = new BufferedReader(ler);
				
				while(leitura.read() != -1)
				{
							
					Cliente.dadosCliente.add(leitura.readLine());
					
				}
				
				leitura.close();
				ler.close();
				
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Erro de escrita, por favor contacte o Administrador !", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	
