package pacotes;

public class Aula_15_calcular_horario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMiliSegundos = System.currentTimeMillis(); // método qe retorna para nos a quantidade de milisegundos que passaram deste a data do sistema
		// a cada 1000 milisegundos forma um segundo
		
		// como é que converto a variavel de milisegundos para segundos
		long totalSegundos = totalMiliSegundos / 1000; // quantidade de segundos que se passaram desde o inicio da data do sistema
		
		// agora o que quero calcular são os segundos atuais
		long segundoAtual = totalSegundos % 60;
		
		// agora vamos para os minutos
		long totalMinutos = totalSegundos / 60; // so que isto vai corresponder o total de minutos desde 1970
		
		//agora tenho de extrair a sobra da divisão to totalMinutos por 60
		long minutoAtual = totalMinutos % 60;
		
		long totalHora = totalMinutos / 60;
		long horaAtual = totalHora % 24;
		
		
		System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual );
		

	}

}
