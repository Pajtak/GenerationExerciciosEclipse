package br.com.generation.Heran�as;

public class TestaAnimal {

	public static void main(String[] args) {
		
		bichoPreguica preguica1 = new bichoPreguica();
		cachorro cachorro1 = new cachorro();
		cavalo cavalo1 = new cavalo();
		
		preguica1.setNome("Sid");
		preguica1.setIdade(6);
		preguica1.setEscalar("terminou de escalar a �rvore");
		cachorro1.setNome("Cora");
		cachorro1.setIdade(8);
		cachorro1.setCorrer("Come�ou a correr");
		cavalo1.setNome("B�cefalo");
		cavalo1.setIdade(5);
		cavalo1.setCorrer2("Come�ou a galopar");
		
		
		System.out.print("O nome da pregui�a � " + preguica1.getNome() + ", ela tem " + preguica1.getIdade() + " anos quando ela ");
		System.out.println(preguica1.getEscalar());
		System.out.println(preguica1.getNome() +" disse " + preguica1.getSom());
		System.out.print("O nome do cachorro � " + cachorro1.getNome() + ", ela tem " + cachorro1.getIdade() + " anos, quando ela ");
		System.out.println(cachorro1.getCorrer());
		System.out.println(cachorro1.getNome() +" fez " + cachorro1.getSom2());
		System.out.print("O nome do cavalo � " + cavalo1.getNome() + ", ele tem " + cavalo1.getIdade() + " anos, quando ele ");
		System.out.println(cavalo1.getCorrer2());
		System.out.println(cavalo1.getNome() +" fez " + cavalo1.getSom3());


	}

}
