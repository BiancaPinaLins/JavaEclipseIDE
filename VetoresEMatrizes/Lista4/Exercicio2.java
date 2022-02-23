package lista1;

import java.util.Scanner;

public class MatrizMaior10 {

	public static void main(String[] args) {
		
		int[][] num = new int [3][3];
		int coluna,linha,counter=0;
		Scanner input = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				
				System.out.println("Digite um número :");
				num[linha][coluna] = input.nextInt();
				
				if (num[linha][coluna] > 10)
				{
					counter++;
				}
				
		    }
		}

		System.out.println("Foram digitados " + counter + " número(s) maiores do que 10.");
	}  

}
