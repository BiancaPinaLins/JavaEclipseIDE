package lista1;

import java.text.NumberFormat;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	public Funcionario (String n, Double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aumentarsalario(double percentual)
	{
		salario *= 1 + percentual/100;
	}
	public String formatarmoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	public void imprimir()
	{
		System.out.printf("\n" + nome + "\t\t" + salario);
	}
}
