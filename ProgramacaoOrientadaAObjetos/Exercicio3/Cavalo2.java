package lista1;

public class Cavalo2 extends Animal2 {

	private boolean correr;
	public Cavalo2 (String nome, int idade, boolean correr)
	{
		super(nome,idade);
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
	public String getSom() {
		return("Som emitido pelo Cavalo:" + super.getSom());
	}
	

}
