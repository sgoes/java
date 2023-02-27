package pacotes;

public class Trabalhador {
	
		// Declaro os atributos
		String genero, localidade;
		int idade;
		
		// construtor
		public Trabalhador() {
			// TODO Auto-generated constructor stub
		}
		
		// metodo // o void não devolve nada... depois vamos perceber isto
		public void MostrarDadosPessoa()
		{
			System.out.println("Os dados inseridos foram os seguintes:\n Nome: " + this.genero + "\n Idade: " + this.idade + "\n Localidade: " + this.localidade);
			
		}
		
		// metodo que recebe parametro um valor que é enviado da class Main
		public void IdadeReforma(int idadeMain)
		{
			this.idade = idadeMain;
			System.out.println("Falta-lhe: " + (67 - this.idade) + " para a reforma!");
		}
		
		// metodo consoante o genero
		public void AnalisaGenero()
		{
			if(this.genero.equals("feminino") || this.genero.equals("Feminino"))
			{
				System.out.println("Seja benvinda!");
			}
			else if(this.genero.equals("masculino") || this.genero.equals("Masculino"))
			{
				System.out.println("Seja benvindo!!");
			}
			else
			{
				System.out.println("Género inválido");
			}
		}
		
		// metodo localidade cinel
		public void localidadeCinel()
		{
			if(this.localidade.equals("Porto") || this.localidade.equals("porto"))
			{
				System.out.println("Parabéns! Pode inscrever-se num centro CINEL");
			}
			else
			{
				System.out.println("Não se encontra numa localidade CINEL!");
			}
		}
}





