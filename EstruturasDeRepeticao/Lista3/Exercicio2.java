package lista1;

import java.util.Scanner;

public class IdadeWhile {

	public static void main(String[] args) {
		int idade, PessoasMenos21 = 0, PessoasMais50 = 0;
		Scanner input = new Scanner (System.in);

		System.out.println("Digite sua idade:");
		idade = input.nextInt();
		while (idade != -99)
		{
			if (idade < 21)
			{
				PessoasMenos21++;
			}
			if (idade > 50)
			{
				PessoasMais50++;
			}
			System.out.println("Digite sua idade:");
			idade = input.nextInt();
		}
		System.out.println("O total do n�mero de pessoas com menos de 21 anos � de " + PessoasMenos21);
		System.out.println("O total do n�mero de pessoas com mais de 50 anos � de " + PessoasMais50);	
	}

}
