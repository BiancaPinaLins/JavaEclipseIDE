package lista1;

public class Preguica2 extends Animal2{

	private boolean subirEmArvores;
	
	public Preguica2 (String nome, int idade,boolean subirEmArvores)
	{
		super(nome,idade);
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
		System.out.println("\n======Perfil da Preguiça======\n" + "\nNome: " + getNome()+"\nIdade: " + getIdade()
		+ "\nSom: " + getSom());
	}
	public void imprimirmov()
	{
		if( isSubirEmArvores() == true)
		{
			System.out.println("Este animal consegue subir em árvores.");
		}
	}
	public String getSom() {
		return("Som emitido pela Preguiça:" + super.getSom());
	}




}
