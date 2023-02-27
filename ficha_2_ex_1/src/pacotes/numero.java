package pacotes;

public class numero {
	// Declaracao de atributos:
    int numeroUtilizador;

	public numero() {
		// TODO Auto-generated constructor stub
	}
    // Metodo para analisar o converter em texto o numero inserido
    public void analisaNumero() {
        if(this.numeroUtilizador == 1) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : um");
        }
        else if(this.numeroUtilizador == 2) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : dois");
        }
        else if(this.numeroUtilizador == 3) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : três");
        }
        else if(this.numeroUtilizador == 4) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : quatro");
        }
        else if(this.numeroUtilizador == 5) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : cinco");
        }
        else if(this.numeroUtilizador == 6) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : seis");
        }
        else if(this.numeroUtilizador == 7) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : sete");
        }
        else if(this.numeroUtilizador == 8) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : oito");
        }
        else if(this.numeroUtilizador == 9) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : nove");
        }
        else if(this.numeroUtilizador == 10) {
            System.out.println("O numero inserido foi o " + numeroUtilizador + " : dez");
        }
        else {
            System.out.println("Numero inserido inválido, apenas introduza numeros de 1 a 10");
        }
    }

}
