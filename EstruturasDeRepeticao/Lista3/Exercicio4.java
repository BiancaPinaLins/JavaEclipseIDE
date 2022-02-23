package lista1;

import java.util.Scanner;

public class MultiploDoWhile {

	public static void main(String[] args) {
		

		int Num, SomaNums = 0, Counter = 0;
		float Media;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número :");
		Num = input.nextInt();
		
		do 
		{
			if (Num == 0)
			{
				System.out.println("Saindo do sistema ");
			}
			else  
			{
				if (Num % 3 == 0)
				{	
				SomaNums += Num;
			    Counter++;
				}
				System.out.println("Digite um número :");
				Num = input.nextInt();
			}
		}
		while (Num != 0);
		if (Counter == 0)
		{
			System.out.println("Não pode dividir por zero");
		}
		Media = SomaNums/Counter;
		System.out.printf("A média dos números multiplos de 3 é  %.2f", Media);
		
	}

}
