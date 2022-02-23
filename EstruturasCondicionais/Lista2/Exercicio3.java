package lista1;

import java.util.Scanner;

public class maiorDeTres {

	public static void main(String[] args) {
		
		int a,b,c, maiorNumero;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = input.nextInt();
		input.nextLine();
		System.out.println("Digite o segundo valor: ");
		b = input.nextInt();
		input.nextLine();
		System.out.println("Digite o terceiro valor: ");
		c = input.nextInt();
		
		maiorNumero = a;
		if (b > maiorNumero)
		{
			maiorNumero = b;
		}
		if (c > maiorNumero)
		{
			maiorNumero = c;
		}
		System.out.println("O maior número entre os três digitados é " + maiorNumero);
	}

}
