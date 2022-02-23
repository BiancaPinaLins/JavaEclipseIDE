package lista1;

public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro1 = new Cachorro ("Pipoca","Auau",4,true);
		Preguica preguica1 = new Preguica("Maria","uhuhu", 5, true);
		Cavalo cavalo1 = new Cavalo("Zé","ihuhu", 7, true);
		
		cachorro1.imprimir();
		cachorro1.imprimirmov();
		
		preguica1.imprimir();
		preguica1.imprimirmov();
		
		cavalo1.imprimir();
		cavalo1.imprimirmov();
		
		
	}

}
