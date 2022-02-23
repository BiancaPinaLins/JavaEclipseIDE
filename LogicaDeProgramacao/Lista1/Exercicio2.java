package lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/(3+5+2);
		
		System.out.println("A média final do aluno é de " + media);

	}

}
