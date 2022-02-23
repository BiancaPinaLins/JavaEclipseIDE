package lista1;

public class Cachorro extends Animal{

private boolean correr;
	
	public Cachorro (String nome, String som, int idade, boolean correr)
	{
		super(nome,som,idade);
		this.correr = correr;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	public void imprimir()
	{
		System.out.println("\n======Perfil do Cachorro======\n" + "\nNome: " + getNome() + "\nIdade: " + getIdade()
		+ "\nSom: " + getSom());
	}
	public void imprimirmov()
	{
		if( isCorrer() == true)
		{
			System.out.println("Este animal pode correr");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
