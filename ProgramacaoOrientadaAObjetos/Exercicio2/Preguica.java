package lista1;

public class Preguica extends Animal{
	
	private boolean subirEmArvores;
	
	public Preguica (String nome, String som, int idade,boolean subirEmArvores)
	{
		super(nome,som,idade);
		this.subirEmArvores = subirEmArvores;
	}
	public boolean isSubirEmArvores() {
		return subirEmArvores;
	}
	public void setSubir_em_arvores(boolean subirEmArvores) {
		this.subirEmArvores = subirEmArvores;
	}
	public void imprimir()
	{
		System.out.println("\n======Perfil da Pregui�a======\n" + "\nNome: " + getNome()+"\nIdade: " + getIdade()
		+ "\nSom: " + getSom());
	}
	public void imprimirmov()
	{
		if( isSubirEmArvores() == true)
		{
			System.out.println("Este animal consegue subir em �rvores.");
		}
	}

}
