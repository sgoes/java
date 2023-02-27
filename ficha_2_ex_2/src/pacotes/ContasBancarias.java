package pacotes;
import java.util.Scanner;

public class ContasBancarias {

    // ----------ATRIBUTOS ------------------ ATRIBUTOS ----------- ATRIBUTOS----------
    private String nomeTitular;
    private int nConta;
    double saldo = 0;
    int levantamento = 10;
    int deposito = 10;

    public ContasBancarias() {

        }

    //---------- METODOS --------------------- METODOS ----------------- METODOS----------

    // 1.º Metodo - vai receber os dados da conta inseridos pelo utilizador - chama-se "dadosConta"
    // o this aqui é utilizado para invocar o atributo
        public void informacaoConta () {
            Scanner lerString = new Scanner(System.in);
            Scanner lerInt = new Scanner(System.in);
            Scanner lerDouble = new Scanner(System.in);

            System.out.println("Insira o nome do titular: ");
            this.nomeTitular = lerString.nextLine();

            System.out.println("Insira o numero da conta: ");
            this.nConta = lerInt.nextInt();

            System.out.println("Insira o saldo da conta: ");
            this.saldo = lerDouble.nextDouble();
        } 
         
        public void depositarConta () {
	        Scanner lerString = new Scanner(System.in);
	        Scanner lerInt = new Scanner(System.in);
	        Scanner lerDouble = new Scanner(System.in);
            System.out.println("Insira o valor que pretende depositar: ");
            this.deposito = lerInt.nextInt();
            if(this.deposito >= 0) {
                this.saldo += deposito;
                System.out.println("O seu saldo atual é de: " + this.saldo + "€");
            }
        }
            
            
        public void levantarConta () {
        	Scanner lerInt = new Scanner(System.in);
            System.out.println("Insira o valor que pretende levantar: ");
            this.levantamento = lerInt.nextInt();
            if(this.saldo < this.levantamento)
            {
                System.out.println("O saldo da sua conta não pemite efetuar o respetivo levantamento.");
            } 
            else if (this.saldo >= this.levantamento) 
            {
                this.saldo -= this.levantamento;
                System.out.println("O saldo atual da sua conta é de: " + this.saldo);
            }
        }
            
            public void extratoConta () 
            {
            System.out.println("Dados conta:\n" + "Nome do titular: " + this.nomeTitular + "\n Numero de Conta: " + this.nConta + "\n Saldo atual: " + this.saldo);
            }

			public String getNomeTitular() {
				return nomeTitular;
			}

			public void setNomeTitular(String nomeTitular) {
				this.nomeTitular = nomeTitular;
			}

			public int getnConta() {
				return nConta;
			}

			public void setnConta(int nConta) {
				this.nConta = nConta;
			}
        }
