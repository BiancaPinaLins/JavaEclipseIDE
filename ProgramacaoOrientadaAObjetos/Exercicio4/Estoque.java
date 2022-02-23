package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	public static void main (String[] args) {
		int func;
		Scanner leia = new Scanner (System.in);
		ArrayList<String> estoque = new ArrayList<String>();
		do
		{
			System.out.println("\t\tOperações");
			System.out.println("\n(1)Deseja armazenar um produto no estoque?");
			System.out.println("\n(2)Deseja remover um produto no estoque?");
			System.out.println("\n(3)Deseja atualizar um produto no estoque?");
			System.out.println("\n(4)Deseja mostrar os produtos na lista?");
			System.out.println("\n(0)Deseja sair do programa?");
			System.out.println("\nEscolha uma operação:");
			func=leia.nextInt();
			switch(func)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto a ser adicionado :");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto a ser removido :");
				String produtor = leia.nextLine();
				if(estoque.contains(produtor))
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque");
				}
				break;
			case 3 :
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar :");
				String verifica = leia.nextLine();
				System.out.println("\nDigite");
				String novo = leia.nextLine();
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
					
				}
				else
				{
					System.out.println("\nProduto não existe");
				}
				System.out.println(estoque);
			case 4:
				System.out.println("\nMostrar os produtos do estoque: ");
				System.out.println(estoque);
				break;
			}
			
		}while (func!=0);
	}

}
