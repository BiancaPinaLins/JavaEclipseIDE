package lista1;

import java.util.Scanner;

public class FemininoMasculino {

	public static void main(String[] args) {
		
		int idade, caracteristica, sexo, NumPessoas;
		int PessoasCalmas = 0;
		int MulheresNervosas = 0;
		int HomensAgressivos = 0;
		int PessoasNervosasmais40 = 0;
		int PessoasCalmasmenos18 = 0;
		int OutrosCalmos = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("*Pesquisa sobre características psicológicas*");
		NumPessoas = 150;
		while (NumPessoas != 0)
		{
			System.out.println("_____Idade_____");
			System.out.println("Digite sua idade :");
			idade = input.nextInt();
			input.nextLine();
			System.out.println("_____Sexo_____");
			System.out.println("1 - Feminino");
			System.out.println("2 - Masculino");
			System.out.println("3 - Outros");
			System.out.println("Digite o número correspondente ao seu sexo :");
			sexo = input.nextInt();
			input.nextLine();
			System.out.println("_____Características Psicológicas_____");
			System.out.println("1 - Pessoa Calma");
			System.out.println("2 - Pessoa nervosa");
			System.out.println("3 - Pessoa Agressiva");
			System.out.println("Digite o número correspondente à sua característica psicológica :");
			caracteristica = input.nextInt();
			NumPessoas -= 1;
			if (caracteristica == 1)
			{
				PessoasCalmas++;
			}
			if (caracteristica == 2 && sexo == 1)
			{
				MulheresNervosas++;
			}
			if (sexo==2 && caracteristica == 3)
			{
				HomensAgressivos++;
			}
			if (sexo ==3 && caracteristica == 1)
			{
				OutrosCalmos++;
			}
			if (idade > 40 && caracteristica == 2)
			{
				PessoasNervosasmais40++;
			}
			if (idade < 18 && caracteristica == 1)
			{
				PessoasCalmasmenos18++;
			}
			System.out.println("Na região há " + PessoasCalmas + " pessoas calmas." );
			System.out.println("Na região há " + MulheresNervosas + " mulheres nervosas." );
			System.out.println("Na região há " + HomensAgressivos + " homens agressivos." );
			System.out.println("Na região há " + OutrosCalmos + " pessoas autodeclaradas como 'outros' calmas." );
			System.out.println("Na região há " + PessoasNervosasmais40 + " pessoas nervosas com mais de 40 anos." );
			System.out.println("Na região há " + PessoasCalmasmenos18 + " pessoas calmas com menos de 18 anos." );
		}
		
		

	}

}
