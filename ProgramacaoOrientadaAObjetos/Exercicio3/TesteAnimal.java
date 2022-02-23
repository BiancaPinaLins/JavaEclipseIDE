package lista1;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Cavalo2 cavalo = new Cavalo2 ("Peão",1,true);
			cavalo.setSom("uhu");
			
			Preguica2 preguica = new Preguica2 ("Mel",1,true);
			preguica.setSom("aaaa");
			
			Cachorro2 cachorro = new Cachorro2 ("Choco",1,true);
			cachorro.setSom("aeeee");
			
			Animal2[] animal = new Animal2[3];
			animal[0] = cachorro;
			animal[1] = cavalo;
			animal[2] = preguica;
			
			for(Animal2 ani:animal) {
				System.out.println(ani.getSom());
			}
			
			
	}

}
