package lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundos, minutos, horas,segundosDuracao;
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundosDuracao = leia.nextInt();
		
		horas = (segundosDuracao/3600);
		minutos = ((segundosDuracao - horas*3600)/60);
		segundos = (segundosDuracao%60);
		System.out.println("\nA duração do evento é de " + horas + "h " + minutos + "min " + segundos + "seg" + ".");
		
		

	}

}
