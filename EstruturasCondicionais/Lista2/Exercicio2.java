package lista1;

import java.util.Scanner;

public class imparPar {

	public static void main(String[] args) {
		
		double num, res;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Digite um n�mero : ");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			res = Math.sqrt(num);
			System.out.printf("O n�mero digitado � par e o resultado da sua raiz quadrada � %.2f ", res);
		}
		else 
		{
			res = Math.pow(num, 2);
			System.out.printf("O n�mero digitado � �mpar e o resultado do n�mero elevado ao quadrado � %.2f ", res);
		}
		
	}

}
