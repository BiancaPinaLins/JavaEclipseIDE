package lista1;

import java.util.Scanner;

public class ImparPar10 {

	public static void main(String[] args) {
		
		int Num, CounterPar = 0, CounterImpar = 0, x;
		Scanner input = new Scanner(System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite um n�mero : ");
			Num = input.nextInt();
			if (Num % 2 == 0)
			{
				CounterPar++;
			}
			else 
			{
				CounterImpar++;
			}
			continue;
		}
		
		System.out.println("Foram digitados " + CounterImpar + " n�meros �mpares.");
		System.out.println("Foram digitados " + CounterPar + " n�meros pares.");
	}

}
