package aula12PolimorfismoSobreposicao;

public class CriacaoAnimal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Canguru  c = new Canguru();
		Cachorro k = new Cachorro();
		
		
		m.setPeso(5.70f);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		System.out.println("\n");
		c.setPeso(55.70f);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
		System.out.println("\n");
		k.setPeso(25.70f);
		k.setIdade(1);
		k.setMembros(4);
		k.locomover();
		k.alimentar();
		k.emitirSom();
		k.enterrarOsso();
		k.abanarRabo();



	}

}
