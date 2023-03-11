package pacotes;

public class Aula_34_vetores_multidi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[][] x = new double[3][3];
		
		// Para acessar cada membro de um vetor
		
		/*x[0][0]=10;
		x[0][1]= 11;
		x[0][2]=12;

		x[1][0]=14;
		x[1][1]= 15;
		x[1][2]=16;
	
		x[2][0]=18;
		x[2][1]= 19;
		x[2][2]=20;*/
		
		double[][] x = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		
		
		for(int i = 0; i < x.length; ++i) {
			for(int j = 0; j < x[i].length; ++j) {
				System.out.println(i + "|" + j + "=" + x[i][j] + "\t" );
			}
			System.out.println("\n");
		}
		
	}

}
