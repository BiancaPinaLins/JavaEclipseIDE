package lista1;

public class Vetor6 {

	public static void main(String[] args) {
		int A[]= {1,0,5,-2,-5,7};
		int x, B;
		
		B = A[0] + A[1] + A[5]; 
		
		System.out.println("O resultado da soma dos vetores A[0] + A[1] + A[5] é " + B);
		
		A[4]=100;
		
		System.out.println("Valores atualizados do Vetor A:");
		
		for (x=0;x<5;x++)
		{
			System.out.println("Vetor [" + x +"]" + " = " + A[x]);
		}
	}

}
