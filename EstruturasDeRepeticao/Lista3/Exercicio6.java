package lista1;

import java.util.Scanner;

public class NumeroDoWhile {

	public static void main(String[] args) {
		int Num, SomaNums = 0;
		Scanner input = new Scanner(System.in);
		do 
		{
		System.out.println("Digite um número :");
		Num = input.nextInt();
		SomaNums += Num;	
		}
		while (Num != 0);
		{
			System.out.println("A soma dos números é " + SomaNums);
		}
		
	}

}
