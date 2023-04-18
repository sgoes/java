package pacotes;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

	
		
		public class FicheiroAluguer {
		
			public FicheiroAluguer() {
				// TODO Auto-generated constructor stub
			}
		
				public void EscreverFicheiroAluguer() {
					try {
						
						File ficheiro = new File("C:\\docs\\cinel_cars\\ficheiros\\aluguer.txt");
						FileWriter escrever = new FileWriter(ficheiro);
						
						BufferedWriter wr = new BufferedWriter(escrever);
						
						for(int i = 0; i < NovoAluguer.DadosAluguer.size(); i++) {
							wr.write(" " + NovoAluguer.DadosAluguer.get(i));
							wr.newLine();
						}
						wr.close();
						escrever.close();
						
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Erro de escrita, por favor contacte o administrador!", "ERRO", JOptionPane.ERROR_MESSAGE);
					}
		}
		
		public void LerFicheiroAluguer() {
			
			try {
				FileReader ler = new FileReader("C:\\docs\\cinel_cars\\ficheiros\\aluguer.txt");
				BufferedReader leitura = new BufferedReader(ler);
				
				while(leitura.read() != -1) {
				
					NovoAluguer.DadosAluguer.add(leitura.readLine());
				}
				
				leitura.close();
				ler.close();
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro de escrita, por favor contacte o administrador!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		}

}
