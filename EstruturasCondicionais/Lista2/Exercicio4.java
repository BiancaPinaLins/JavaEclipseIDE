package lista1;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		a = input.nextInt();
		input.nextLine();
		System.out.println("Digite o segundo valor: ");
		b = input.nextInt();
		input.nextLine();
		System.out.println("Digite o terceiro valor: ");
		c = input.nextInt();
		
		if(a <= b && b <= c)
		{
			System.out.println("A ordem crescente dos n�meros �: "+ a + " -> " + b + " -> " + c);
		}
		else if (a <= c && c <= b)
		{
			System.out.println("A ordem crescente dos n�meros �: " + a + " -> "+ c + " -> "+ b);
		}
		else if (b <= a && a <= c)
		{
			System.out.println("A ordem crescente dos n�meros �: " + a + " -> "+ b + " -> "+ c);
		}
		else if (b <= c && c <= a)
		{
			System.out.println("A ordem crescente dos n�meros �: "+ b + " -> "+ c + " -> "+ a);
		}
		else if (c <= a && a <= b)
		{
			System.out.println("A ordem crescente dos n�meros �: "+ c + " ->"+ a + " -> " + b);
		}
		else
		{
			System.out.println("A ordem crescente dos n�meros �: " +  c + " -> " + b + " -> " + a);
		}
		
		
		
		
	}

}
