package lista1;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double A,B,C,D,E,F,X,Y;
		
		System.out.println("Digite o coeficiente A: ");
		A = leia.nextFloat();
		
		System.out.println("\nDigite o coeficiente B: ");
		B = leia.nextFloat();
		
		System.out.println("\nDigite o coeficiente C: ");
		C = leia.nextFloat();
		
		System.out.println("\nDigite o coeficiente D: ");
		D = leia.nextFloat();
		
		System.out.println("\nDigite o coeficiente E: ");
		E = leia.nextFloat();
		
		System.out.println("\nDigite o coeficiente F: ");
		F = leia.nextFloat();
		
		X = ( (C*E)-(B*F) ) / ( (A*E)-(B*D) );
		
		Y =( (A*F)-(C*A) ) / ( (A*E)-(B*D) );
		
		System.out.println("\nO valor de X é " + X );
		System.out.println("\nO valor de Y é " + Y );

	}

}
