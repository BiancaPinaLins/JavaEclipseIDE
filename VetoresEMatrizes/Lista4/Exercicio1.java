package lista1;

import java.util.Scanner;

public class Matriz2x2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][] Matriz1 = new float [2][2];
		float[][] Matriz2 = new float [2][2];
		float[][] MatrizSoma = new float[2][2]; 
		float[][] MatrizSub = new float[2][2];
		float[][] i = new float[2][2];
		float[][] MatrizI1 = new float [2][2];
		float[][] MatrizI2 = new float [2][2];
		int coluna,linha,x;
		
		i[0][0] = 2;
		i[1][1] = 2;
		i[1][0] = 2;
		i[0][1] = 2;
		
		
		Scanner input = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite o valores da matriz M1:");
				Matriz1[linha][coluna] = input.nextFloat();
			}
		}
		
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite o valores da matriz M2:");
				Matriz2[linha][coluna] = input.nextFloat();
			}
 	    }
		
		System.out.println("________Opções________");
		System.out.println("(1) somar as duas matrizes");
		System.out.println("(2) subtrair a primeira matriz da segunda");
		System.out.println("(3) adicionar uma constante as duas matrizes");
		System.out.println("(4) imprimir as matrizes");
		System.out.println("Escolha uma opção: ");
		x = input.nextInt();
		
		if (x == 1)
		{
			System.out.println("Resultado da Matriz 1 + Matriz 2 :");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					MatrizSoma [linha][coluna] = Matriz1 [linha][coluna] + Matriz2 [linha][coluna];			
				}
			}
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					
					System.out.printf("\t %.2f \t" ,MatrizSoma[linha][coluna]);
				}
			}
		}
		else if (x == 2)
		{
			System.out.println("Resultado da Matriz 1 - Matriz 2 :");
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					MatrizSub [linha][coluna] = Matriz1 [linha][coluna] - Matriz2 [linha][coluna];
				}
			}
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					
					System.out.printf("\t %.2f \t" , MatrizSub[linha][coluna]);
				}
			}
		}
		else if (x == 3)
		{
			System.out.println("Matriz 1 com adição da constante i = 2 :");
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					MatrizI1[linha][coluna] = Matriz1[linha][coluna]+i[linha][coluna];
				}
			}
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					
					System.out.printf("\t %.2f \t", MatrizI1[linha][coluna]);
				}
			
			}
			System.out.println("\nMatriz 2 com adição da constante i = 2 :");
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					MatrizI2[linha][coluna] = Matriz2[linha][coluna]+i[linha][coluna];
				}
			}
			
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					
					System.out.printf("\t %.2f \t", MatrizI2[linha][coluna]);
				}
			}
		}
		else if (x == 4)
		{
			System.out.println("Matriz 1:");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					
					System.out.printf("\t %.2f \t" , Matriz1[linha][coluna]);
				}
			}
			
			System.out.println("Matriz 2:");
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					
					System.out.printf( "\t %.2f \t" , Matriz2[linha][coluna]);
				}
			}
		}
		else 
		{
			System.out.println("Opção inválida.");
		}
			
			
	}
		
}
