package lista1;

import java.util.Scanner;

public class NumeroDoWhile {

	public static void main(String[] args) {
		int Num, SomaNums = 0;
		Scanner input = new Scanner(System.in);
		do 
		{
		System.out.println("Digite um n�mero :");
		Num = input.nextInt();
		SomaNums += Num;	
		}
		while (Num != 0);
		{
			System.out.println("A soma dos n�meros � " + SomaNums);
		}
		
	}

}
