package lista1;

import java.util.Scanner;

public class imparPar {

	public static void main(String[] args) {
		
		double num, res;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Digite um número : ");
		num = input.nextInt();
		
		if(num % 2 == 0)
		{
			res = Math.sqrt(num);
			System.out.printf("O número digitado é par e o resultado da sua raiz quadrada é %.2f ", res);
		}
		else 
		{
			res = Math.pow(num, 2);
			System.out.printf("O número digitado é ímpar e o resultado do número elevado ao quadrado é %.2f ", res);
		}
		
	}

}
