package lista1;

import java.util.Scanner;

public class Vetor6Inteiros {

	public static void main(String[] args) {
		
		int[] lista = new int[6];
		int x, SomaPar=0, ContImpar=0, num;
		
		
		Scanner input  = new Scanner (System.in);
		
		for (x=0;x<6;x++)
		{
			
			System.out.println("Digite um n�mero :");
			num= input.nextInt();
			lista[x]=num;
			if (lista[x] % 2 == 0)
			{
				
				SomaPar += lista[x];
				
			}
			
			else
			{
				ContImpar++;
			}
		}
		
		System.out.println("O resultado da soma dos n�meros pares digitados � " + SomaPar);
		System.out.println("Foram digitados " + ContImpar +" n�meros �mpares.");
		
		System.out.println("Foram digitados os seguintes n�meros pares :");
		for (x=0;x<6;x++)
		{
			if (lista[x] % 2 == 0)
			{
				System.out.println(lista[x]);
			}
		}
		
		System.out.println("Foram digitados os seguintes n�meros �mpares :");
		for (x=0;x<6;x++)
		{
			if (lista[x] % 2 != 0)
			{
				System.out.println(lista[x]);
			}
		}
		

	}

}
