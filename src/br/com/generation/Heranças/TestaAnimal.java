package br.com.generation.Heranças;

public class TestaAnimal {

	public static void main(String[] args) {
		
		bichoPreguica preguica1 = new bichoPreguica();
		cachorro cachorro1 = new cachorro();
		cavalo cavalo1 = new cavalo();
		
		preguica1.setNome("Sid");
		preguica1.setIdade(6);
		preguica1.setEscalar("terminou de escalar a árvore");
		preguica1.setSom("E..s..t..o..u c..o..m s..o..n..o");
		cachorro1.setNome("Cora");
		cachorro1.setIdade(8);
		cachorro1.setCorrer("começou a correr ");
		cachorro1.setSom("Au au");
		cachorro1.setAmamentar("Depois ela vai amamentar os filhotes.");
		cavalo1.setNome("Búcefalo");
		cavalo1.setIdade(5);
		cavalo1.setCorrer("Começou a galopar");
		cavalo1.setAmamentar("Ele foi amamentado pela sua mãe.");
		cavalo1.setSom("Irrrrrí");
		
		
		
		System.out.print("O nome da preguiça é " + preguica1.getNome() + ", ela tem " + preguica1.getIdade() + " anos quando ela ");
		System.out.println(preguica1.getEscalar());
		System.out.println(preguica1.getNome() +" disse " + preguica1.getSom());
		System.out.println(preguica1.morarnafloresta(null)+ ".");
		System.out.print("O nome do cachorro é " + cachorro1.getNome() + ", ela tem " + cachorro1.getIdade() + " anos, quando ela ");
		System.out.print(cachorro1.getCorrer());
		System.out.println(cachorro1.getNome() +" fez " + cachorro1.getSom());
		System.out.print(cachorro1.brincar(null) + " e");
		System.out.println(" " + cachorro1.levarpassear(null));
		System.out.println(cachorro1.getAmamentar() + "\n" + cachorro1.levarpassear(null) + ".\n" + cachorro1.levarveterinario(null)+".");
		System.out.println("O nome do cavalo é " + cavalo1.getNome() + ", ele tem " + cavalo1.getIdade() + " anos, quando ele ");
		System.out.println(cavalo1.getCorrer());
		System.out.println(cavalo1.getNome() +" fez " + cavalo1.ObterSom() + ".\n" + cavalo1.alimentar(null) + ".\n" + cavalo1.levarveterinario(null));
		
	}

}
