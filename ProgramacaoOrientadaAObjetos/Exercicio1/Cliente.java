package lista1;

import java.util.Scanner;

public class Cliente {
	
		Scanner ler =new Scanner (System.in);
		double p,pt;
		
		private String nomeCliente;
		private String cpfCliente;
		
		public Cliente (String nomeCliente, String cpfCliente)
		{
			this.nomeCliente = nomeCliente;
			this.cpfCliente = cpfCliente;
		}

		public double getP() {
			return p;
		}

		public void setP(double p) {
			this.p = p;
		}

		public double getPt() {
			return pt;
		}

		public void setPt(double pt) {
			this.pt = pt;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public String getCpfCliente() {
			return cpfCliente;
		}

		public void setCpfCliente(String cpfCliente) {
			this.cpfCliente = cpfCliente;
		}
	
		public double valor (double pt)
		{
			System.out.println("O valor de cada produto deve ser inserido separadamente "
					+ "\n Para finalizar digite 0 ");
			do
			{
				System.out.println("Digite o valor : ");
				p=ler.nextDouble();
				pt = p + pt;
				return pt;
			}while(p>0.0);
			
		}
		public String getInfo()
		{
			String Info = nomeCliente + "\t\t" + cpfCliente;
			return Info;
		}
		public void total()
		{
			System.out.printf("\nTotal:%.2f", valor(0.0));
		}
	
	
	
	
	
	
	
}
