package aula13PolimorfismoSobrecarga;

public class TesteAnimal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		
		m.emitirSom();
		l.emitirSom();
		c.emitirSom();
		
		System.out.println("\n");
		
		c.reagir("Olá");
		c.reagir("hello");
		System.out.println("\n");
		c.reagir(18, 15);
		c.reagir(11, 13);
		c.reagir(13, 12);
		System.out.println("\n");
		c.reagir(true);
		c.reagir(false);
		System.out.println("\n");
		c.reagir(4, 7.5f);
		c.reagir(3, 12f);
		c.reagir(6, 8f);
		c.reagir(7, 15.2f);

	}

}
