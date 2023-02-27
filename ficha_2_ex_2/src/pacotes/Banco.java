package pacotes;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

        // Instaciar classe
        ContasBancarias dadosConta = new ContasBancarias();
        // "new" serve para podermos instanciar um objeto a partir de uma classe, o que vem depois do "new" é a classe que vou utilizar, o que vem antes do new é nome do objeto que vai existir

        dadosConta.informacaoConta();
        dadosConta.depositarConta();
        dadosConta.levantarConta();
        dadosConta.extratoConta();
        
        dadosConta.informacaoConta();
        dadosConta.depositarConta();
        dadosConta.levantarConta();
        dadosConta.extratoConta();
        
        dadosConta.informacaoConta();
        dadosConta.depositarConta();
        dadosConta.levantarConta();
        dadosConta.extratoConta();
        dadosConta.getNomeTitular();

	}

}
