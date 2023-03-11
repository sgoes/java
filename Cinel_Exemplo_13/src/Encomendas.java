import java.util.ArrayList;

public class Encomendas {
		
			// atributos
			String dataEncomenda;
			double precoProduto;
			String nomeProduto;
			String lojas;
			
			static ArrayList<String> baseDados = new ArrayList<String>();
			public Encomendas() {
				// TODO Auto-generated constructor stub
			}
			
			// metodo , vamos receber estes campos como parametros, sao enviados para aqui do inserirEncomendas
			
			public void GuardarEncomendas(String data, double preco, String nome, String loja) {
				this.dataEncomenda = data;
				this.precoProduto = preco;
				this.nomeProduto = nome;
				this.lojas = loja;
				
				String linha = this.dataEncomenda + ";" + this.precoProduto + ";" + this.nomeProduto + ";" + this.lojas;
				
				baseDados.add(linha);
				
			}
		
		}
