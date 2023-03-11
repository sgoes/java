package pacotes;

public class Aula_32_pt_3_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int[] x = new int[10];
		
		java.util.Arrays.fill(x,20); // tenho que informar sempre os valores, o primeiro valor a colocar entre parentises é o meu vetor neste caso x e valor que quero que apareça dentro do meu vetor, neste caso 20
		
		for(i = 0; i < x.length; ++i) {
			System.out.println(x[i]);
		}
		

	}

}
